package br.com.orientacaoobjeto.myclasses;

public class Pessoa {
    //atributos: característica
    public String nome;
    public int idade;
    public char sexo;
    public String cor;

    /**
     * Escopo de visibilidade para atributos e métodos:
     * public: todo mundo enxerga em qualquer lugar
     * protected: só a própria classe e as classes que estão no mesmo pacote
     * default (que é não colocar nada)
     * private : só a própria classe tem acesso aos atributos e métodos
     */



    //métodos: ações que classe vai executar
    //é o que ele realmente vai executar.. é ação propriamente dita, desse método
    //é a responsabilidade, a função que ele vai desenvolver
    public void receberPagamento(double salario) {
        System.out.println("o funcionário " + nome + " recebeu o total de " + salario);
    }

    public void baterPonto() {
        System.out.println("o funcionário " + nome + " bateu o ponto.");
        //posso fazer validações com if else
        //posso fazer loops com while, for
        //posso fazer contas matemáticas, booleanas
        //posso chamar outros métodos...
        //posso chamar esse mesmo método.. que consiste numa chamada recursiva
    }
}
