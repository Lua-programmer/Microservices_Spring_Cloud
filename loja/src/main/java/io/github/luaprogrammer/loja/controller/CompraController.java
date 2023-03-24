package io.github.luaprogrammer.loja.controller;

import io.github.luaprogrammer.loja.controller.dto.CompraDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @PostMapping
    public void realizaCompra(@RequestBody CompraDTO compra) {}
}
