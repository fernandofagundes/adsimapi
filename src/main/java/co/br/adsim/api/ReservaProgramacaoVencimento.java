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
public class ReservaProgramacaoVencimento implements Serializable {
    
    private Long id;
    private String numero;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dataCadastro;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dataVencimento;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dataBasquete;
    private BigDecimal valorBruto;
    private BigDecimal valorLiquido;
    private BigDecimal valorFaturar;
    private Character situacao;
    private Long reservaProgramacao;
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

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataBasquete() {
        return dataBasquete;
    }

    public void setDataBasquete(Date dataBasquete) {
        this.dataBasquete = dataBasquete;
    }

    public BigDecimal getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(BigDecimal valorBruto) {
        this.valorBruto = valorBruto;
    }

    public BigDecimal getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(BigDecimal valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public BigDecimal getValorFaturar() {
        return valorFaturar;
    }

    public void setValorFaturar(BigDecimal valorFaturar) {
        this.valorFaturar = valorFaturar;
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

    public Long getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Long empresa) {
        this.empresa = empresa;
    }
}
