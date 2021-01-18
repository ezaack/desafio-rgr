package com.rgr.msfilme.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/cidade")
public interface ExcluiFilmeRestController {

    @DeleteMapping(value = "/{id}")
    ResponseEntity delete(@RequestParam("id") UUID id);
}
