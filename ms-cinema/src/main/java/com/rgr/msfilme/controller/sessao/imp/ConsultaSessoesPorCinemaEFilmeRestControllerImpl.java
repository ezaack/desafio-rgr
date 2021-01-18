package com.rgr.msfilme.controller.sessao.imp;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.rgr.msfilme.controller.sessao.ConsultaSessoesPorCinemaEFilmeRestController;
import com.rgr.msfilme.model.vo.SessaoVO;
import com.rgr.msfilme.services.sessao.ConsultaSessoesPorCinemaEFilmeService;
import com.rgr.msfilme.utilitarios.helpers.ConverteEntidadeSessaoEmSessaoVOHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultaSessoesPorCinemaEFilmeRestControllerImpl implements ConsultaSessoesPorCinemaEFilmeRestController {

    @Autowired
    private ConsultaSessoesPorCinemaEFilmeService consultaSessoesPorCinemaEFilmeService;

    @Override
    public ResponseEntity<List<SessaoVO>> get(UUID idCinema, UUID idFilme) {
        return ResponseEntity.ok(
                consultaSessoesPorCinemaEFilmeService.findByIdCinemaAndFilmes(idCinema, idFilme).stream().map(
                        sessao -> ConverteEntidadeSessaoEmSessaoVOHelper.converter(
                                sessao
                        )
                ).collect(Collectors.toList())

        );
    }
}
