package com.rgr.msfilme.controller.sessao;

import com.rgr.msfilme.model.vo.SessaoVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/sessao")
public interface PersisteSessaoRestController {

    @PostMapping
    ResponseEntity<SessaoVO> post(@RequestBody SessaoVO sessaoVO);
}
