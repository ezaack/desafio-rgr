package com.rgr.msfilme.controller.cinema.imp;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.rgr.msfilme.controller.cinema.ConsultaCinemaRestController;
import com.rgr.msfilme.model.vo.CinemaVO;
import com.rgr.msfilme.services.cinema.ConsultaCinemaService;
import com.rgr.msfilme.utilitarios.helpers.ConverteEntidadeCinemaEmCinemaVoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultaCinemaRestControllerImpl implements ConsultaCinemaRestController {
    @Autowired
    private ConsultaCinemaService consultaCinemaService;

    @Override
    public ResponseEntity<List<CinemaVO>> get() {
        return ResponseEntity.ok(
                consultaCinemaService.consultaTodas().stream().map(
                        filme -> ConverteEntidadeCinemaEmCinemaVoHelper.converter(filme)
                ).collect(Collectors.toUnmodifiableList())
        );
    }

    @Override
    public ResponseEntity<CinemaVO> get(UUID id) {
        return ResponseEntity.ok(
                ConverteEntidadeCinemaEmCinemaVoHelper.converter(
                        consultaCinemaService.consulta(id)
                )
        );
    }
}
