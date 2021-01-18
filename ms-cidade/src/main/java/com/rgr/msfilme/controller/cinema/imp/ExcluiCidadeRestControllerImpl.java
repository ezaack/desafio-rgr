package com.rgr.msfilme.controller.cinema.imp;

import java.util.UUID;

import com.rgr.msfilme.controller.ExcluiCidadeRestController;
import com.rgr.msfilme.services.ExcluiCidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExcluiCidadeRestControllerImpl implements ExcluiCidadeRestController {

    @Autowired
    private ExcluiCidadeService excluiCidadeService;

    @Override
    public ResponseEntity delete(UUID id) {
        excluiCidadeService.exclui(id);
        return ResponseEntity.ok().build();
    }
}
