package com.rgr.msfilme.utilitarios.helpers;

import com.rgr.msfilme.model.entidade.Cinema;
import com.rgr.msfilme.model.entidade.Sessao;
import com.rgr.msfilme.model.vo.CinemaVO;
import com.rgr.msfilme.model.vo.SessaoVO;

public abstract class ConverteSessaoVoEmEntidadeSessaoHelper {

    public static Sessao converter(SessaoVO sessao) {
        return Sessao.builder()
                .id(sessao.getId())
                .horario(sessao.getHorario())
                .idFilme(sessao.getIdFilme())
                .idSala(sessao.getIdSala())
                .precoInteira(sessao.getPrecoInteira())
                .build();
    }
}
