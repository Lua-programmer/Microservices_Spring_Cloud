package io.github.luaprogrammer.loja.controller.dto;

public class InfoFornecedorDTO {

    private EnderecoDTO enderecoFornecedor;

    public InfoFornecedorDTO(EnderecoDTO enderecoFornecedor) {
        this.enderecoFornecedor = enderecoFornecedor;
    }

    public InfoFornecedorDTO() {
    }

    public EnderecoDTO getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    public void setEnderecoFornecedor(EnderecoDTO enderecoFornecedor) {
        this.enderecoFornecedor = enderecoFornecedor;
    }
}
