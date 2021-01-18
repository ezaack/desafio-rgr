package com.rgr.msfilme.controller.sessao;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/sessao")
public interface ExcluiSessasoRestController {

    @DeleteMapping(value = "/{id}")
    ResponseEntity delete(@RequestParam("id") UUID id);
}
