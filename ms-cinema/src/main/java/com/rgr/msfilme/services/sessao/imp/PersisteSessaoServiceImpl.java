package com.rgr.msfilme.services.sessao.imp;

import javax.transaction.Transactional;

import com.rgr.msfilme.model.entidade.Sessao;
import com.rgr.msfilme.persistencia.repositorio.SessaoRepository;
import com.rgr.msfilme.services.sessao.PersisteSessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersisteSessaoServiceImpl implements PersisteSessaoService {
    @Autowired
    private SessaoRepository sessaoRepository;

    @Override
    @Transactional
    public Sessao persiste(Sessao sessao) {
        return sessaoRepository.save(sessao);
    }
}
