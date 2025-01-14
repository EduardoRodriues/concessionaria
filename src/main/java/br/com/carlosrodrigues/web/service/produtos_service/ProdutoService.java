package br.com.carlosrodrigues.web.service.produtos_service;

import br.com.carlosrodrigues.core.exceptions.produtos_exceptions.ProdutoNaoEncontradoException;
import br.com.carlosrodrigues.core.models.models_produtos.Conversiveis;
import br.com.carlosrodrigues.core.models.models_produtos.SUVs;
import br.com.carlosrodrigues.core.repositories.produtos_repositories.ConversiveisRepository;
import br.com.carlosrodrigues.core.repositories.produtos_repositories.SUVsRepository;
import br.com.carlosrodrigues.web.dto.dto_produtos.ConversiveisForm;
import br.com.carlosrodrigues.web.dto.dto_produtos.SUVsForm;
import br.com.carlosrodrigues.web.mappers.produtos_mappers.IConversiveisMapper;
import br.com.carlosrodrigues.web.mappers.produtos_mappers.ISUVsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ConversiveisRepository conversiveisRepository;

    @Autowired
    private IConversiveisMapper conversiveisMapper;

    @Autowired
    private SUVsRepository suVsRepository;

    @Autowired
    private ISUVsMapper suVsMapper;


    // Conversiveis


    public List<Conversiveis> mostrarTodosConversiveis() {

        return conversiveisRepository.findAll();
    }

    public Conversiveis buscarPorIdConversiveis(Long id) {

        var mensagem = String.format("O produto com o ID %d não foi encontrado");

        return conversiveisRepository.findById(id)
                .orElseThrow(() -> new ProdutoNaoEncontradoException(mensagem));
    }

    public Conversiveis cadastrarConversiveis(ConversiveisForm form) {

        var model = conversiveisMapper.toModel(form);

        return conversiveisRepository.save(model);
    }

    public Conversiveis editarConversiveis(ConversiveisForm form, Long id) {

        var model = conversiveisMapper.toModel(form);
        model.setId(id);

        return conversiveisRepository.save(model);
    }

    public void excluirConversiveis(Long id) {

        var produto = buscarPorIdConversiveis(id);

        conversiveisRepository.delete(produto);
    }


    // SUVs



    public List<SUVs> mostrarTodosSUVs() {

        return suVsRepository.findAll();
    }

    public SUVs buscarPorIdSUVs(Long id) {

        var mensagem = String.format("O produto com o ID %d não foi encontrado");

        return suVsRepository.findById(id)
                .orElseThrow(() -> new ProdutoNaoEncontradoException(mensagem));
    }

    public SUVs cadastrarSUVs(SUVsForm form) {

        var model = suVsMapper.toModel(form);

        return suVsRepository.save(model);
    }

    public SUVs editarSUVs(SUVsForm form, Long id) {

        var model = suVsMapper.toModel(form);
        model.setId(id);

        return suVsRepository.save(model);
    }

    public void excluirSUVs(Long id) {

        var produto = buscarPorIdSUVs(id);

        suVsRepository.delete(produto);
    }
}
