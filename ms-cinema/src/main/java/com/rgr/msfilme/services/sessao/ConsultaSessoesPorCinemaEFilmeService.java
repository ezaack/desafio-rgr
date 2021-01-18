package com.rgr.msfilme.services.sessao;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.entidade.Sessao;

public interface ConsultaSessoesPorCinemaEFilmeService {
    List<Sessao> findByIdCinemaAndFilmes(UUID idCinema, UUID idFilme);
}
