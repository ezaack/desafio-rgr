package com.rgr.mspagamento.controller.imp;

import com.rgr.mspagamento.controller.SalvarPagamentoController;
import com.rgr.mspagamento.model.entidade.Pagamento;
import com.rgr.mspagamento.model.vo.PagamentoVO;
import com.rgr.mspagamento.services.SalvarPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalvarPagamentoControllerImpl implements SalvarPagamentoController {
    @Autowired
    private SalvarPagamentoService salvarPagamentoService;

    @Override
    public ResponseEntity post(PagamentoVO pagamentoVO) {
        return ResponseEntity.ok(converteRetorno(salvarPagamentoService.salvar(
                Pagamento.builder()
                        .dataHoraPagamento(pagamentoVO.getDataHoraPagamento())
                        .idsPagamentos(pagamentoVO.getIdsPagamentos())
                        .status(pagamentoVO.getStatus())
                        .build()
        )));
    }

    private PagamentoVO converteRetorno(Pagamento pagamento) {
        return PagamentoVO.builder()
                .dataHoraPagamento(pagamento.getDataHoraPagamento())
                .idsPagamentos(pagamento.getIdsPagamentos())
                .status(pagamento.getStatus())
                .id(pagamento.getId())
                .build();
    }
}
