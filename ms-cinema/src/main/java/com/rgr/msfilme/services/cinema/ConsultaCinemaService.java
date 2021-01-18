package com.rgr.msfilme.services.cinema;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.entidade.Cinema;

public interface ConsultaCinemaService {

    Cinema consulta(UUID id);

    List<Cinema> consultaTodas();



}
