package com.rgr.msfilme.services.cinema.imp;

import javax.transaction.Transactional;

import com.rgr.msfilme.model.entidade.Cidade;
import com.rgr.msfilme.persistencia.repositorio.CidadeRepository;
import com.rgr.msfilme.services.PersisteCidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersisteCidadeServiceImpl implements PersisteCidadeService {
    @Autowired
    private CidadeRepository cidadeRepository;

    @Override
    @Transactional
    public Cidade persiste(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }
}
