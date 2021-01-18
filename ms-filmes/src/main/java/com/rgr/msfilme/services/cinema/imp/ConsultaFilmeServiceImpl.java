package com.rgr.msfilme.services.cinema.imp;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.entidade.Filme;
import com.rgr.msfilme.persistencia.repositorio.FilmeRepository;
import com.rgr.msfilme.services.ConsultaFilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaFilmeServiceImpl implements ConsultaFilmeService {
    @Autowired
    private FilmeRepository filmeRepository;

    @Override
    public Filme consulta(UUID id) {
        return filmeRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Filme> consultaTodas() {
        return filmeRepository.findAll();
    }

}
