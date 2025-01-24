package br.com.carlosrodrigues.web.controller.produtos_controllers;

import br.com.carlosrodrigues.core.enums.enums_produtos.Boleano;
import br.com.carlosrodrigues.core.enums.enums_produtos.QuantidadePortas;
import br.com.carlosrodrigues.core.models.models_produtos.*;
import br.com.carlosrodrigues.web.dto.dto_produtos.*;
import br.com.carlosrodrigues.web.dto.mensagens.FlashMessage;
import br.com.carlosrodrigues.web.service.produtos_service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("admin/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    private <T> ModelAndView listarProdutos(Class<T> produtoClass, String viewName, String listaName) {
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject(listaName, service.mostrarTodos(produtoClass));
        return modelAndView;
    }

    private <T> String cadastrarProduto(@Valid @ModelAttribute("form") Object form, BindingResult result,
                                        RedirectAttributes attrs, Class<T> produtoClass, String redirectUrl, String successMessage) {
        if (result.hasErrors()) {
            return "admin/produtos/formularios/form" + produtoClass.getSimpleName();
        }

        service.cadastrar(form, produtoClass);
        attrs.addFlashAttribute("alert", new FlashMessage("alert-success", successMessage));
        return "redirect:" + redirectUrl;
    }

    private <T> ModelAndView editarProduto(@PathVariable Long id, Class<T> produtoClass, String formViewName, String formName) {
        ModelAndView modelAndView = new ModelAndView(formViewName);
        modelAndView.addObject(formName, service.buscarPorId(id, produtoClass));
        return modelAndView;
    }

    private <T> String atualizarProduto(@Valid @ModelAttribute("form") Object form, @PathVariable Long id, BindingResult result,
                                        RedirectAttributes attrs, Class<T> produtoClass, String redirectUrl, String successMessage) {
        if (result.hasErrors()) {
            return "admin/produtos/formularios/form" + produtoClass.getSimpleName();
        }

        service.editar(form, id, produtoClass);
        attrs.addFlashAttribute("alert", new FlashMessage("alert-success", successMessage));
        return "redirect:" + redirectUrl;
    }

    private <T> String excluirProduto(@PathVariable Long id, Class<T> produtoClass, String redirectUrl, RedirectAttributes attrs) {
        service.excluir(id, produtoClass);
        attrs.addFlashAttribute("alert", new FlashMessage("alert-success", "Produto excluído com sucesso"));
        return "redirect:" + redirectUrl;
    }

    // Conversiveis

    @GetMapping("/listaConversiveis")
    public ModelAndView mostrarTodosConversiveis() {
        return listarProdutos(Conversiveis.class, "admin/produtos/listas/listaConversiveis", "listaConversiveis");
    }

    @GetMapping("/cadastrarConversiveis")
    public ModelAndView cadastrarConversiveis() {
        var modelAndView = new ModelAndView("admin/produtos/formularios/formConversiveis");
        modelAndView.addObject("formConversiveis", new ConversiveisForm());
        return modelAndView;
    }

    @PostMapping("/cadastrarConversiveis")
    public String cadastrarConversiveis(@Valid @ModelAttribute("formConversiveis") ConversiveisForm form,
                                        BindingResult result,
                                        RedirectAttributes attrs) {
        return cadastrarProduto(form, result, attrs, Conversiveis.class, "/admin/produtos/listaConversiveis", "Produto cadastrado com sucesso");
    }

    @GetMapping("/{id}/editarConversiveis")
    public ModelAndView editarConversiveis(@PathVariable Long id) {
        return editarProduto(id, Conversiveis.class, "admin/produtos/formularios/formConversiveis", "formConversiveis");
    }

    @PostMapping("/{id}/editarConversiveis")
    public String editarConversiveis(@Valid @ModelAttribute("formConversiveis") ConversiveisForm form,
                                     @PathVariable Long id,
                                     BindingResult result,
                                     RedirectAttributes attrs) {
        return atualizarProduto(form, id, result, attrs, Conversiveis.class, "/admin/produtos/listaConversiveis", "Produto editado com sucesso");
    }

    @GetMapping("/{id}/excluirConversiveis")
    public String excluirConversiveis(@PathVariable Long id, RedirectAttributes attrs) {
        return excluirProduto(id, Conversiveis.class, "/admin/produtos/listaConversiveis", attrs);
    }

    // SUVs

    @GetMapping("/listaSUVs")
    public ModelAndView mostrarTodosSUVs() {
        return listarProdutos(SUVs.class, "admin/produtos/listas/listaSUVs", "listaSUVs");
    }

    @GetMapping("/cadastrarSUVs")
    public ModelAndView cadastrarSUVs() {
        var modelAndView = new ModelAndView("admin/produtos/formularios/formSUVs");
        modelAndView.addObject("formSUVs", new SUVsForm());
        return modelAndView;
    }

    @PostMapping("/cadastrarSUVs")
    public String cadastrarSUVs(@Valid @ModelAttribute("formSUVs") SUVsForm form,
                                BindingResult result,
                                RedirectAttributes attrs) {
        return cadastrarProduto(form, result, attrs, SUVs.class, "/admin/produtos/listaSUVs", "Produto cadastrado com sucesso");
    }

    @GetMapping("/{id}/editarSUVs")
    public ModelAndView editarSUVs(@PathVariable Long id) {
        return editarProduto(id, SUVs.class, "admin/produtos/formularios/formSUVs", "formSUVs");
    }

    @PostMapping("/{id}/editarSUVs")
    public String editarSUVs(@Valid @ModelAttribute("formSUVs") SUVsForm form,
                             @PathVariable Long id,
                             BindingResult result,
                             RedirectAttributes attrs) {
        return atualizarProduto(form, id, result, attrs, SUVs.class, "/admin/produtos/listaSUVs", "Produto editado com sucesso");
    }

    @GetMapping("/{id}/excluirSUVs")
    public String excluirSUVs(@PathVariable Long id, RedirectAttributes attrs) {
        return excluirProduto(id, SUVs.class, "/admin/produtos/listaSUVs", attrs);
    }

    // Coupees

    @GetMapping("/listaCoupees")
    public ModelAndView mostrarTodosCoupees() {
        return listarProdutos(Coupees.class, "admin/produtos/listas/listaCoupees", "listaCoupees");
    }

    @GetMapping("/cadastrarCoupees")
    public ModelAndView cadastrarCoupees() {
        var modelAndView = new ModelAndView("admin/produtos/formularios/formCoupees");
        modelAndView.addObject("formCoupees", new CoupeesForm());
        return modelAndView;
    }

    @PostMapping("/cadastrarCoupees")
    public String cadastrarCoupees(@Valid @ModelAttribute("formCoupees") CoupeesForm form,
                                   BindingResult result,
                                   RedirectAttributes attrs) {
        return cadastrarProduto(form, result, attrs, Coupees.class, "/admin/produtos/listaCoupees", "Produto cadastrado com sucesso");
    }

    @GetMapping("/{id}/editarCoupees")
    public ModelAndView editarCoupees(@PathVariable Long id) {
        return editarProduto(id, Coupees.class, "admin/produtos/formularios/formCoupees", "formCoupees");
    }

    @PostMapping("/{id}/editarCoupees")
    public String editarCoupees(@Valid @ModelAttribute("formCoupees") CoupeesForm form,
                                @PathVariable Long id,
                                BindingResult result,
                                RedirectAttributes attrs) {
        return atualizarProduto(form, id, result, attrs, Coupees.class, "/admin/produtos/listaCoupees", "Produto editado com sucesso");
    }

    @GetMapping("/{id}/excluirCoupees")
    public String excluirCoupees(@PathVariable Long id, RedirectAttributes attrs) {
        return excluirProduto(id, Coupees.class, "/admin/produtos/listaCoupees", attrs);
    }

    // Esportivos

    @GetMapping("/listaEsportivos")
    public ModelAndView mostrarTodosEsportivos() {
        return listarProdutos(Esportivos.class, "admin/produtos/listas/listaEsportivos", "listaEsportivos");
    }

    @GetMapping("/cadastrarEsportivos")
    public ModelAndView cadastrarEsportivos() {
        var modelAndView = new ModelAndView("admin/produtos/formularios/formEsportivos");
        modelAndView.addObject("formEsportivos", new EsportivosForm());
        return modelAndView;
    }

    @PostMapping("/cadastrarEsportivos")
    public String cadastrarEsportivos(@Valid @ModelAttribute("formEsportivos") EsportivosForm form,
                                      BindingResult result,
                                      RedirectAttributes attrs) {
        return cadastrarProduto(form, result, attrs, Esportivos.class, "/admin/produtos/listaEsportivos", "Produto cadastrado com sucesso");
    }

    @GetMapping("/{id}/editarEsportivos")
    public ModelAndView editarEsportivos(@PathVariable Long id) {
        return editarProduto(id, Esportivos.class, "admin/produtos/formularios/formEsportivos", "formEsportivos");
    }

    @PostMapping("/{id}/editarEsportivos")
    public String editarEsportivos(@Valid @ModelAttribute("formEsportivos") EsportivosForm form,
                                   @PathVariable Long id,
                                   BindingResult result,
                                   RedirectAttributes attrs) {
        return atualizarProduto(form, id, result, attrs, Esportivos.class, "/admin/produtos/listaEsportivos", "Produto editado com sucesso");
    }

    @GetMapping("/{id}/excluirEsportivos")
    public String excluirEsportivos(@PathVariable Long id, RedirectAttributes attrs) {
        return excluirProduto(id, Esportivos.class, "/admin/produtos/listaEsportivos", attrs);
    }

    // Eletricos

    @GetMapping("/listaEletricos")
    public ModelAndView mostrarTodosEletricos() {
        return listarProdutos(Eletricos.class, "admin/produtos/listas/listaEletricos", "listaEletricos");
    }

    @GetMapping("/cadastrarEletricos")
    public ModelAndView cadastrarEletricos() {
        var modelAndView = new ModelAndView("admin/produtos/formularios/formEletricos");
        modelAndView.addObject("formEletricos", new EletricosForm());
        return modelAndView;
    }

    @PostMapping("/cadastrarEletricos")
    public String cadastrarEletricos(@Valid @ModelAttribute("formEletricos") EletricosForm form,
                                     BindingResult result,
                                     RedirectAttributes attrs) {
        return cadastrarProduto(form, result, attrs, Eletricos.class, "/admin/produtos/listaEletricos", "Produto cadastrado com sucesso");
    }

    @GetMapping("/{id}/editarEletricos")
    public ModelAndView editarEletricos(@PathVariable Long id) {
        return editarProduto(id, Eletricos.class, "admin/produtos/formularios/formEletricos", "formEletricos");
    }

    @PostMapping("/{id}/editarEletricos")
    public String editarEletricos(@Valid @ModelAttribute("formEletricos") EletricosForm form,
                                  @PathVariable Long id,
                                  BindingResult result,
                                  RedirectAttributes attrs) {
        return atualizarProduto(form, id, result, attrs, Eletricos.class, "/admin/produtos/listaEletricos", "Produto editado com sucesso");
    }

    @GetMapping("/{id}/excluirEletricos")
    public String excluirEletricos(@PathVariable Long id, RedirectAttributes attrs) {
        return excluirProduto(id, Eletricos.class, "/admin/produtos/listaEletricos", attrs);
    }

    // Minivans

    @GetMapping("/listaMinivans")
    public ModelAndView mostrarTodosMinivans() {
        return listarProdutos(Minivans.class, "admin/produtos/listas/listaMinivans", "listaMinivans");
    }

    @GetMapping("/cadastrarMinivans")
    public ModelAndView cadastrarMinivans() {
        var modelAndView = new ModelAndView("admin/produtos/formularios/formMinivans");
        modelAndView.addObject("formMinivans", new MinivansForm());
        return modelAndView;
    }

    @PostMapping("/cadastrarMinivans")
    public String cadastrarMinivans(@Valid @ModelAttribute("formMinivans") MinivansForm form,
                                    BindingResult result,
                                    RedirectAttributes attrs) {
        return cadastrarProduto(form, result, attrs, Minivans.class, "/admin/produtos/listaMinivans", "Produto cadastrado com sucesso");
    }

    @GetMapping("/{id}/editarMinivans")
    public ModelAndView editarMinivans(@PathVariable Long id) {
        return editarProduto(id, Minivans.class, "admin/produtos/formularios/formMinivans", "formMinivans");
    }

    @PostMapping("/{id}/editarMinivans")
    public String editarMinivans(@Valid @ModelAttribute("formMinivans") MinivansForm form,
                                 @PathVariable Long id,
                                 BindingResult result,
                                 RedirectAttributes attrs) {
        return atualizarProduto(form, id, result, attrs, Minivans.class, "/admin/produtos/listaMinivans", "Produto editado com sucesso");
    }

    @GetMapping("/{id}/excluirMinivans")
    public String excluirMinivans(@PathVariable Long id, RedirectAttributes attrs) {
        return excluirProduto(id, Minivans.class, "/admin/produtos/listaMinivans", attrs);
    }

    // Picapes

    @GetMapping("/listaPicapes")
    public ModelAndView mostrarTodosPicapes() {
        return listarProdutos(Picapes.class, "admin/produtos/listas/listaPicapes", "listaPicapes");
    }

    @GetMapping("/cadastrarPicapes")
    public ModelAndView cadastrarPicapes() {
        var modelAndView = new ModelAndView("admin/produtos/formularios/formPicapes");
        modelAndView.addObject("formPicapes", new PicapesForm());
        return modelAndView;
    }

    @PostMapping("/cadastrarPicapes")
    public String cadastrarPicapes(@Valid @ModelAttribute("formPicapes") PicapesForm form,
                                   BindingResult result,
                                   RedirectAttributes attrs) {
        return cadastrarProduto(form, result, attrs, Picapes.class, "/admin/produtos/listaPicapes", "Produto cadastrado com sucesso");
    }

    @GetMapping("/{id}/editarPicapes")
    public ModelAndView editarPicapes(@PathVariable Long id) {
        return editarProduto(id, Picapes.class, "admin/produtos/formularios/formPicapes", "formPicapes");
    }

    @PostMapping("/{id}/editarPicapes")
    public String editarPicapes(@Valid @ModelAttribute("formPicapes") PicapesForm form,
                                @PathVariable Long id,
                                BindingResult result,
                                RedirectAttributes attrs) {
        return atualizarProduto(form, id, result, attrs, Picapes.class, "/admin/produtos/listaPicapes", "Produto editado com sucesso");
    }

    @GetMapping("/{id}/excluirPicapes")
    public String excluirPicapes(@PathVariable Long id, RedirectAttributes attrs) {
        return excluirProduto(id, Picapes.class, "/admin/produtos/listaPicapes", attrs);
    }

    @ModelAttribute("quantidadePortass")
    public QuantidadePortas[] getQuantidadePortas() {
        return QuantidadePortas.values();
    }

    @ModelAttribute("tracaoIntegrals")
    public Boleano[] getTracaoIntegral() {
        return Boleano.values();
    }

    @ModelAttribute("portaLateralAutomaticas")
    public Boleano[] getPortaLateralAutomatica() {
        return Boleano.values();
    }

    @ModelAttribute("arCondicionados")
    public Boleano[] getArCondicionado() {
        return Boleano.values();
    }

}
