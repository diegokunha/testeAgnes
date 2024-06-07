package com.agnes.teste.service;

import com.agnes.teste.model.Projeto;
import com.agnes.teste.repository.ProjetoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjetoService {

    private final ProjetoRepository repository;

    public Projeto save(Projeto projeto) {
        return repository.save(projeto);
    }

    public Page<Projeto> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Projeto findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
