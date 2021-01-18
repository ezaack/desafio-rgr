package com.rgr.mspagamento.services.imp;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import com.rgr.mspagamento.model.entidade.Pagamento;
import com.rgr.mspagamento.model.enumeracoes.Status;
import com.rgr.mspagamento.persistencia.repositorio.PagamentoRepository;
import com.rgr.mspagamento.services.ConsultaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;

public class ConsultaPagamentoServiceImpl implements ConsultaPagamentoService {
    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Override
    public Pagamento findById(UUID id) {
        return pagamentoRepository.findById(id).orElseThrow(
                () -> new NoSuchElementException("Pagamento não encontrado")
        );
    }

    @Override
    public List<Pagamento> recuperarPagamentoPorStatus(Status status) {
        return pagamentoRepository.findByStatus(status);
    }
}
