package com.rgr.msintegracaopagamento.controller;

import com.rgr.msintegracaopagamento.model.vo.RequisicaoPagamentoVo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/integracao-pagamento")
public interface IntegracaoPagamentoController {

    @PostMapping
    ResponseEntity post(@RequestBody RequisicaoPagamentoVo requisicaoPagamentoVo);
}
