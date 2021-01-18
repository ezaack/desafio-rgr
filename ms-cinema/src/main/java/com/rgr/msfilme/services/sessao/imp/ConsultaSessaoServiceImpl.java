package com.rgr.msfilme.services.sessao.imp;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.entidade.Sessao;
import com.rgr.msfilme.persistencia.repositorio.SessaoRepository;
import com.rgr.msfilme.services.sessao.ConsultaSessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaSessaoServiceImpl implements ConsultaSessaoService {
    @Autowired
    private SessaoRepository sessaoRepository;

    @Override
    public Sessao consulta(UUID id) {
        return sessaoRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Sessao> consultaTodas() {
        return sessaoRepository.findAll();
    }

    @Override
    public List<Sessao> consultaPorFilme(UUID idFilme) {
        return sessaoRepository.findByIdFilme(idFilme);
    }

}
