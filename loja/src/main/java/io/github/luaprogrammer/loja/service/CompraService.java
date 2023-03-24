package io.github.luaprogrammer.loja.service;

import io.github.luaprogrammer.loja.controller.dto.CompraDTO;
import io.github.luaprogrammer.loja.controller.dto.InfoFornecedorDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    public void realizaCompra(CompraDTO compra) {
        RestTemplate client = new RestTemplate();
        ResponseEntity<InfoFornecedorDTO> exchange = client.exchange("http://8081/info/" + compra.getEndereco().getEstado(),
                HttpMethod.GET,
                HttpEntity.EMPTY,
                InfoFornecedorDTO.class);

        System.out.println(exchange.getBody().getEnderecoFornecedor());
    }
}
