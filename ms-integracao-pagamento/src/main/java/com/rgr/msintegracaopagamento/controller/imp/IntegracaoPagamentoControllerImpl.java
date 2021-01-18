package com.rgr.msintegracaopagamento.controller.imp;

import com.rgr.msintegracaopagamento.controller.IntegracaoPagamentoController;
import com.rgr.msintegracaopagamento.model.vo.RequisicaoPagamentoVo;
import com.rgr.msintegracaopagamento.services.IntegracaoPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntegracaoPagamentoControllerImpl implements IntegracaoPagamentoController {

    @Autowired
    private IntegracaoPagamentoService integracaoPagamentoService;

    @Override
    public ResponseEntity post(RequisicaoPagamentoVo requisicaoPagamentoVo) {
        return ResponseEntity.ok(
                integracaoPagamentoService.pagar(requisicaoPagamentoVo)
        );
    }
}
