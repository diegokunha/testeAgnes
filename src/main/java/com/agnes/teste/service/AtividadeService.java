package com.agnes.teste.service;

import com.agnes.teste.model.Atividade;
import com.agnes.teste.repository.AtividadeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class AtividadeService {

    private final AtividadeRepository repository;

    public Atividade save(Atividade atividade) {
        return repository.save(atividade);
    }

    public Page<Atividade> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Atividade findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
