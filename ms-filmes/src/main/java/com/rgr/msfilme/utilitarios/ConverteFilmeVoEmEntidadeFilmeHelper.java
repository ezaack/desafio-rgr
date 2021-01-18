package com.rgr.msfilme.utilitarios;

import com.rgr.msfilme.model.entidade.Filme;
import com.rgr.msfilme.model.vo.FilmeVO;

public abstract class ConverteFilmeVoEmEntidadeFilmeHelper {

    public static Filme converter(FilmeVO filme) {
        return Filme.builder()
                .genero(filme.getGenero())
                .nome(filme.getNome())
                .id(filme.getId())
                .build();
    }
}
