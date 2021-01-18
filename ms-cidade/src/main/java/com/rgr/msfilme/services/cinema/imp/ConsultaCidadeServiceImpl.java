package com.rgr.msfilme.services.cinema.imp;

import java.util.List;
import java.util.UUID;

import com.rgr.msfilme.model.entidade.Cidade;
import com.rgr.msfilme.persistencia.repositorio.CidadeRepository;
import com.rgr.msfilme.services.ConsultaCidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaCidadeServiceImpl implements ConsultaCidadeService {
    @Autowired
    private CidadeRepository cidadeRepository;

    @Override
    public Cidade consulta(UUID id) {
        return cidadeRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Cidade> consultaTodas() {
        return cidadeRepository.findAll();
    }
}
