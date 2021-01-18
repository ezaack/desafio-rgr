package com.rgr.msfilme.controller.sessao.imp;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.rgr.msfilme.controller.sessao.ConsultaSessaoPorFilmeRestController;
import com.rgr.msfilme.model.vo.SessaoVO;
import com.rgr.msfilme.services.sessao.ConsultaSessaoService;
import com.rgr.msfilme.utilitarios.helpers.ConverteEntidadeSessaoEmSessaoVOHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class ConsultaSessaoPorFilmeRestControllerImpl implements ConsultaSessaoPorFilmeRestController {
    @Autowired
    private ConsultaSessaoService consultaSessaoService;

    @Override
    public ResponseEntity<List<SessaoVO>> get(UUID idFilme) {
        return ResponseEntity.ok(
                consultaSessaoService.consultaPorFilme(idFilme).stream().map(
                        filme -> ConverteEntidadeSessaoEmSessaoVOHelper.converter(filme)
                ).collect(Collectors.toUnmodifiableList())
        );
    }
}
