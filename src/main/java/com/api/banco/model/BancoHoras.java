package com.api.banco.model;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class BancoHoras {

    @Embeddable
    public class BancoHorasId implements Serializable {
        private long idBancoHoras;
        private long idMovimentacao;
        private long idUsuario;

        public BancoHorasId() {
        }

        public BancoHorasId(long idBancoHoras, long idMovimentacao, long idUsuario) {
            this.idBancoHoras = idBancoHoras;
            this.idMovimentacao = idMovimentacao;
            this.idUsuario = idUsuario;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BancoHorasId that = (BancoHorasId) o;
            return idBancoHoras == that.idBancoHoras && idMovimentacao == that.idMovimentacao && idUsuario == that.idUsuario;
        }

        @Override
        public int hashCode() {
            return Objects.hash(idBancoHoras, idMovimentacao, idUsuario);
        }
    }

    @EmbeddedId
    private BancoHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;

    public BancoHoras() {
    }

    public BancoHoras(BancoHorasId id, LocalDateTime dataTrabalhada, BigDecimal quantidadeHoras, BigDecimal saldoHoras) {
        this.id = id;
        this.dataTrabalhada = dataTrabalhada;
        this.quantidadeHoras = quantidadeHoras;
        this.saldoHoras = saldoHoras;
    }

    public BancoHorasId getId() {
        return id;
    }

    public void setId(BancoHorasId id) {
        this.id = id;
    }

    public LocalDateTime getDataTrabalhada() {
        return dataTrabalhada;
    }

    public void setDataTrabalhada(LocalDateTime dataTrabalhada) {
        this.dataTrabalhada = dataTrabalhada;
    }

    public BigDecimal getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(BigDecimal quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public BigDecimal getSaldoHoras() {
        return saldoHoras;
    }

    public void setSaldoHoras(BigDecimal saldoHoras) {
        this.saldoHoras = saldoHoras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BancoHoras that = (BancoHoras) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
