package com.rgr.msfilme.services;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.entidade.Cidade;

public interface ConsultaCidadeService {

    Cidade consulta(UUID id);

    List<Cidade> consultaTodas();
}
