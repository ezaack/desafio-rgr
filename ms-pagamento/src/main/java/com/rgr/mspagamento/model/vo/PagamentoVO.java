package com.rgr.mspagamento.model.vo;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import com.rgr.mspagamento.model.enumeracoes.Status;
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
public class PagamentoVO implements Serializable {

    private UUID id;

    private OffsetDateTime dataHoraPagamento;

    private Status status;

    private List<UUID> idsPagamentos;

}
