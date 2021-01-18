package com.rgr.msfilme.services;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.entidade.Filme;

public interface ConsultaFilmeService {

    Filme consulta(UUID id);

    List<Filme> consultaTodas();

}
