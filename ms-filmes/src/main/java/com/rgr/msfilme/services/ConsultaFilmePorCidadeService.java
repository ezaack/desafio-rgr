package com.rgr.msfilme.services;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.entidade.Filme;

public interface ConsultaFilmePorCidadeService {


    List<Filme> findByIdCidade(UUID idCidade);
}
