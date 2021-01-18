package com.rgr.msfilme.controller.cinema.imp;

import com.rgr.msfilme.controller.cinema.PersisteCinemaRestController;
import com.rgr.msfilme.model.vo.CinemaVO;
import com.rgr.msfilme.services.cinema.PersisteCinemaService;
import com.rgr.msfilme.utilitarios.helpers.ConverteCinemaVoEmEntidadeCinemaHelper;
import com.rgr.msfilme.utilitarios.helpers.ConverteEntidadeCinemaEmCinemaVoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersisteCinemaRestControllerImpl implements PersisteCinemaRestController {

    @Autowired
    private PersisteCinemaService persisteCinemaService;

    @Override
    public ResponseEntity<CinemaVO> post(CinemaVO cinemaVO) {
        return ResponseEntity.ok(
                ConverteEntidadeCinemaEmCinemaVoHelper.converter(
                        persisteCinemaService.persiste(
                                ConverteCinemaVoEmEntidadeCinemaHelper.converter(cinemaVO)
                        )
                )
        );

    }
}
