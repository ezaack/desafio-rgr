package com.rgr.msintegracaopagamento.services;

import com.rgr.msintegracaopagamento.model.vo.RequisicaoPagamentoVo;
import com.rgr.msintegracaopagamento.model.vo.RespostaPagamentoVo;

public interface IntegracaoPagamentoService {

    RespostaPagamentoVo pagar(RequisicaoPagamentoVo requisicao);
}
