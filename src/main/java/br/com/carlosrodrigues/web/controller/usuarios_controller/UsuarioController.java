package br.com.carlosrodrigues.web.controller.usuarios_controller;

import br.com.carlosrodrigues.core.exceptions.usuarios_exceptions.ValidacaoException;
import br.com.carlosrodrigues.web.dto.dto_usuarios.UsuarioCadastroForm;
import br.com.carlosrodrigues.web.dto.dto_usuarios.UsuarioEdicaoForm;
import br.com.carlosrodrigues.web.dto.mensagens.FlashMessage;
import br.com.carlosrodrigues.web.service.usuarios_service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/admin/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping("/lista")
    public ModelAndView mostrarTodos() {

        var modelAndView = new ModelAndView("admin/usuarios/listas/listaUsuarios");

        modelAndView.addObject("lista", service.mostrarTodos());

        return modelAndView;
    }

    @GetMapping("/cadastrar")
    public ModelAndView cadastrar() {

        var modelAndView = new ModelAndView("admin/usuarios/formularios/usuarioCadastroForm");

        modelAndView.addObject("usuarioCadastroForm", new UsuarioCadastroForm());

        return modelAndView;
    }

    @PostMapping("/cadastrar")
    public String cadastrar(@Valid @ModelAttribute("usuarioCadastroForm") UsuarioCadastroForm form,
                            BindingResult result,
                            RedirectAttributes attrs) {

        if(result.hasErrors()) {
            return "admin/usuarios/formularios/usuarioCadastroForm";
        }

        try{
            service.cadastrar(form);
            attrs.addFlashAttribute("alert", new FlashMessage("alert-success", "usuario editado com sucesso!"));
        } catch(ValidacaoException e) {
            result.addError(e.getFieldError());
            return "admin/usuarios/formularios/usuarioCadastroForm";
        }

        return "redirect:/admin/usuarios/lista";
    }

    @GetMapping("/{id}/editar")
    public ModelAndView editar(@PathVariable Long id) {

        var modelAndView = new ModelAndView("admin/usuarios/formularios/usuarioEdicaoForm");

        modelAndView.addObject("usuarioEdicaoForm", service.buscarPorId(id));

        return modelAndView;
    }

    @PostMapping("/{id}/editar")
    public String editar(@Valid @ModelAttribute("usuarioEdicaoForm") UsuarioEdicaoForm form,
                         @PathVariable Long id,
                         BindingResult result,
                         RedirectAttributes attrs) {


        if(result.hasErrors()) {
            return "admin/usuarios/formularios/usuarioEdicaoForm";
        }

        try{
            service.editar(form, id);
            attrs.addFlashAttribute("alert", new FlashMessage("alert-success", "usuario editado com sucesso!"));
        } catch(ValidacaoException e) {
            result.addError(e.getFieldError());
            return "admin/usuarios/formularios/usuarioEdicaoForm";
        }

        return "redirect:/admin/usuarios/lista";
    }

    @GetMapping("/{id}/excluir")
    public String excluir(@PathVariable Long id, RedirectAttributes attrs) {

        service.deletar(id);
        attrs.addFlashAttribute("alert", new FlashMessage("alert-success", "Usuario excluido com sucesso"));

        return "redirect:/admin/usuarios/lista";
    }
}
