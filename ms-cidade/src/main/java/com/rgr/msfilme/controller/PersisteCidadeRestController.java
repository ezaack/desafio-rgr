package com.rgr.msfilme.controller;

import com.rgr.msfilme.model.vo.CidadeVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/cidade")
public interface PersisteCidadeRestController {

    @PostMapping
    ResponseEntity<CidadeVO> post(@RequestBody CidadeVO cidadeVO);
}
