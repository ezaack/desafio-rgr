package com.rgr.mspagamento.services;

import com.rgr.mspagamento.model.entidade.Pagamento;

public interface InserirPagamentoNaFilaDeProcessamentoService {

    void processarPagamento(Pagamento pagamento);
}
