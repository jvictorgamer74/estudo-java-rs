package banco;
import banco.domain.ContaCorrente;
import banco.service.ContaService;

import java.time.LocalDate;

public class Central {
    public static void main(String[] args) {

        Central central = new Central();

        /**
         *  OK 1) chama o construtor passando os valores de inicialização
         * OK 2) colocar toda essa lógica em um outro método e chamar ele dentro método main
         * OK 3) fazer um outro método com esse mesmo conteúdo, mas instanciando o construtor sem parâmetros e
         * setando os valores com as chamadas dos métodos setXxxx
         * */

        central.realizarOperacoesContaCorrente1();

//        central.realizarOperacoesContaCorrente2();
    }

    public void realizarOperacoesContaCorrente1() {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNome("João");
        contaCorrente.setSaldoDaConta(6500.6);
        contaCorrente.setNumeroDaAgencia(2234);
        contaCorrente.setNumeroDaConta(55055);
        contaCorrente.setDataDeNascimento(LocalDate.of(2006, 12, 12));

        //Instanciei o conta service pq ele eh responsavel por realizar operações dentro da classe conta corrente
        ContaService contaService = new ContaService();

        //Alguns métodos da classe conta service recebem como parâmetro de entrada a classe conta corrente
        contaService.introducaoAoUsuario(contaCorrente);
        contaService.sacarUmValor(contaCorrente);
        contaService.transferirUmValor(contaCorrente);
        contaService.consultarSaldoFinal(contaCorrente);
        contaService.consultarAsTransacoesDoDia();
        contaService.cancelarConta();

    }

    public void realizarOperacoesContaCorrente2() {
        ContaService contaService = new ContaService();
        LocalDate dataDeNascimento = LocalDate.of(2006, 12, 12);
        ContaCorrente contaCorrente = new ContaCorrente("João", 55055, 2234, dataDeNascimento, 6500.6);

        contaService.introducaoAoUsuario(contaCorrente);
        contaService.sacarUmValor(contaCorrente);
        contaService.transferirUmValor(contaCorrente);
        contaService.consultarSaldoFinal(contaCorrente);
        contaService.consultarAsTransacoesDoDia();
        contaService.cancelarConta();
    }


}

