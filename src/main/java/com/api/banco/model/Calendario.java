package com.api.banco.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Calendario {

    private Long id;
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;

    public Calendario() {
    }

    public Calendario(Long id, TipoData tipoData, String descricao, LocalDateTime dataEspecial) {
        this.id = id;
        this.tipoData = tipoData;
        this.descricao = descricao;
        this.dataEspecial = dataEspecial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoData getTipoData() {
        return tipoData;
    }

    public void setTipoData(TipoData tipoData) {
        this.tipoData = tipoData;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataEspecial() {
        return dataEspecial;
    }

    public void setDataEspecial(LocalDateTime dataEspecial) {
        this.dataEspecial = dataEspecial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendario that = (Calendario) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
