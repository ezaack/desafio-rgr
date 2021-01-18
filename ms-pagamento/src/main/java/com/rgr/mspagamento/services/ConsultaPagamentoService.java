package com.rgr.mspagamento.services;

import java.util.List;
import java.util.UUID;

import com.rgr.mspagamento.model.entidade.Pagamento;
import com.rgr.mspagamento.model.enumeracoes.Status;

public interface ConsultaPagamentoService {

    Pagamento findById(UUID id);

    List<Pagamento> recuperarPagamentoPorStatus(Status status);
}
