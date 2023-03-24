package io.github.luaprogrammer.loja.controller.dto;

public class ItemDTO {

    private Long id;

    private Integer quantidade;

    public ItemDTO(Long id, Integer quantidade) {
        this.id = id;
        this.quantidade = quantidade;
    }

    public ItemDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}