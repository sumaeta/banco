package com.api.banco.model;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Objects;

public class Localidade {

    private Long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;

    public Localidade() {
    }

    public Localidade(Long id, NivelAcesso nivelAcesso, String descricao) {
        this.id = id;
        this.nivelAcesso = nivelAcesso;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(NivelAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
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
        Localidade that = (Localidade) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
