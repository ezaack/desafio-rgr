package com.rgr.msfilme.controller;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.vo.FilmeVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/filme-por-cidade")
public interface ConsultaFilmePorCidadeRestController {

    @GetMapping(value = "/{idCidade}")
    ResponseEntity<List<FilmeVO>> get(@RequestParam("idCidade") UUID id);
}
