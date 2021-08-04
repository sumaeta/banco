package com.api.banco.model;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Movimentacao {

        @Embeddable
        public class MovimentacaoId implements Serializable {
        private long idMovimento;
        private long idUsuario;

        public MovimentacaoId() {
        }

        public MovimentacaoId(long idMovimento, long idUsuario) {
            this.idMovimento = idMovimento;
            this.idUsuario = idUsuario;
        }

        public long getIdMovimento() {
            return idMovimento;
        }

        public void setIdMovimento(long idMovimento) {
            this.idMovimento = idMovimento;
        }

        public long getIdUsuario() {
            return idUsuario;
        }

        public void setIdUsuario(long idUsuario) {
            this.idUsuario = idUsuario;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MovimentacaoId that = (MovimentacaoId) o;
            return idMovimento == that.idMovimento;
        }

        @Override
        public int hashCode() {
            return Objects.hash(idMovimento);
        }
    }

        @EmbeddedId
        private MovimentacaoId id;
        private LocalDateTime dataEntrada;
        private LocalDateTime dataSaida;
        private BigDecimal periodo;
        private Ocorrencia ocorrencia;
        private Calendario calendario;

    public Movimentacao() {
    }

    public Movimentacao(MovimentacaoId id, LocalDateTime dataEntrada, LocalDateTime dataSaida, BigDecimal periodo, Ocorrencia ocorrencia, Calendario calendario) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.periodo = periodo;
        this.ocorrencia = ocorrencia;
        this.calendario = calendario;
    }

    public MovimentacaoId getId() {
        return id;
    }

    public void setId(MovimentacaoId id) {
        this.id = id;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDateTime getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDateTime dataSaida) {
        this.dataSaida = dataSaida;
    }

    public BigDecimal getPeriodo() {
        return periodo;
    }

    public void setPeriodo(BigDecimal periodo) {
        this.periodo = periodo;
    }

    public Ocorrencia getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(Ocorrencia ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movimentacao that = (Movimentacao) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
