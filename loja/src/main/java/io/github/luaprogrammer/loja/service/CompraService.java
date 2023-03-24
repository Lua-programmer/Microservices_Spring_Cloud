package io.github.luaprogrammer.loja.service;

import io.github.luaprogrammer.loja.controller.dto.CompraDTO;
import io.github.luaprogrammer.loja.controller.dto.InfoFornecedorDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Service
public class CompraService {

    public static String uri = "http://localhost:8081/info/";

    public void realizaCompra(CompraDTO compra) {
        RestTemplate client = new RestTemplate();
        ResponseEntity<InfoFornecedorDTO> exchange = client.exchange(uri + compra.getEndereco().getEstado(),
                HttpMethod.GET,
                HttpEntity.EMPTY,
                InfoFornecedorDTO.class);

        System.out.println(exchange.getBody().getEndereco());
    }
}
