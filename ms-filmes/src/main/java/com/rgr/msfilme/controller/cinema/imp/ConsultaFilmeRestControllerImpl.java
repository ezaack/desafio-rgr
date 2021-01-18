package com.rgr.msfilme.controller.cinema.imp;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.rgr.msfilme.controller.ConsultaFilmeRestController;
import com.rgr.msfilme.model.vo.FilmeVO;
import com.rgr.msfilme.services.ConsultaFilmeService;
import com.rgr.msfilme.utilitarios.ConverteEntidadeFilmeEmFilmeVoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultaFilmeRestControllerImpl implements ConsultaFilmeRestController {
    @Autowired
    private ConsultaFilmeService consultaFilmeService;

    @Override
    public ResponseEntity<List<FilmeVO>> get() {
        return ResponseEntity.ok(
                consultaFilmeService.consultaTodas().stream().map(
                        filme -> ConverteEntidadeFilmeEmFilmeVoHelper.converter(filme)
                ).collect(Collectors.toUnmodifiableList())
        );
    }

    @Override
    public ResponseEntity<FilmeVO> get(UUID id) {
        return ResponseEntity.ok(
                ConverteEntidadeFilmeEmFilmeVoHelper.converter(
                        consultaFilmeService.consulta(id)
                )
        );
    }
}
