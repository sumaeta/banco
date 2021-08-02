package com.api.banco.model;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Usuario {

    private Long id;

    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String nome;

    @ManyToOne
    private Empresa empresa;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;

    public Usuario() {
    }

    public Usuario(Long id, CategoriaUsuario categoriaUsuario, String nome, Empresa empresa, NivelAcesso nivelAcesso, JornadaTrabalho jornadaTrabalho, BigDecimal tolerancia, LocalDateTime inicioJornada, LocalDateTime finalJornada) {
        this.id = id;
        this.categoriaUsuario = categoriaUsuario;
        this.nome = nome;
        this.empresa = empresa;
        this.nivelAcesso = nivelAcesso;
        this.jornadaTrabalho = jornadaTrabalho;
        this.tolerancia = tolerancia;
        this.inicioJornada = inicioJornada;
        this.finalJornada = finalJornada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CategoriaUsuario getCategoriaUsuario() {
        return categoriaUsuario;
    }

    public void setCategoriaUsuario(CategoriaUsuario categoriaUsuario) {
        this.categoriaUsuario = categoriaUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(NivelAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public JornadaTrabalho getJornadaTrabalho() {
        return jornadaTrabalho;
    }

    public void setJornadaTrabalho(JornadaTrabalho jornadaTrabalho) {
        this.jornadaTrabalho = jornadaTrabalho;
    }

    public BigDecimal getTolerancia() {
        return tolerancia;
    }

    public void setTolerancia(BigDecimal tolerancia) {
        this.tolerancia = tolerancia;
    }

    public LocalDateTime getInicioJornada() {
        return inicioJornada;
    }

    public void setInicioJornada(LocalDateTime inicioJornada) {
        this.inicioJornada = inicioJornada;
    }

    public LocalDateTime getFinalJornada() {
        return finalJornada;
    }

    public void setFinalJornada(LocalDateTime finalJornada) {
        this.finalJornada = finalJornada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id.equals(usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

