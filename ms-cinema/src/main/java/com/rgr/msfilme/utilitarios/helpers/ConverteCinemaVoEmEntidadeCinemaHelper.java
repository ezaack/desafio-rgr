package com.rgr.msfilme.utilitarios.helpers;

import com.rgr.msfilme.model.entidade.Cinema;
import com.rgr.msfilme.model.vo.CinemaVO;

public abstract class ConverteCinemaVoEmEntidadeCinemaHelper {

    public static Cinema converter(CinemaVO cinema) {
        return Cinema.builder()
                .id(cinema.getId())
                .idCidade(cinema.getIdCidade())
                .nome(cinema.getNome())
                .build();
    }
}
