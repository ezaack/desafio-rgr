package com.rgr.msfilme.services.cinema.imp;

import javax.transaction.Transactional;

import com.rgr.msfilme.model.entidade.Filme;
import com.rgr.msfilme.persistencia.repositorio.FilmeRepository;
import com.rgr.msfilme.services.PersisteFilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersisteFilmeServiceImpl implements PersisteFilmeService {
    @Autowired
    private FilmeRepository filmeRepository;

    @Override
    @Transactional
    public Filme persiste(Filme filme) {
        return filmeRepository.save(filme);
    }
}
