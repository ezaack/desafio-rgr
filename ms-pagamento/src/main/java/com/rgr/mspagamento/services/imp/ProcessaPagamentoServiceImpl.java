package com.rgr.mspagamento.services.imp;

import com.rgr.mspagamento.adapter.ProcessaPagamentoAdapter;
import com.rgr.mspagamento.model.entidade.Pagamento;
import com.rgr.mspagamento.model.enumeracoes.Status;
import com.rgr.mspagamento.model.vo.ProcessamentoPagamentoVO;
import com.rgr.mspagamento.persistencia.repositorio.PagamentoRepository;
import com.rgr.mspagamento.services.ConsultaPagamentoService;
import com.rgr.mspagamento.services.ProcessaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ProcessaPagamentoServiceImpl implements ProcessaPagamentoService {
    @Autowired
    private ConsultaPagamentoService consultaPagamentoService;
    @Autowired
    private ProcessaPagamentoAdapter processaPagamentoAdapter;
    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Override
    @Scheduled(initialDelay = 0, fixedDelay = 15000)
    public void executar() {
        consultaPagamentoService.recuperarPagamentoPorStatus(Status.PENDENTE).forEach(
                pagamento -> {
                    processaPagamentoAdapter.post(
                            //implementar o preenchimento adequado do VO
                            ProcessamentoPagamentoVO.builder().build()
                    );
                    pagamento.setStatus(Status.CONFIRMADO);
                    pagamentoRepository.save(pagamento);
                    notificaPagamentoEmail(pagamento);
                }
        );
    }

    private void notificaPagamentoEmail(Pagamento pagamento) {
        //implementar requisição a API de notificacao
    }
}
