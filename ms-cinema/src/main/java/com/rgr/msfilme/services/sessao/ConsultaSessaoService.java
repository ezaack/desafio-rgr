package com.rgr.msfilme.services.sessao;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.entidade.Sessao;

public interface ConsultaSessaoService {

    Sessao consulta(UUID id);

    List<Sessao> consultaTodas();
    List<Sessao> consultaPorFilme(UUID idFilme);

}
