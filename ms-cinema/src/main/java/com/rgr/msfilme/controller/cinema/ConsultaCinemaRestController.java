package com.rgr.msfilme.controller.cinema;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.vo.CinemaVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/cinema")
public interface ConsultaCinemaRestController {
    @GetMapping
    ResponseEntity<List<CinemaVO>> get();

    @GetMapping(value = "/{id}")
    ResponseEntity<CinemaVO> get(@RequestParam("id") UUID id);
}
