package com.rgr.msfilme.services.cinema.imp;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.entidade.Cinema;
import com.rgr.msfilme.persistencia.repositorio.CinemaRepository;
import com.rgr.msfilme.services.cinema.ConsultaCinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaCinemaServiceImpl implements ConsultaCinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;

    @Override
    public Cinema consulta(UUID id) {
        return cinemaRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Cinema> consultaTodas() {
        return cinemaRepository.findAll();
    }

}
