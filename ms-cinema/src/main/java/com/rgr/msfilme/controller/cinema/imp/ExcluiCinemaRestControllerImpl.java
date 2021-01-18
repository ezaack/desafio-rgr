package com.rgr.msfilme.controller.cinema.imp;

import java.util.UUID;

import com.rgr.msfilme.controller.cinema.ExcluiCinemaRestController;
import com.rgr.msfilme.services.cinema.ExcluiCinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExcluiCinemaRestControllerImpl implements ExcluiCinemaRestController {

    @Autowired
    private ExcluiCinemaService excluiCinemaService;

    @Override
    public ResponseEntity delete(UUID id) {
        excluiCinemaService.exclui(id);
        return ResponseEntity.ok().build();
    }
}
