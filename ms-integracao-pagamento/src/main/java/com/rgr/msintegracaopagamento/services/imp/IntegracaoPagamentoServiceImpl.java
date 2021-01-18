package com.rgr.msintegracaopagamento.services.imp;

import com.rgr.msintegracaopagamento.model.vo.RequisicaoPagamentoVo;
import com.rgr.msintegracaopagamento.model.vo.RespostaPagamentoVo;
import com.rgr.msintegracaopagamento.services.IntegracaoPagamentoService;
import org.springframework.stereotype.Service;

@Service
public class IntegracaoPagamentoServiceImpl implements IntegracaoPagamentoService {
    @Override
    public RespostaPagamentoVo pagar(RequisicaoPagamentoVo requisicao) {
        //IMPLEMENTACAO DA COMUNICAÇÃO COM A API DE PAGAMENTO
        return RespostaPagamentoVo.builder().build();
    }
}
