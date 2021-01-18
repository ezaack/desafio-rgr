package com.rgr.msfilme.services.cinema.imp;

import javax.transaction.Transactional;

import java.util.UUID;

import com.rgr.msfilme.persistencia.repositorio.CidadeRepository;
import com.rgr.msfilme.services.ExcluiCidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExcluiCidadeServiceImpl implements ExcluiCidadeService {
    @Autowired
    private CidadeRepository cidadeRepository;

    @Override
    @Transactional
    public void exclui(UUID id) {
        cidadeRepository.deleteById(id);
    }
}
