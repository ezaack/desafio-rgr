package com.rgr.msfilme.services.sessao.imp;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.entidade.Sessao;
import com.rgr.msfilme.persistencia.repositorio.SessaoRepository;
import com.rgr.msfilme.services.sessao.ConsultaSessoesPorCinemaEFilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaSessoesPorCinemaEFilmeServiceImpl implements ConsultaSessoesPorCinemaEFilmeService {

    @Autowired
    private SessaoRepository sessaoRepository;

    @Override
    public List<Sessao> findByIdCinemaAndFilmes(UUID idCinema, UUID idFilme) {
        return sessaoRepository.findByIdCinemaAndFilmes(idCinema, idFilme);
    }
}
