package com.rgr.msfilme.utilitarios;

import com.rgr.msfilme.model.entidade.Filme;

public abstract class ConverteFilmeVoEmEntidadeFilmeHelper {

    public static Filme converter(FilmeVO filme) {
        return Filme.builder()
                .genero(filme.getGenero())
                .nome(filme.getNome())
                .id(filme.getId())
                .build();
    }
}
