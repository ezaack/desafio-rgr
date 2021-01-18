package com.rgr.msfilme.controller;

import com.rgr.msfilme.model.vo.FilmeVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/filme")
public interface PersisteFilmeRestController {

    @PostMapping
    ResponseEntity<FilmeVO> post(@RequestBody FilmeVO filmeVO);
}
