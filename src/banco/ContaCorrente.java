package banco;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaCorrente {

    // Atributos
    private String nome;
    private Integer numeroDaConta;
    private Integer numeroDaAgencia;
    private LocalDate dataDeNascimento;
    private Double saldoDaConta;

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(String nome, Integer numeroDaConta, Integer numeroDaAgencia, LocalDate dataDeNascimento, Double saldoDaConta) {
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.numeroDaAgencia = numeroDaAgencia;
        this.dataDeNascimento = dataDeNascimento;
        this.saldoDaConta = saldoDaConta;
    }

    /**
     * feita 1) Transformar os atributos de classe para privado
     * feita 2) Criar métodos get e set para os atributos
     * feito 3) Definir um scanner em cada método
     * feito 4) Excluir o scanner definido na classe
     * feito 5) Criar um construtor recebendo os atributos definidos na classe e inicializando os atributos
     * feito 6) Colocar um \n em no início do System.out.println("..
     *
     * TODO
     * 7) (FAZER COMIGO) GUARDAR AS TRANSÇÕES NA MEMÓRIA
     * 8) Refactory (melhorar/otimizar) para separa a lógica dos dados
     */
    // Lista de transações
    //private List<String> transacoes = new ArrayList<>();



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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

    public Double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(Double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    // Método para cancelar conta
    public void cancelarConta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o motivo do cancelamento:");
        String motivoCancelamento = scanner.nextLine();
        System.out.println("O motivo do cancelamento é: " + motivoCancelamento);
    }

    // Método para consultar saldo
    public void consultarSaldoFinal () {
        System.out.println("\n O seu saldo é de " + saldoDaConta);
    }

    // Método para sacar valor
    public void sacarUmValor () {
        System.out.println("\n Quanto deseja sacar?");
        Scanner scanner = new Scanner(System.in);
        double valorDoSaque = scanner.nextDouble();
        if (valorDoSaque <= saldoDaConta) {
            saldoDaConta -= valorDoSaque;
            String transacao = "Saque de " + valorDoSaque + " realizado em " + LocalDateTime.now();
            //transacoes.add(transacao);
            System.out.println("Você sacou " + valorDoSaque + " com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    // Método para transferir valor
    public void transferirUmValor () {
        LocalDateTime horaAtual = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Para quem deseja transferir?");
        scanner.nextLine(); // Limpar buffer do scanner
        String nomeDestinatario = scanner.nextLine();

        System.out.println("\n Quanto deseja transferir para " + nomeDestinatario + "?");
        double valorDaTransferencia = scanner.nextDouble();

        if (valorDaTransferencia <= saldoDaConta) {
            saldoDaConta -= valorDaTransferencia;
            String transacao = "Transferência de " + valorDaTransferencia + " para " + nomeDestinatario + " realizada em " + horaAtual;
            //transacoes.add(transacao);
            System.out.println("A transferência de " + valorDaTransferencia + " para " + nomeDestinatario + " foi realizada com sucesso em " + horaAtual);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    // Método para consultar transações do dia
    public void consultarAsTransacoesDoDia () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Insira a data no formato DD/MM/AAAA: ");
        String dataInput = scanner.nextLine();

        // Definir o formato de data para ler a entrada do usuário
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Tentar converter a data inserida
        try {
            LocalDate dataConsultada = LocalDate.parse(dataInput, formatter);
            System.out.println("\n Consultando transações para a data: " + dataConsultada);

            // Filtrando as transações para o dia informado
            boolean encontrouTransacoes = false;

//            for (String transacao : transacoes) {
//                if (transacao.contains(dataConsultada.toString())) {
//                    System.out.println(transacao);
//                    encontrouTransacoes = true;
//                }
//            }

            if (!encontrouTransacoes) {
                System.out.println("\n Nenhuma transação encontrada para esta data.");
            }
        } catch (Exception e) {
            System.out.println("\n Formato de data inválido. Por favor, insira a data no formato DD/MM/AAAA.");
        }
    }

    // Método para introdução ao usuário
    public void introducaoAoUsuario () {
        System.out.println("\n Olá " + nome + " , o seu saldo é de " + saldoDaConta + " , seu número de agência e conta são respectivamente " + numeroDaAgencia + " , " + numeroDaConta);
    }
}






