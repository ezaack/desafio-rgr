package com.rgr.msfilme.controller;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.vo.CidadeVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/cidade")
public interface ConsultaCidadeRestController {
    @GetMapping
    ResponseEntity<List<CidadeVO>> get();

    @GetMapping(value = "/{id}")
    ResponseEntity<CidadeVO> get(@RequestParam("id") UUID id);
}
