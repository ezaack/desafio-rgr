package com.rgr.mspagamento.services.imp;

import com.rgr.mspagamento.model.entidade.Pagamento;
import com.rgr.mspagamento.services.InserirPagamentoNaFilaDeProcessamentoService;
import org.springframework.stereotype.Service;

@Service
public class InserirPagamentoNaFilaDeProcessamentoServiceImpl implements InserirPagamentoNaFilaDeProcessamentoService {
    @Override
    public void processarPagamento(Pagamento pagamento) {
        //IMPLEMENTAR ACESSO A FILA MP
    }
}
