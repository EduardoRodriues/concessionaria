package br.com.carlosrodrigues.web.controller.produtos_controllers;

import br.com.carlosrodrigues.core.enums.enums_produtos.Boleano;
import br.com.carlosrodrigues.core.enums.enums_produtos.QuantidadePortas;
import br.com.carlosrodrigues.web.dto.dto_produtos.ConversiveisForm;
import br.com.carlosrodrigues.web.dto.dto_produtos.SUVsForm;
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

    // Conversiveis

    @GetMapping("/listaConversiveis")
    public ModelAndView mostrarTodosConversiveis() {
        var modelAndView = new ModelAndView("admin/produtos/listas/listaConversiveis");
        modelAndView.addObject("listaConversiveis", service.mostrarTodosConversiveis());

        return modelAndView;
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

        if(result.hasErrors()) {
            return "admin/produtos/formularios/formConversiveis";
        }

        service.cadastrarConversiveis(form);
        attrs.addFlashAttribute("alert", new FlashMessage("alert-success", "Produto cadastrado com sucesso"));

        return "redirect:/admin/produtos/listaConversiveis";
    }

    @GetMapping("/{id}/editarConversiveis")
    public ModelAndView editarConversiveis(@PathVariable Long id) {
        var modelAndView = new ModelAndView("admin/produtos/formularios/formConversiveis");

        modelAndView.addObject("formConversiveis", service.buscarPorIdConversiveis(id));

        return modelAndView;
    }

    @PostMapping("/{id}/editarConversiveis")
    public String editarConversiveis(@Valid @ModelAttribute("formConversiveis") ConversiveisForm form,
                         @PathVariable Long id,
                         BindingResult result,
                         RedirectAttributes attrs) {

        if(result.hasErrors()) {
            return "admin/produtos/formularios/listaConversiveis";
        }

        service.editarConversiveis(form, id);
        attrs.addFlashAttribute("alert", new FlashMessage("alert-success", "Produto editado com sucesso"));

        return "redirect:/admin/produtos/listaConversiveis";
    }

    @GetMapping("/{id}/excluirConversiveis")
    public String excluir(@PathVariable Long id, RedirectAttributes attrs) {

        service.excluirConversiveis(id);
        attrs.addFlashAttribute("alert", new FlashMessage("alert-success", "Produto excluído com sucesso"));

        return "redirect:/admin/produtos/listaConversiveis";
    }

    @ModelAttribute("quantidadePortass")
    public QuantidadePortas[] getquantidadePortas() {
        return QuantidadePortas.values();
    }


    // SUVs


    @GetMapping("/listaSUVs")
    public ModelAndView mostrarTodosSUVs() {
        var modelAndView = new ModelAndView("admin/produtos/listas/listaSUVs");
        modelAndView.addObject("listaSUVs", service.mostrarTodosSUVs());

        return modelAndView;
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

        if(result.hasErrors()) {
            return "admin/produtos/formularios/formSUVs";
        }

        service.cadastrarSUVs(form);
        attrs.addFlashAttribute("alert", new FlashMessage("alert-success", "Produto cadastrado com sucesso"));

        return "redirect:/admin/produtos/listaSUVs";
    }

    @GetMapping("/{id}/editarSUVs")
    public ModelAndView editarSUVs(@PathVariable Long id) {
        var modelAndView = new ModelAndView("admin/produtos/formularios/formSUVs");

        modelAndView.addObject("formSUVs", service.buscarPorIdSUVs(id));

        return modelAndView;
    }

    @PostMapping("/{id}/editarSUVs")
    public String editarSUVs(@Valid @ModelAttribute("formSUvs") SUVsForm form,
                                     @PathVariable Long id,
                                     BindingResult result,
                                     RedirectAttributes attrs) {

        if(result.hasErrors()) {
            return "admin/produtos/formularios/formSUVs";
        }

        service.editarSUVs(form, id);
        attrs.addFlashAttribute("alert", new FlashMessage("alert-success", "Produto editado com sucesso"));

        return "redirect:/admin/produtos/listaSUVs";
    }

    @GetMapping("/{id}/excluirSUVs")
    public String excluirSUVs(@PathVariable Long id, RedirectAttributes attrs) {

        service.excluirSUVs(id);
        attrs.addFlashAttribute("alert", new FlashMessage("alert-success", "Produto excluido com sucesso"));

        return "redirect:/admin/produtos/listaSUVs";
    }

    @ModelAttribute("tracaoIntegrals")
    public Boleano[] getBoleano() {
        return Boleano.values();
    }
}

