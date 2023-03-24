package io.github.luaprogrammer.loja.controller;

import io.github.luaprogrammer.loja.controller.dto.CompraDTO;
import io.github.luaprogrammer.loja.service.CompraService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class CompraController {

    private final CompraService service;

    public CompraController(CompraService service) {
        this.service = service;
    }

    @PostMapping
    public void realizaCompra(@RequestBody CompraDTO compra) {
        service.realizaCompra(compra);
    }
}
