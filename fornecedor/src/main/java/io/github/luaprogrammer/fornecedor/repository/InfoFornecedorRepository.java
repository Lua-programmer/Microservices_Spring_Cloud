package io.github.luaprogrammer.fornecedor.repository;

import io.github.luaprogrammer.fornecedor.model.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoFornecedorRepository extends CrudRepository<InfoFornecedor, Long> {
    InfoFornecedor findByEstado(String estado);
}
