package com.rgr.msfilme.model.entidade;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

import com.rgr.msfilme.model.enumeracoes.Estado;
import com.rgr.msfilme.model.enumeracoes.conversores.EstadoConverter;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nome;

    @Convert(converter = EstadoConverter.class)
    private Estado estado;
}
