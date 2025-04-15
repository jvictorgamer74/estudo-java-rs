package banco.transacao;

import java.time.LocalDate;

public class Transacao {

    private String msg;
    private Double valorSolicitado;
    private LocalDate dataOperacao;
    private LocalDate dataDaTransf;

    public Transacao (String msg, LocalDate dataOperacao, Double valorSolicitado) {
        this.msg = msg;
        this.dataOperacao = dataOperacao;
        this.valorSolicitado = valorSolicitado;
    }

    public Transacao() {

    }

    public Transacao(String sacador, LocalDate dataDoSaque, double valorDoSaque, Object o) {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public double getValorSolicitado() {
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


    //criar construtor padrão e construtor com todos atributos
    //criar get e set

}
