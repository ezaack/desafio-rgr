package com.rgr.msfilme.model.vo;

import java.util.UUID;

import com.rgr.msfilme.model.enumeracoes.Genero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FilmeVO {

    private UUID id;
    private String nome;
    private Genero genero;
}
