package co.br.adsim.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * Created by fernandofagundes on 21/08/17.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReservaProgramacaoContaReceber implements Serializable {

    private Long id;
    private String numero;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dataEmissao;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dataVencimento;
    private BigDecimal valor;
    private Character situacao;
    private Long reservaProgramacao;
    private Long reservaProgramacaoVencimento;
    private Long reservaProgramacaoFatura;
    @JsonIgnore
    private Long empresa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Character getSituacao() {
        return situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao = situacao;
    }

    public Long getReservaProgramacao() {
        return reservaProgramacao;
    }

    public void setReservaProgramacao(Long reservaProgramacao) {
        this.reservaProgramacao = reservaProgramacao;
    }

    public Long getReservaProgramacaoVencimento() {
        return reservaProgramacaoVencimento;
    }

    public void setReservaProgramacaoVencimento(Long reservaProgramacaoVencimento) {
        this.reservaProgramacaoVencimento = reservaProgramacaoVencimento;
    }

    public Long getReservaProgramacaoFatura() {
        return reservaProgramacaoFatura;
    }

    public void setReservaProgramacaoFatura(Long reservaProgramacaoFatura) {
        this.reservaProgramacaoFatura = reservaProgramacaoFatura;
    }

    public Long getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Long empresa) {
        this.empresa = empresa;
    }
}
