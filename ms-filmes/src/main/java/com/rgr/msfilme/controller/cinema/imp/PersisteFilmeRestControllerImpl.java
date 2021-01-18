package com.rgr.msfilme.controller.cinema.imp;

import com.rgr.msfilme.controller.PersisteFilmeRestController;
import com.rgr.msfilme.model.vo.FilmeVO;
import com.rgr.msfilme.services.PersisteFilmeService;
import com.rgr.msfilme.utilitarios.ConverteFilmeVoEmEntidadeFilmeHelper;
import com.rgr.msfilme.utilitarios.ConverteEntidadeFilmeEmFilmeVoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersisteFilmeRestControllerImpl implements PersisteFilmeRestController {

    @Autowired
    private PersisteFilmeService persisteFilmeService;

    @Override
    public ResponseEntity<FilmeVO> post(FilmeVO filmeVO) {
        return ResponseEntity.ok(
                ConverteEntidadeFilmeEmFilmeVoHelper.converter(
                        persisteFilmeService.persiste(
                                ConverteFilmeVoEmEntidadeFilmeHelper.converter(filmeVO)
                        )
                )
        );

    }
}
