package com.rgr.msfilme.utilitarios.helpers;

import com.rgr.msfilme.model.entidade.Cinema;
import com.rgr.msfilme.model.vo.CinemaVO;

public abstract class ConverteEntidadeCinemaEmCinemaVoHelper {

    public static CinemaVO converter(Cinema cinema) {
        return CinemaVO.builder()
                .id(cinema.getId())
                .idCidade(cinema.getIdCidade())
                .nome(cinema.getNome())
                .build();
    }
}
