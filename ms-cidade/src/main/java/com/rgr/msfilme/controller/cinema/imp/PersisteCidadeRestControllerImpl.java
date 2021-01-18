package com.rgr.msfilme.controller.cinema.imp;

import com.rgr.msfilme.controller.PersisteCidadeRestController;
import com.rgr.msfilme.model.vo.CidadeVO;
import com.rgr.msfilme.services.PersisteCidadeService;
import com.rgr.msfilme.utilitarios.ConverteCidadeVoEmEntidadeCidadeHelper;
import com.rgr.msfilme.utilitarios.ConverteEntidadeCidadeEmCidadeVoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersisteCidadeRestControllerImpl implements PersisteCidadeRestController {

    @Autowired
    private PersisteCidadeService persisteCidadeService;

    @Override
    public ResponseEntity<CidadeVO> post(CidadeVO cidadeVO) {
        return ResponseEntity.ok(
                ConverteEntidadeCidadeEmCidadeVoHelper.converter(
                        persisteCidadeService.persiste(
                                ConverteCidadeVoEmEntidadeCidadeHelper.converter(cidadeVO)
                        )
                )
        );

    }
}
