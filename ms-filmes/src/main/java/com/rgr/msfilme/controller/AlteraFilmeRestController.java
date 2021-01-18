package com.rgr.msfilme.controller;

import com.rgr.msfilme.model.vo.FilmeVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/filme")
public interface AlteraFilmeRestController {
    @PutMapping
    ResponseEntity<FilmeVO> put(@RequestBody FilmeVO filmeVO);
}
