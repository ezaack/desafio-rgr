package com.rgr.msfilme.controller.sessao;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.vo.SessaoVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/sessao-por-cinema-e-filme")
public interface ConsultaSessoesPorCinemaEFilmeRestController {
    @GetMapping(value = "/{idCinema}/{idFilme}")
    ResponseEntity<List<SessaoVO>> get(@RequestParam("idCinema") UUID idCinema, @RequestParam("idFilme") UUID idFilme);
}
