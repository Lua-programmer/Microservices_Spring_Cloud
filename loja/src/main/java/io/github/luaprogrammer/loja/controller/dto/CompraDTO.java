package io.github.luaprogrammer.loja.controller.dto;

import java.util.List;

public class CompraDTO {
    private List<ItemDTO> itens;

    private EnderecoDTO endereco;

    public CompraDTO(List<ItemDTO> itens, EnderecoDTO endereco) {
        this.itens = itens;
        this.endereco = endereco;
    }

    public CompraDTO() {
    }

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
