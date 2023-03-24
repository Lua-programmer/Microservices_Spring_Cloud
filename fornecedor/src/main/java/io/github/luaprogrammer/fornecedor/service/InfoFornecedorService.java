package io.github.luaprogrammer.fornecedor.service;

import io.github.luaprogrammer.fornecedor.model.InfoFornecedor;
import io.github.luaprogrammer.fornecedor.repository.InfoFornecedorRepository;
import org.springframework.stereotype.Service;

@Service
public class InfoFornecedorService {

    private final InfoFornecedorRepository repository;

    public InfoFornecedorService(InfoFornecedorRepository repository) {
        this.repository = repository;
    }

    public InfoFornecedor getInfoFornecedor(String estado) {
        return repository.findByEstado(estado);
    }
}
