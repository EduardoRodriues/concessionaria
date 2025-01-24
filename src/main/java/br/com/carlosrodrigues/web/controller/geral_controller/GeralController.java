package br.com.carlosrodrigues.web.controller.geral_controller;

import br.com.carlosrodrigues.web.service.geral_service.GeralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("admin/produtos")
public class GeralController {

    @Autowired
    private GeralService geralService;

    @GetMapping("/listaGeral")
    public ModelAndView listarDadosGerais() {

        var model = new ModelAndView("admin/produtos/listas/listaGeral");
        model.addObject("listaGeral", geralService.mostrarTodos());

        return model;

    }

}
