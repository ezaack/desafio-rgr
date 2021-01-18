package com.rgr.msfilme.controller.sessao.imp;

import com.rgr.msfilme.controller.sessao.AlteraSessaoRestController;
import com.rgr.msfilme.model.vo.SessaoVO;
import com.rgr.msfilme.services.sessao.AlterarSessaoService;
import com.rgr.msfilme.utilitarios.helpers.ConverteEntidadeSessaoEmSessaoVOHelper;
import com.rgr.msfilme.utilitarios.helpers.ConverteSessaoVoEmEntidadeSessaoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlteraSessaoRestControllerImpl implements AlteraSessaoRestController {

    @Autowired
    private AlterarSessaoService alteraFilmeService;

    @Override
    public ResponseEntity<SessaoVO> put(SessaoVO sessaoVO) {
        return ResponseEntity.ok(
                ConverteEntidadeSessaoEmSessaoVOHelper.converter(
                        alteraFilmeService.altera(
                                ConverteSessaoVoEmEntidadeSessaoHelper.converter(sessaoVO)
                        )
                )
        );
    }
}
