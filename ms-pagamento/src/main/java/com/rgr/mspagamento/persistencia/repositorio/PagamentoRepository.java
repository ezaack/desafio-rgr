package com.rgr.mspagamento.persistencia.repositorio;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.rgr.mspagamento.model.entidade.Pagamento;
import com.rgr.mspagamento.model.enumeracoes.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, UUID> {

    List<Pagamento> findByStatus(Status status);
}
