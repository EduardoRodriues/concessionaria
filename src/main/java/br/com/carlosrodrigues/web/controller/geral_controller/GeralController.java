package br.com.carlosrodrigues.web.controller.geral_controller;

import br.com.carlosrodrigues.core.models.models_produtos.Conversiveis;
import br.com.carlosrodrigues.core.models.models_produtos.SUVs;
import br.com.carlosrodrigues.core.repositories.produtos_repositories.ConversiveisRepository;
import br.com.carlosrodrigues.core.repositories.produtos_repositories.SUVsRepository;
import br.com.carlosrodrigues.web.dto.dto_geral.GeralForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("admin/produtos")
public class GeralController {

    @Autowired
    private ConversiveisRepository conversiveisRepository;

    @Autowired
    private SUVsRepository suvsRepository;

    @GetMapping("/listaGeral")
    public String listarDadosGerais(Model model) {
        List<Conversiveis> listaConversiveis = conversiveisRepository.findAll();
        List<SUVs> listaSuvs = suvsRepository.findAll();

        List<GeralForm> dadosCombinados = new ArrayList<>();

        for (Conversiveis c : listaConversiveis) {
            for (SUVs s : listaSuvs) {
                GeralForm geralForm = new GeralForm();
                geralForm.setConversiveis(c);
                geralForm.setSuvs(s);
                dadosCombinados.add(geralForm);
            }
        }

        // Verifique se os dados foram combinados corretamente
        System.out.println("Dados combinados: " + dadosCombinados);

        model.addAttribute("dadosCombinados", dadosCombinados);
        return "admin/produtos/listas/listaGeral";
    }

}
