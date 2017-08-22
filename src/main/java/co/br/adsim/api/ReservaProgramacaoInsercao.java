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
public class ReservaProgramacaoInsercao implements Serializable {

    private Long id;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date data;
    private Long formatoId;
    private String formatoDescricao;
    private Long programaId;
    private String programaDescricao;
    private String programaMnemonico;
    private BigDecimal valorBruto;
    private BigDecimal valorLiquido;
    private String tipoDescriacao;
    private Character situacao;
    private Long reservaProgramacaoId;
    @JsonIgnore
    private Long empresa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Long getFormatoId() {
        return formatoId;
    }

    public void setFormatoId(Long formatoId) {
        this.formatoId = formatoId;
    }

    public String getFormatoDescricao() {
        return formatoDescricao;
    }

    public void setFormatoDescricao(String formatoDescricao) {
        this.formatoDescricao = formatoDescricao;
    }

    public Long getProgramaId() {
        return programaId;
    }

    public void setProgramaId(Long programaId) {
        this.programaId = programaId;
    }

    public String getProgramaDescricao() {
        return programaDescricao;
    }

    public void setProgramaDescricao(String programaDescricao) {
        this.programaDescricao = programaDescricao;
    }

    public String getProgramaMnemonico() {
        return programaMnemonico;
    }

    public void setProgramaMnemonico(String programaMnemonico) {
        this.programaMnemonico = programaMnemonico;
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

    public String getTipoDescriacao() {
        return tipoDescriacao;
    }

    public void setTipoDescriacao(String tipoDescriacao) {
        this.tipoDescriacao = tipoDescriacao;
    }

    public Character getSituacao() {
        return situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao = situacao;
    }

    public Long getReservaProgramacaoId() {
        return reservaProgramacaoId;
    }

    public void setReservaProgramacaoId(Long reservaProgramacaoId) {
        this.reservaProgramacaoId = reservaProgramacaoId;
    }

    public Long getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Long empresa) {
        this.empresa = empresa;
    }
}
