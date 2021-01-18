package com.rgr.msfilme.controller.sessao;

import com.rgr.msfilme.model.vo.CinemaVO;
import com.rgr.msfilme.model.vo.SessaoVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/sessao")
public interface AlteraSessaoRestController {
    @PutMapping
    ResponseEntity<SessaoVO> put(@RequestBody SessaoVO cinemaVO);
}
