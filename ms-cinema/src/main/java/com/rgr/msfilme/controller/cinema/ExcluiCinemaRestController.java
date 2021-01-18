package com.rgr.msfilme.controller.cinema;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/cinema")
public interface ExcluiCinemaRestController {

    @DeleteMapping(value = "/{id}")
    ResponseEntity delete(@RequestParam("id") UUID id);
}
