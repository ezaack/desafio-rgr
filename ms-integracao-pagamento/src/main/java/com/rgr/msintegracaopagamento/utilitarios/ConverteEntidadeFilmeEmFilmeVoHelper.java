package com.rgr.msfilme.utilitarios;

import com.rgr.msfilme.model.entidade.Filme;

public abstract class ConverteEntidadeFilmeEmFilmeVoHelper {

    public static FilmeVO converter(Filme filme) {
        return FilmeVO.builder()
                .genero(filme.getGenero())
                .id(filme.getId())
                .nome(filme.getNome())
                .build();
    }
}
