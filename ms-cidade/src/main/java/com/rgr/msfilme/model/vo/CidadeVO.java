package com.rgr.msfilme.model.vo;

import javax.persistence.Convert;
import java.util.UUID;

import com.rgr.msfilme.model.enumeracoes.Estado;
import com.rgr.msfilme.model.enumeracoes.conversores.EstadoConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CidadeVO {

    private UUID id;

    private String nome;

    @Convert(converter = EstadoConverter.class)
    private Estado estado;
}
