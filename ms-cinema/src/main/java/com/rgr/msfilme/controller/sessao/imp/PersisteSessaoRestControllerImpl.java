package com.rgr.msfilme.controller.sessao.imp;

import com.rgr.msfilme.controller.sessao.PersisteSessaoRestController;
import com.rgr.msfilme.model.vo.SessaoVO;
import com.rgr.msfilme.services.sessao.PersisteSessaoService;
import com.rgr.msfilme.utilitarios.helpers.ConverteEntidadeSessaoEmSessaoVOHelper;
import com.rgr.msfilme.utilitarios.helpers.ConverteSessaoVoEmEntidadeSessaoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersisteSessaoRestControllerImpl implements PersisteSessaoRestController {

    @Autowired
    private PersisteSessaoService persisteSessaoService;

    @Override
    public ResponseEntity<SessaoVO> post(SessaoVO sessaoVO) {
        return ResponseEntity.ok(
                ConverteEntidadeSessaoEmSessaoVOHelper.converter(
                        persisteSessaoService.persiste(
                                ConverteSessaoVoEmEntidadeSessaoHelper.converter(sessaoVO)
                        )
                )
        );

    }
}
