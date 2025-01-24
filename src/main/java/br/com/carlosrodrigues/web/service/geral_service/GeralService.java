package br.com.carlosrodrigues.web.service.geral_service;

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
import br.com.carlosrodrigues.web.dto.dto_geral.GeralForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GeralService {

    @Autowired
    private ConversiveisRepository conversiveisRepository;
    @Autowired
    private SUVsRepository suvsRepository;
    @Autowired
    private CoupeesRepository coupeesRepository;
    @Autowired
    private EsportivosRepository esportivosRepository;
    @Autowired
    private EletricosRepository eletricosRepository;
    @Autowired
    private MinivansRepository minivansRepository;
    @Autowired
    private PicapesRepository picapesRepository;

    public List<GeralForm> mostrarTodos() {

        List<Conversiveis> listaConversiveis = conversiveisRepository.findAll();
        List<SUVs> listaSuvs = suvsRepository.findAll();
        List<Coupees> listaCoupees = coupeesRepository.findAll();
        List<Esportivos> listaEsportivos = esportivosRepository.findAll();
        List<Eletricos> listaEletricos = eletricosRepository.findAll();
        List<Minivans> listaMinivans = minivansRepository.findAll();
        List<Picapes> listaPicapes = picapesRepository.findAll();

        List<GeralForm> listaGeral = new ArrayList<>();

        int maxSize = Math.max(
                Math.max(
                        Math.max(
                                Math.max(
                                        Math.max(
                                                Math.max(listaConversiveis.size(), listaSuvs.size()),
                                                listaCoupees.size()
                                        ),
                                        listaEsportivos.size()
                                ),
                                listaEletricos.size()
                        ),
                        listaMinivans.size()
                ),
                listaPicapes.size());

        for (int i = 0; i < maxSize; i++) {
            GeralForm geralForm = new GeralForm();

            geralForm.setConversiveis(i < listaConversiveis.size() ? listaConversiveis.get(i) : null);
            geralForm.setSuvs(i < listaSuvs.size() ? listaSuvs.get(i) : null);
            geralForm.setCoupees(i < listaCoupees.size() ? listaCoupees.get(i) : null);
            geralForm.setEsportivos(i < listaEsportivos.size() ? listaEsportivos.get(i) : null);
            geralForm.setEletricos(i < listaEletricos.size() ? listaEletricos.get(i) : null);
            geralForm.setMinivans(i < listaMinivans.size() ? listaMinivans.get(i) : null);
            geralForm.setPicapes(i < listaPicapes.size() ? listaPicapes.get(i) : null);

            listaGeral.add(geralForm);
        }

        return listaGeral;
    }
}
