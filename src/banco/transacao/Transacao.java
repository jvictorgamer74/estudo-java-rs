package banco.transacao;

import java.time.LocalDate;

public class Transacao {

    private String msg;
    private Double valorSolicitado;
    private LocalDate dataOperacao;
    private String solicitante;
    private LocalDate dataDaTransf;

    public Transacao (String msg, LocalDate dataOperacao, Double valorSolicitado) {
        this.msg = msg;
        this.dataOperacao = dataOperacao;
        this.valorSolicitado = valorSolicitado;
    }

    public Transacao() {

    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Double getValorSolicitado() {
        return valorSolicitado;
    }

    public void setValorSolicitado(Double valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
    }

    public LocalDate getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(LocalDate dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public LocalDate getDataDaTransf() {
        return dataDaTransf;
    }

    public void setDataDaTransf(LocalDate dataDaTransf) {
        this.dataDaTransf = dataDaTransf;
    }

}
