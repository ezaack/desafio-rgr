package com.rgr.msfilme.controller.cinema.imp;

import com.rgr.msfilme.controller.AlteraFilmeRestController;
import com.rgr.msfilme.model.vo.FilmeVO;
import com.rgr.msfilme.services.AlterarFilmeService;
import com.rgr.msfilme.utilitarios.ConverteEntidadeFilmeEmFilmeVoHelper;
import com.rgr.msfilme.utilitarios.ConverteFilmeVoEmEntidadeFilmeHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlteraFilmeRestControllerImpl implements AlteraFilmeRestController {

    @Autowired
    private AlterarFilmeService alteraFilmeService;

    @Override
    public ResponseEntity<FilmeVO> put(FilmeVO filmeVO) {
        return ResponseEntity.ok(
                ConverteEntidadeFilmeEmFilmeVoHelper.converter(
                        alteraFilmeService.altera(
                                ConverteFilmeVoEmEntidadeFilmeHelper.converter(filmeVO)
                        )
                )
        );
    }
}
