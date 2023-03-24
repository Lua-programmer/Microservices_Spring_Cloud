package io.github.luaprogrammer.fornecedor.controller;

import io.github.luaprogrammer.fornecedor.model.InfoFornecedor;
import io.github.luaprogrammer.fornecedor.service.InfoFornecedorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    private final InfoFornecedorService service;

    public InfoController(InfoFornecedorService service) {
        this.service = service;
    }

    @GetMapping("/{estado}")
    public InfoFornecedor getInfoFornecedor(@PathVariable String estado) {
        return service.getInfoFornecedor(estado);
    }
}
