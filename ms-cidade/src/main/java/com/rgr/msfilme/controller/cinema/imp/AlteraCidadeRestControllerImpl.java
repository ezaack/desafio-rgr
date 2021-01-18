package com.rgr.msfilme.controller.cinema.imp;

import com.rgr.msfilme.controller.AlteraCidadeRestController;
import com.rgr.msfilme.model.vo.CidadeVO;
import com.rgr.msfilme.services.AlteraCidadeService;
import com.rgr.msfilme.utilitarios.ConverteCidadeVoEmEntidadeCidadeHelper;
import com.rgr.msfilme.utilitarios.ConverteEntidadeCidadeEmCidadeVoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlteraCidadeRestControllerImpl implements AlteraCidadeRestController {

    @Autowired
    private AlteraCidadeService alteraCidadeService;

    @Override
    public ResponseEntity<CidadeVO> put(CidadeVO cidadeVO) {
        return ResponseEntity.ok(
                ConverteEntidadeCidadeEmCidadeVoHelper.converter(
                        alteraCidadeService.altera(
                                ConverteCidadeVoEmEntidadeCidadeHelper.converter(cidadeVO)
                        )
                )
        );
    }
}
