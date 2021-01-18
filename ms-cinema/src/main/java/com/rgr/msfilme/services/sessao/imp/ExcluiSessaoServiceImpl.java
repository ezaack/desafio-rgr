package com.rgr.msfilme.services.sessao.imp;

import javax.transaction.Transactional;
import java.util.UUID;

import com.rgr.msfilme.persistencia.repositorio.SessaoRepository;
import com.rgr.msfilme.services.sessao.ExcluiSessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExcluiSessaoServiceImpl implements ExcluiSessaoService {
    @Autowired
    private SessaoRepository sessaoRepository;

    @Override
    @Transactional
    public void exclui(UUID id) {
        sessaoRepository.deleteById(id);
    }
}
