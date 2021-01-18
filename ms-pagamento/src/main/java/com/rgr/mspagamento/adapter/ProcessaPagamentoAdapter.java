package com.rgr.mspagamento.adapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rgr.mspagamento.model.vo.ProcessamentoPagamentoVO;
import com.rgr.mspagamento.model.vo.RetornoProcessamentoPagamentoVO;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Log4j2
@Component
public class ProcessaPagamentoAdapter {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper mapper;

    public ResponseEntity<RetornoProcessamentoPagamentoVO> post(ProcessamentoPagamentoVO body) {

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<String> entity = new HttpEntity<>(mapper.writeValueAsString(body),
                    headers);

            return restTemplate.exchange("http://localhost:9003/v1/api/integracao-pagamento",
                    HttpMethod.POST,
                    entity,
                    RetornoProcessamentoPagamentoVO.class);
        } catch (Exception e) {
            log.error(" ###### [ERRO] " + e.getMessage(), e);
            throw new RuntimeException(e);
        }


    }

}
