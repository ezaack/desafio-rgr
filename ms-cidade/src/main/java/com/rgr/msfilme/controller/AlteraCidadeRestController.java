package com.rgr.msfilme.controller;

import com.rgr.msfilme.model.vo.CidadeVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/cidade")
public interface AlteraCidadeRestController {
    @PutMapping
    ResponseEntity<CidadeVO> put(@RequestBody CidadeVO cidadeVO);
}
