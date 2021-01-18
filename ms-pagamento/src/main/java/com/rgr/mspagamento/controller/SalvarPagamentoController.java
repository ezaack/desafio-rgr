package com.rgr.mspagamento.controller;

import com.rgr.mspagamento.model.vo.PagamentoVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pagamento")
public interface SalvarPagamentoController {

    @PostMapping
    ResponseEntity post(@RequestBody PagamentoVO pagamentoVO);
}
