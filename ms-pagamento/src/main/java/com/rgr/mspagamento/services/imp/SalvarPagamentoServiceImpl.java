package com.rgr.mspagamento.services.imp;

import com.rgr.mspagamento.model.entidade.Pagamento;
import com.rgr.mspagamento.persistencia.repositorio.PagamentoRepository;
import com.rgr.mspagamento.services.InserirPagamentoNaFilaDeProcessamentoService;
import com.rgr.mspagamento.services.SalvarPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalvarPagamentoServiceImpl implements SalvarPagamentoService {
    @Autowired
    private PagamentoRepository pagamentoRepository;
    @Autowired
    private InserirPagamentoNaFilaDeProcessamentoService inserirPagamentoNaFilaDeProcessamentoService;
    public Pagamento salvar(Pagamento pagamento) {
        pagamento = pagamentoRepository.save(pagamento);
        inserirPagamentoNaFilaDeProcessamentoService.processarPagamento(pagamento);
        return pagamento;
    }
}
