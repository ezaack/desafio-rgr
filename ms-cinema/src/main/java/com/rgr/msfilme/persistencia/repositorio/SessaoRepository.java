package com.rgr.msfilme.persistencia.repositorio;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.entidade.Sessao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SessaoRepository extends JpaRepository<Sessao, UUID> {

    @Query("From Sessao sessao INNER JOIN sessao.sala sala INNER JOIN sala.cinema WHERE cinema.id = :idCinema AND sessao.idFilme =:idFilme")
    List<Sessao> findByIdCinemaAndFilmes(@Param("idCinema") UUID idCinema, @Param("idFilme") UUID idFilme);


    List<Sessao> findByIdFilme( UUID idFilme);
}
