package com.rgr.msfilme.controller.sessao;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.vo.SessaoVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/sessao-por-filme")
public interface ConsultaSessaoPorFilmeRestController {
    @GetMapping(value = "/{idFilme}")
    ResponseEntity<List<SessaoVO>> get(@RequestParam("id") UUID idFilme);
}
