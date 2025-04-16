package banco.service;

import banco.domain.ContaCorrente;
import banco.transacao.Transacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ContaService {
    private List<Transacao> transacoes = new ArrayList<>();

    public void cancelarConta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o motivo do cancelamento:");
        String motivoCancelamento = scanner.nextLine();
        System.out.println("O motivo do cancelamento é: " + motivoCancelamento);
    }

    public void consultarSaldoFinal(ContaCorrente contaCorrente) {

        System.out.println("\n O seu saldo é de " + contaCorrente.getSaldoDaConta());
    }


    public void sacarUmValor(ContaCorrente contaCorrente) {
        System.out.println("\n Quanto deseja sacar?");
        Scanner scanner = new Scanner(System.in);
        String solicitante = new String("Saque próprio");
        double valorDoSaque = scanner.nextDouble();
        LocalDate dataDoSaque = LocalDate.from(LocalDateTime.now());

        if (valorDoSaque <= contaCorrente.getSaldoDaConta()) {
            double saldoDaConta = contaCorrente.getSaldoDaConta().doubleValue();
            saldoDaConta -= valorDoSaque;
            contaCorrente.setSaldoDaConta(saldoDaConta);
            String msgTransacao = "\n Saque de " + valorDoSaque + " realizado em " + LocalDateTime.now();

            //guardando a transação
            guardarTransacaoNaMemoria(msgTransacao, dataDoSaque, valorDoSaque, solicitante);

            System.out.println("Você sacou " + valorDoSaque + " com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }


    public void transferirUmValor(ContaCorrente contaCorrente) {
        LocalDateTime horaAtual = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Para quem deseja transferir?");
        scanner.nextLine(); // Limpar buffer do scanner
        String nomeDestinatario = scanner.nextLine();
        LocalDate dataDaTransf = LocalDate.from(LocalDateTime.now());

        System.out.println("\n Quanto deseja transferir para " + nomeDestinatario + "?");
        double valorDaTransferencia = scanner.nextDouble();
        double saldoDaConta = contaCorrente.getSaldoDaConta().doubleValue();

        if (valorDaTransferencia <= saldoDaConta) {
            saldoDaConta -= valorDaTransferencia;
            contaCorrente.setSaldoDaConta(saldoDaConta);

            String msg = "\n Transferido para " + nomeDestinatario + " no valor de " + valorDaTransferencia;

            //guardando a transação
            guardarTransacaoNaMemoria(msg, dataDaTransf, valorDaTransferencia, nomeDestinatario);

            System.out.println("A transferência de " + valorDaTransferencia + " para " + nomeDestinatario
                    + " foi realizada com sucesso em " + horaAtual);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public void consultarAsTransacoesDoDia() {
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

            for (Transacao transacao : transacoes) {
//             if (transacao.getDataXX transacao.contains(dataConsultada.toString())

                System.out.println("\n Na data " + transacao.getDataOperacao());
                    //System.out.println("\n Na data " + new String(String.valueOf(dataConsultada)));
//                 encontrouTransacoes = true;


                if (!encontrouTransacoes) {
                    System.out.println("\n Nenhuma transação encontrada para esta data.");
                }
            }
        } catch (Exception e) {
            System.out.println("\n Formato de data inválido. Por favor, insira a data no formato DD/MM/AAAA.");
        }
    }

    // Método para introdução ao usuário
    public void introducaoAoUsuario(ContaCorrente contaCorrente) {
        Integer numeroDaAgencia = contaCorrente.getNumeroDaAgencia();
        Integer numeroDaConta = contaCorrente.getNumeroDaConta();
        String nome = contaCorrente.getNome();
        Double saldoDaConta = contaCorrente.getSaldoDaConta();
        System.out.println("\n Olá " + nome + " , o seu saldo é de " + saldoDaConta
                + " , seu número de agência e conta são respectivamente " + numeroDaAgencia + " , " + numeroDaConta);
    }


    private void guardarTransacaoNaMemoria(String msg, LocalDate dataDoSaque, double valorDoSaque, String solicitante) {
        Transacao transacao1 = new Transacao();//(msg, solicitante, dataDoSaque, valorDoSaque);
        transacao1.setDataOperacao(dataDoSaque);
        transacao1.setValorSolicitado(valorDoSaque);
        transacao1.setMsg(msg);
        transacao1.setSolicitante(solicitante);
        transacoes.add(transacao1);
    }
}



