package com.rgr.msfilme.model.entidade;

import javax.persistence.Column;
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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sessao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private UUID idFilme;

    private OffsetTime horario;

    private BigDecimal precoInteira;

    @Column(name="id_sala")
    private UUID idSala;
    @ManyToOne
    @Column(name="id_sala", insertable = false, updatable = false)
    private Sala sala;

    @OneToMany(mappedBy = "sessao")
    private List<Assento> assentos;

}
