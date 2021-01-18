package com.rgr.msfilme.services.cinema.imp;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.entidade.Filme;
import com.rgr.msfilme.persistencia.repositorio.FilmeRepository;
import com.rgr.msfilme.services.ConsultaFilmePorCidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaFilmePorCidadeServiceImpl implements ConsultaFilmePorCidadeService {
    @Autowired
    private FilmeRepository filmeRepository;

    @Override
    public List<Filme> findByIdCidade(UUID idCidade) {
        return filmeRepository.findByIdCidade(idCidade);
    }
}
