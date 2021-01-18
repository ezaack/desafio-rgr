package com.rgr.msfilme.controller.cinema.imp;

import com.rgr.msfilme.controller.cinema.AlteraCinemaRestController;
import com.rgr.msfilme.model.vo.CinemaVO;
import com.rgr.msfilme.services.cinema.AlterarCinemaService;
import com.rgr.msfilme.utilitarios.helpers.ConverteEntidadeCinemaEmCinemaVoHelper;
import com.rgr.msfilme.utilitarios.helpers.ConverteCinemaVoEmEntidadeCinemaHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlteraCinemaRestControllerImpl implements AlteraCinemaRestController {

    @Autowired
    private AlterarCinemaService alteraFilmeService;

    @Override
    public ResponseEntity<CinemaVO> put(CinemaVO cinemaVO) {
        return ResponseEntity.ok(
                ConverteEntidadeCinemaEmCinemaVoHelper.converter(
                        alteraFilmeService.altera(
                                ConverteCinemaVoEmEntidadeCinemaHelper.converter(cinemaVO)
                        )
                )
        );
    }
}
