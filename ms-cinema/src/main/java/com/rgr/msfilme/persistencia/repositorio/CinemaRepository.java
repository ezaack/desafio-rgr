package com.rgr.msfilme.persistencia.repositorio;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.entidade.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema, UUID> {

    List<Cinema> findByIdCidade(UUID idCidade);
}
