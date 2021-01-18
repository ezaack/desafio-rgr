package com.rgr.msfilme.persistencia.repositorio;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.rgr.msfilme.model.entidade.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FilmeRepository extends JpaRepository<Filme, UUID> {

    List<Filme> findByIdCidade(UUID idCinema);
}
