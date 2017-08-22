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
public class ReservaProgramacaoFatura  implements Serializable {

    private Long id;
    private String numero;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dataEmissao;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dataVencimento;
    private BigDecimal valorBruto;
    private BigDecimal valorLiquido;
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
