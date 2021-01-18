package com.rgr.msfilme.controller.cinema.imp;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.rgr.msfilme.controller.ConsultaCidadeRestController;
import com.rgr.msfilme.model.vo.CidadeVO;
import com.rgr.msfilme.services.ConsultaCidadeService;
import com.rgr.msfilme.utilitarios.ConverteEntidadeCidadeEmCidadeVoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultaCidadeRestControllerImpl implements ConsultaCidadeRestController {
    @Autowired
    private ConsultaCidadeService consultaCidadeService;

    @Override
    public ResponseEntity<List<CidadeVO>> get() {
        return ResponseEntity.ok(
                consultaCidadeService.consultaTodas().stream().map(
                        cidade -> ConverteEntidadeCidadeEmCidadeVoHelper.converter(cidade)
                ).collect(Collectors.toUnmodifiableList())
        );
    }

    @Override
    public ResponseEntity<CidadeVO> get(UUID id) {
        return ResponseEntity.ok(
                ConverteEntidadeCidadeEmCidadeVoHelper.converter(
                        consultaCidadeService.consulta(id)
                )
        );
    }
}
