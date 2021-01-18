package com.rgr.msfilme.controller.sessao.imp;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.rgr.msfilme.controller.sessao.ConsultaSessaoRestController;
import com.rgr.msfilme.model.vo.SessaoVO;
import com.rgr.msfilme.services.sessao.ConsultaSessaoService;
import com.rgr.msfilme.utilitarios.helpers.ConverteEntidadeSessaoEmSessaoVOHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultaSessaoRestControllerImpl implements ConsultaSessaoRestController {
    @Autowired
    private ConsultaSessaoService consultaSessaoService;

    @Override
    public ResponseEntity<List<SessaoVO>> get() {
        return ResponseEntity.ok(
                consultaSessaoService.consultaTodas().stream().map(
                        filme -> ConverteEntidadeSessaoEmSessaoVOHelper.converter(filme)
                ).collect(Collectors.toUnmodifiableList())
        );
    }

    @Override
    public ResponseEntity<SessaoVO> get(UUID id) {
        return ResponseEntity.ok(
                ConverteEntidadeSessaoEmSessaoVOHelper.converter(
                        consultaSessaoService.consulta(id)
                )
        );
    }
}
