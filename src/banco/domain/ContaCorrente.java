package banco.domain;

import java.time.LocalDate;

/**
 * TODO
 *  7) (FAZER COMIGO) GUARDAR AS TRANSÇÕES NA MEMÓRIA
 * 8) Refactory (melhorar/otimizar) para separa a lógica dos dados
 */
public class ContaCorrente {

    // Atributos

    private String nome;
    private Integer numeroDaConta;
    private Integer numeroDaAgencia;
    private LocalDate dataDeNascimento;
    private Double saldoDaConta;
    private LocalDate dataDoSaque;

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(String nome, Integer numeroDaConta, Integer numeroDaAgencia, LocalDate dataDeNascimento, Double saldoDaConta , LocalDate dataDoSaque) {
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.numeroDaAgencia = numeroDaAgencia;
        this.dataDeNascimento = dataDeNascimento;
        this.saldoDaConta = saldoDaConta;
        this.dataDoSaque = dataDoSaque;
    }

    public String getNome() { return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Integer getNumeroDaAgencia() {
        return numeroDaAgencia;
    }

    public void setNumeroDaAgencia(Integer numeroDaAgencia) {
        this.numeroDaAgencia = numeroDaAgencia;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(Double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public LocalDate getDataDoSaque() {
        return dataDoSaque;
    }

    public void setDataDoSaque(LocalDate dataDoSaque) {
        this.dataDoSaque = dataDoSaque;
    }
}






