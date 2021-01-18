package com.rgr.msfilme.persistencia.repositorio;

import java.util.UUID;

import com.rgr.msfilme.model.entidade.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, UUID> {
}
