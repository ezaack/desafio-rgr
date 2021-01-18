package com.rgr.msfilme.controller.cinema;

import com.rgr.msfilme.model.vo.CinemaVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/cinema")
public interface PersisteCinemaRestController {

    @PostMapping
    ResponseEntity<CinemaVO> post(@RequestBody CinemaVO cinemaVO);
}
