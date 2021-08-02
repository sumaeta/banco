package com.api.banco.model;

import java.util.Objects;

public class TipoData {

    private Long id;
    private String descricao;

    public TipoData() {
    }

    public TipoData(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoData tipoData = (TipoData) o;
        return id.equals(tipoData.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
