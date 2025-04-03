package banco;
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
    }

    public void realizarOperacoesContaCorrente1() {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNome("João");
        contaCorrente.setSaldoDaConta(6500.6);
        contaCorrente.setNumeroDaAgencia(2234);
        contaCorrente.setNumeroDaConta(55055);
        contaCorrente.setDataDeNascimento(LocalDate.of(2006, 12, 12));

        contaCorrente.introducaoAoUsuario();
        contaCorrente.sacarUmValor();
        contaCorrente.transferirUmValor();
        contaCorrente.consultarSaldoFinal();
        contaCorrente.consultarAsTransacoesDoDia();
        contaCorrente.cancelarConta();

//        ContaCorrente contaCorrente2 = new ContaCorrente();
//        contaCorrente2.setNome("Maria");
//        contaCorrente2.setSaldoDaConta(3500.6);
//        contaCorrente2.setNumeroDaAgencia(8834);
//        contaCorrente2.setNumeroDaConta(10055);
//        contaCorrente2.setDataDeNascimento(LocalDate.of(1970, 12, 12));


    }

    public void realizarOperacoesContaCorrente2() {
        LocalDate dataDeNascimento = LocalDate.of(2006, 12, 12);
        ContaCorrente contaCorrente = new ContaCorrente("João", 55055, 2234, dataDeNascimento, 6500.6);

        contaCorrente.introducaoAoUsuario();
        contaCorrente.sacarUmValor();
        contaCorrente.transferirUmValor();
        contaCorrente.consultarSaldoFinal();
        contaCorrente.consultarAsTransacoesDoDia();
        contaCorrente.cancelarConta();
    }

   /* public void yyyy() {
        //botar a primeira solução
        //Chamando construtor com todos os parâmetros
        ContaCorrente contaCorrente1 = new ContaCorrente("Jonh", , , );
    }

    public void zzz() {
        // chamar construtor padrão e chamar métodos setXX para inicializar a classe com os valores definidos
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNome("");
        //fazer o mesmo pros demais atribuots

        //e colocar as demais chamadas do contaCorrente
    }

*/
    }

