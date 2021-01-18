package com.rgr.msfilme.utilitarios.helpers;

import com.rgr.msfilme.model.entidade.Sessao;
import com.rgr.msfilme.model.vo.SessaoVO;

public abstract class ConverteEntidadeSessaoEmSessaoVOHelper {

    public static SessaoVO converter(Sessao sessao) {
        return SessaoVO.builder()
                .id(sessao.getId())
                .horario(sessao.getHorario())
                .idFilme(sessao.getIdFilme())
                .idSala(sessao.getIdSala())
                .precoInteira(sessao.getPrecoInteira())
                .build();
    }
}
