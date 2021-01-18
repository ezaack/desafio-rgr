package com.rgr.msfilme.services.cinema.imp;

import javax.transaction.Transactional;

import com.rgr.msfilme.model.entidade.Cinema;
import com.rgr.msfilme.persistencia.repositorio.CinemaRepository;
import com.rgr.msfilme.services.cinema.PersisteCinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersisteCinemaServiceImpl implements PersisteCinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;

    @Override
    @Transactional
    public Cinema persiste(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }
}
