package com.rgr.msfilme.controller.sessao.imp;

import java.util.UUID;

import com.rgr.msfilme.controller.sessao.ExcluiSessasoRestController;
import com.rgr.msfilme.services.sessao.ExcluiSessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExcluiSessasoRestControllerImpl implements ExcluiSessasoRestController {

    @Autowired
    private ExcluiSessaoService excluiSessaoService;

    @Override
    public ResponseEntity delete(UUID id) {
        excluiSessaoService.exclui(id);
        return ResponseEntity.ok().build();
    }
}
