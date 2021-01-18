package com.rgr.msfilme.controller.cinema.imp;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.rgr.msfilme.controller.ConsultaFilmePorCidadeRestController;
import com.rgr.msfilme.model.vo.FilmeVO;
import com.rgr.msfilme.services.ConsultaFilmePorCidadeService;
import com.rgr.msfilme.utilitarios.ConverteEntidadeFilmeEmFilmeVoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultaFilmePorCidadeRestControllerImpl implements ConsultaFilmePorCidadeRestController {
    @Autowired
    private ConsultaFilmePorCidadeService consultaFilmePorCidadeService;


    @Override
    public ResponseEntity<List<FilmeVO>> get(UUID idCidade) {
        return ResponseEntity.ok(
                consultaFilmePorCidadeService.findByIdCidade(idCidade).stream().map(
                        filme -> ConverteEntidadeFilmeEmFilmeVoHelper.converter(filme)
                ).collect(Collectors.toUnmodifiableList())
        );
    }
}
