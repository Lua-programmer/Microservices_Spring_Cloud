package io.github.luaprogrammer.loja.controller.dto;

import java.util.List;

public class CompraDTO {
    private List<ItemDTO> itens;

    private EnderecoDTO endereco;

    public List<ItemDTO> getItens() {
        return itens;
    }

    public void setItens(List<ItemDTO> itens) {
        this.itens = itens;
    }

    public EnderecoDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
    }
}
