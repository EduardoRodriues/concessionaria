package br.com.carlosrodrigues.web.service.produtos_service;

import br.com.carlosrodrigues.core.exceptions.produtos_exceptions.ProdutoNaoEncontradoException;
import br.com.carlosrodrigues.core.models.models_produtos.Conversiveis;
import br.com.carlosrodrigues.core.models.models_produtos.SUVs;
import br.com.carlosrodrigues.core.models.models_produtos.Coupees;
import br.com.carlosrodrigues.core.models.models_produtos.Esportivos;
import br.com.carlosrodrigues.core.models.models_produtos.Eletricos;
import br.com.carlosrodrigues.core.models.models_produtos.Minivans;
import br.com.carlosrodrigues.core.models.models_produtos.Picapes;
import br.com.carlosrodrigues.core.repositories.produtos_repositories.ConversiveisRepository;
import br.com.carlosrodrigues.core.repositories.produtos_repositories.SUVsRepository;
import br.com.carlosrodrigues.core.repositories.produtos_repositories.CoupeesRepository;
import br.com.carlosrodrigues.core.repositories.produtos_repositories.EsportivosRepository;
import br.com.carlosrodrigues.core.repositories.produtos_repositories.EletricosRepository;
import br.com.carlosrodrigues.core.repositories.produtos_repositories.MinivansRepository;
import br.com.carlosrodrigues.core.repositories.produtos_repositories.PicapesRepository;
import br.com.carlosrodrigues.web.dto.dto_produtos.ConversiveisForm;
import br.com.carlosrodrigues.web.dto.dto_produtos.SUVsForm;
import br.com.carlosrodrigues.web.dto.dto_produtos.CoupeesForm;
import br.com.carlosrodrigues.web.dto.dto_produtos.EsportivosForm;
import br.com.carlosrodrigues.web.dto.dto_produtos.EletricosForm;
import br.com.carlosrodrigues.web.dto.dto_produtos.MinivansForm;
import br.com.carlosrodrigues.web.dto.dto_produtos.PicapesForm;
import br.com.carlosrodrigues.web.mappers.produtos_mappers.IConversiveisMapper;
import br.com.carlosrodrigues.web.mappers.produtos_mappers.ISUVsMapper;
import br.com.carlosrodrigues.web.mappers.produtos_mappers.ICoupeesMapper;
import br.com.carlosrodrigues.web.mappers.produtos_mappers.IEsportivosMapper;
import br.com.carlosrodrigues.web.mappers.produtos_mappers.IEletricosMapper;
import br.com.carlosrodrigues.web.mappers.produtos_mappers.IMinivansMapper;
import br.com.carlosrodrigues.web.mappers.produtos_mappers.IPicapesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired(required = true)
    private ConversiveisRepository conversiveisRepository;

    @Autowired(required = true)
    @Qualifier("IConversiveisMapper")
    private IConversiveisMapper conversiveisMapper;

    @Autowired(required = true)
    private SUVsRepository suVsRepository;

    @Autowired(required = true)
    @Qualifier("ISUVsMapper")
    private ISUVsMapper suVsMapper;

    @Autowired(required = true)
    private CoupeesRepository coupeesRepository;

    @Autowired(required = true)
    @Qualifier("ICoupeesMapper")
    private ICoupeesMapper coupeesMapper;

    @Autowired(required = true)
    private EsportivosRepository esportivosRepository;

    @Autowired(required = true)
    @Qualifier("IEsportivosMapper")
    private IEsportivosMapper esportivosMapper;

    @Autowired(required = true)
    private EletricosRepository eletricosRepository;

    @Autowired(required = true)
    @Qualifier("IEletricosMapper")
    private IEletricosMapper eletricosMapper;

    @Autowired(required = true)
    private MinivansRepository minivansRepository;

    @Autowired(required = true)
    @Qualifier("IMinivansMapper")
    private IMinivansMapper minivansMapper;

    @Autowired(required = true)
    private PicapesRepository picapesRepository;

    @Autowired(required = true)
    @Qualifier("IPicapesMapper")
    private IPicapesMapper picapesMapper;


    public <T> List<T> mostrarTodos(Class<T> tipoProduto) {
        if (tipoProduto.equals(Conversiveis.class)) {
            return (List<T>) conversiveisRepository.findAll();
        } else if (tipoProduto.equals(SUVs.class)) {
            return (List<T>) suVsRepository.findAll();
        } else if (tipoProduto.equals(Coupees.class)) {
            return (List<T>) coupeesRepository.findAll();
        } else if (tipoProduto.equals(Esportivos.class)) {
            return (List<T>) esportivosRepository.findAll();
        } else if (tipoProduto.equals(Eletricos.class)) {
            return (List<T>) eletricosRepository.findAll();
        } else if (tipoProduto.equals(Minivans.class)) {
            return (List<T>) minivansRepository.findAll();
        } else if (tipoProduto.equals(Picapes.class)) {
            return (List<T>) picapesRepository.findAll();
        }
        throw new IllegalArgumentException("Tipo de produto desconhecido");
    }

    public <T> T buscarPorId(Long id, Class<T> tipoProduto) {
        if (tipoProduto.equals(Conversiveis.class)) {
            return (T) conversiveisRepository.findById(id)
                    .orElseThrow(() -> new ProdutoNaoEncontradoException(String.format("O produto com o ID %d não foi encontrado", id)));
        } else if (tipoProduto.equals(SUVs.class)) {
            return (T) suVsRepository.findById(id)
                    .orElseThrow(() -> new ProdutoNaoEncontradoException(String.format("O produto com o ID %d não foi encontrado", id)));
        } else if (tipoProduto.equals(Coupees.class)) {
            return (T) coupeesRepository.findById(id)
                    .orElseThrow(() -> new ProdutoNaoEncontradoException(String.format("O produto com o ID %d não foi encontrado", id)));
        } else if (tipoProduto.equals(Esportivos.class)) {
            return (T) esportivosRepository.findById(id)
                    .orElseThrow(() -> new ProdutoNaoEncontradoException(String.format("O produto com o ID %d não foi encontrado", id)));
        } else if (tipoProduto.equals(Eletricos.class)) {
            return (T) eletricosRepository.findById(id)
                    .orElseThrow(() -> new ProdutoNaoEncontradoException(String.format("O produto com o ID %d não foi encontrado", id)));
        } else if (tipoProduto.equals(Minivans.class)) {
            return (T) minivansRepository.findById(id)
                    .orElseThrow(() -> new ProdutoNaoEncontradoException(String.format("O produto com o ID %d não foi encontrado", id)));
        } else if (tipoProduto.equals(Picapes.class)) {
            return (T) picapesRepository.findById(id)
                    .orElseThrow(() -> new ProdutoNaoEncontradoException(String.format("O produto com o ID %d não foi encontrado", id)));
        }
        throw new IllegalArgumentException("Tipo de produto desconhecido");
    }

    public <T, F> T cadastrar(F form, Class<T> tipoProduto) {
        if (tipoProduto.equals(Conversiveis.class)) {
            Conversiveis model = conversiveisMapper.toModel((ConversiveisForm) form);
            return (T) conversiveisRepository.save(model);
        } else if (tipoProduto.equals(SUVs.class)) {
            SUVs model = suVsMapper.toModel((SUVsForm) form);
            return (T) suVsRepository.save(model);
        } else if (tipoProduto.equals(Coupees.class)) {
            Coupees model = coupeesMapper.toModel((CoupeesForm) form);
            return (T) coupeesRepository.save(model);
        } else if (tipoProduto.equals(Esportivos.class)) {
            Esportivos model = esportivosMapper.toModel((EsportivosForm) form);
            return (T) esportivosRepository.save(model);
        } else if (tipoProduto.equals(Eletricos.class)) {
            Eletricos model = eletricosMapper.toModel((EletricosForm) form);
            return (T) eletricosRepository.save(model);
        } else if (tipoProduto.equals(Minivans.class)) {
            Minivans model = minivansMapper.toModel((MinivansForm) form);
            return (T) minivansRepository.save(model);
        } else if (tipoProduto.equals(Picapes.class)) {
            Picapes model = picapesMapper.toModel((PicapesForm) form);
            return (T) picapesRepository.save(model);
        }
        throw new IllegalArgumentException("Tipo de produto desconhecido");
    }

    public <T, F> T editar(F form, Long id, Class<T> tipoProduto) {
        if (tipoProduto.equals(Conversiveis.class)) {
            Conversiveis model = conversiveisMapper.toModel((ConversiveisForm) form);
            model.setId(id);
            return (T) conversiveisRepository.save(model);
        } else if (tipoProduto.equals(SUVs.class)) {
            SUVs model = suVsMapper.toModel((SUVsForm) form);
            model.setId(id);
            return (T) suVsRepository.save(model);
        } else if (tipoProduto.equals(Coupees.class)) {
            Coupees model = coupeesMapper.toModel((CoupeesForm) form);
            model.setId(id);
            return (T) coupeesRepository.save(model);
        } else if (tipoProduto.equals(Esportivos.class)) {
            Esportivos model = esportivosMapper.toModel((EsportivosForm) form);
            model.setId(id);
            return (T) esportivosRepository.save(model);
        } else if (tipoProduto.equals(Eletricos.class)) {
            Eletricos model = eletricosMapper.toModel((EletricosForm) form);
            model.setId(id);
            return (T) eletricosRepository.save(model);
        } else if (tipoProduto.equals(Minivans.class)) {
            Minivans model = minivansMapper.toModel((MinivansForm) form);
            model.setId(id);
            return (T) minivansRepository.save(model);
        } else if (tipoProduto.equals(Picapes.class)) {
            Picapes model = picapesMapper.toModel((PicapesForm) form);
            model.setId(id);
            return (T) picapesRepository.save(model);
        }
        throw new IllegalArgumentException("Tipo de produto desconhecido");
    }

    public void excluir(Long id, Class<?> tipoProduto) {
        if (tipoProduto.equals(Conversiveis.class)) {
            Conversiveis produto = (Conversiveis) buscarPorId(id, Conversiveis.class);
            conversiveisRepository.delete(produto);
        } else if (tipoProduto.equals(SUVs.class)) {
            SUVs produto = (SUVs) buscarPorId(id, SUVs.class);
            suVsRepository.delete(produto);
        } else if (tipoProduto.equals(Coupees.class)) {
            Coupees produto = (Coupees) buscarPorId(id, Coupees.class);
            coupeesRepository.delete(produto);
        } else if (tipoProduto.equals(Esportivos.class)) {
            Esportivos produto = (Esportivos) buscarPorId(id, Esportivos.class);
            esportivosRepository.delete(produto);
        } else if (tipoProduto.equals(Eletricos.class)) {
            Eletricos produto = (Eletricos) buscarPorId(id, Eletricos.class);
            eletricosRepository.delete(produto);
        } else if (tipoProduto.equals(Minivans.class)) {
            Minivans produto = (Minivans) buscarPorId(id, Minivans.class);
            minivansRepository.delete(produto);
        } else if (tipoProduto.equals(Picapes.class)) {
            Picapes produto = (Picapes) buscarPorId(id, Picapes.class);
            picapesRepository.delete(produto);
        } else {
            throw new IllegalArgumentException("Tipo de produto desconhecido");
        }
    }
}
