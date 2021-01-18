package com.rgr.msfilme.services.cinema.imp;

import javax.transaction.Transactional;

import java.util.UUID;

import com.rgr.msfilme.persistencia.repositorio.FilmeRepository;
import com.rgr.msfilme.services.ExcluiFilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExcluiFilmeServiceImpl implements ExcluiFilmeService {
    @Autowired
    private FilmeRepository filmeRepository;

    @Override
    @Transactional
    public void exclui(UUID id) {
        filmeRepository.deleteById(id);
    }
}
