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
public class CinemaVO {
    private UUID id;

    private UUID idCidade;

    private String nome;
}
