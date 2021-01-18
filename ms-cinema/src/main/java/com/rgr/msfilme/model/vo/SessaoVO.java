package com.rgr.msfilme.model.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetTime;
import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.entidade.Assento;
import com.rgr.msfilme.model.entidade.Sala;
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
public class SessaoVO implements Serializable {

    private UUID id;

    private UUID idFilme;

    private OffsetTime horario;

    private BigDecimal precoInteira;

    private UUID idSala;

}
