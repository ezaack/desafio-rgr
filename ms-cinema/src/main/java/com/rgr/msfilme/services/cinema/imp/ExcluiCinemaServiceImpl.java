package com.rgr.msfilme.services.cinema.imp;

import javax.transaction.Transactional;

import java.util.UUID;

import com.rgr.msfilme.persistencia.repositorio.CinemaRepository;
import com.rgr.msfilme.services.cinema.ExcluiCinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExcluiCinemaServiceImpl implements ExcluiCinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;

    @Override
    @Transactional
    public void exclui(UUID id) {
        cinemaRepository.deleteById(id);
    }
}
