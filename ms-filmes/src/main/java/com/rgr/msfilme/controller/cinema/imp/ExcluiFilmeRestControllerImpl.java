package com.rgr.msfilme.controller.cinema.imp;

import java.util.UUID;

import com.rgr.msfilme.controller.ExcluiFilmeRestController;
import com.rgr.msfilme.services.ExcluiFilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExcluiFilmeRestControllerImpl implements ExcluiFilmeRestController {

    @Autowired
    private ExcluiFilmeService excluiFilmeService;

    @Override
    public ResponseEntity delete(UUID id) {
        excluiFilmeService.exclui(id);
        return ResponseEntity.ok().build();
    }
}
