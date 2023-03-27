package io.github.luaprogrammer.loja.service;

import io.github.luaprogrammer.loja.client.FornecedorClient;
import io.github.luaprogrammer.loja.controller.dto.CompraDTO;
import io.github.luaprogrammer.loja.controller.dto.InfoFornecedorDTO;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

    private final FornecedorClient client;

    public CompraService(FornecedorClient client) {
        this.client = client;
    }

    public void realizaCompra(CompraDTO compra) {
        InfoFornecedorDTO info = client.getInfoFornecedor(compra.getEndereco().getEstado());

        System.out.println(info.getEndereco());
    }
}
