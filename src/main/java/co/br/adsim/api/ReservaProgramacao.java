package co.br.adsim.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by fernandofagundes on 21/08/17.
 */

@JacksonXmlRootElement()
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReservaProgramacao implements Serializable {

    private Long id;
    private String numero;
    private String negocioNumero;
    private String numeroReferencia;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dataCadastro;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dataEnvio;
    private Long veiculo;
    private Long praca;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date veiculacaoInicio;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date veiculacaoFim;
    private String clienteNome;
    private String clienteIdentificador;
    private String agenciaNome;
    private String agenciaIdentificador;
    private String contatoNome;
    private String contatoIdentificador;
    private Long tabelaPrecoId;
    private String tabelaPrecoTitulo;
    private Long negociacaoTipoId;
    private String negociacaoTipoDescricao;
    private Long veiculacaoTipoId;
    private String veiculacaoTipoDescricao;
    private Long naturezaId;
    private String naturezaDescricao;
    private BigDecimal valorBruto;
    private BigDecimal valorNegociado;
    private BigDecimal valorLiquido;
    @JsonIgnore
    private Long empresa;
    @JsonIgnore
    private Long usuario;
    private List<ReservaProgramacaoInsercao> reservaProgramacaoInsercao;
    private List<ReservaProgramacaoVencimento> reservaProgramacaoVencimento ;
    private List<ReservaProgramacaoContaReceber> reservaProgramacaoContaReceber;
    private List<ReservaProgramacaoFatura> reservaProgramacaoFatura;

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

    public String getNegocioNumero() {
        return negocioNumero;
    }

    public void setNegocioNumero(String negocioNumero) {
        this.negocioNumero = negocioNumero;
    }

    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(String numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public Long getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Long veiculo) {
        this.veiculo = veiculo;
    }

    public Long getPraca() {
        return praca;
    }

    public void setPraca(Long praca) {
        this.praca = praca;
    }

    public Date getVeiculacaoInicio() {
        return veiculacaoInicio;
    }

    public void setVeiculacaoInicio(Date veiculacaoInicio) {
        this.veiculacaoInicio = veiculacaoInicio;
    }

    public Date getVeiculacaoFim() {
        return veiculacaoFim;
    }

    public void setVeiculacaoFim(Date veiculacaoFim) {
        this.veiculacaoFim = veiculacaoFim;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getClienteIdentificador() {
        return clienteIdentificador;
    }

    public void setClienteIdentificador(String clienteIdentificador) {
        this.clienteIdentificador = clienteIdentificador;
    }

    public String getAgenciaNome() {
        return agenciaNome;
    }

    public void setAgenciaNome(String agenciaNome) {
        this.agenciaNome = agenciaNome;
    }

    public String getAgenciaIdentificador() {
        return agenciaIdentificador;
    }

    public void setAgenciaIdentificador(String agenciaIdentificador) {
        this.agenciaIdentificador = agenciaIdentificador;
    }

    public String getContatoNome() {
        return contatoNome;
    }

    public void setContatoNome(String contatoNome) {
        this.contatoNome = contatoNome;
    }

    public String getContatoIdentificador() {
        return contatoIdentificador;
    }

    public void setContatoIdentificador(String contatoIdentificador) {
        this.contatoIdentificador = contatoIdentificador;
    }

    public Long getTabelaPrecoId() {
        return tabelaPrecoId;
    }

    public void setTabelaPrecoId(Long tabelaPrecoId) {
        this.tabelaPrecoId = tabelaPrecoId;
    }

    public String getTabelaPrecoTitulo() {
        return tabelaPrecoTitulo;
    }

    public void setTabelaPrecoTitulo(String tabelaPrecoTitulo) {
        this.tabelaPrecoTitulo = tabelaPrecoTitulo;
    }

    public Long getNegociacaoTipoId() {
        return negociacaoTipoId;
    }

    public void setNegociacaoTipoId(Long negociacaoTipoId) {
        this.negociacaoTipoId = negociacaoTipoId;
    }

    public String getNegociacaoTipoDescricao() {
        return negociacaoTipoDescricao;
    }

    public void setNegociacaoTipoDescricao(String negociacaoTipoDescricao) {
        this.negociacaoTipoDescricao = negociacaoTipoDescricao;
    }

    public Long getVeiculacaoTipoId() {
        return veiculacaoTipoId;
    }

    public void setVeiculacaoTipoId(Long veiculacaoTipoId) {
        this.veiculacaoTipoId = veiculacaoTipoId;
    }

    public String getVeiculacaoTipoDescricao() {
        return veiculacaoTipoDescricao;
    }

    public void setVeiculacaoTipoDescricao(String veiculacaoTipoDescricao) {
        this.veiculacaoTipoDescricao = veiculacaoTipoDescricao;
    }

    public Long getNaturezaId() {
        return naturezaId;
    }

    public void setNaturezaId(Long naturezaId) {
        this.naturezaId = naturezaId;
    }

    public String getNaturezaDescricao() {
        return naturezaDescricao;
    }

    public void setNaturezaDescricao(String naturezaDescricao) {
        this.naturezaDescricao = naturezaDescricao;
    }

    public BigDecimal getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(BigDecimal valorBruto) {
        this.valorBruto = valorBruto;
    }

    public BigDecimal getValorNegociado() {
        return valorNegociado;
    }

    public void setValorNegociado(BigDecimal valorNegociado) {
        this.valorNegociado = valorNegociado;
    }

    public BigDecimal getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(BigDecimal valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public Long getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Long empresa) {
        this.empresa = empresa;
    }

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }

    public List<ReservaProgramacaoInsercao> getReservaProgramacaoInsercao() {
        return reservaProgramacaoInsercao;
    }

    public void setReservaProgramacaoInsercao(List<ReservaProgramacaoInsercao> reservaProgramacaoInsercao) {
        this.reservaProgramacaoInsercao = reservaProgramacaoInsercao;
    }

    public List<ReservaProgramacaoVencimento> getReservaProgramacaoVencimento() {
        return reservaProgramacaoVencimento;
    }

    public void setReservaProgramacaoVencimento(List<ReservaProgramacaoVencimento> reservaProgramacaoVencimento) {
        this.reservaProgramacaoVencimento = reservaProgramacaoVencimento;
    }

    public List<ReservaProgramacaoContaReceber> getReservaProgramacaoContaReceber() {
        return reservaProgramacaoContaReceber;
    }

    public void setReservaProgramacaoContaReceber(List<ReservaProgramacaoContaReceber> reservaProgramacaoContaReceber) {
        this.reservaProgramacaoContaReceber = reservaProgramacaoContaReceber;
    }

    public List<ReservaProgramacaoFatura> getReservaProgramacaoFatura() {
        return reservaProgramacaoFatura;
    }

    public void setReservaProgramacaoFatura(List<ReservaProgramacaoFatura> reservaProgramacaoFatura) {
        this.reservaProgramacaoFatura = reservaProgramacaoFatura;
    }
}
