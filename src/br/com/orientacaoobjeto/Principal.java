package br.com.orientacaoobjeto;

import br.com.orientacaoobjeto.myclasses.Pessoa;

    //classe
    //atributo
    //metodo
    //objeto
    //encapsulamento/escopo de visibilidade => // - alterar escopo de visibilidade de atributos e métodos: encapsulamento (classes Cachorro e Gato)
    //herança : extends XX
    //polimorfismo

//interface
//abstract


// Para criar o objeto:
//o Objeto é a classe em execução.. é a classe que vai está instanciada na memória do computador.. gerenciada
//pelo Sistema Operacional e pelo interpretador do java que é a JVM (java virtual machine)


/**
 * TODO
 *
 *  - fazer loop para uma única classe para ler vários objetos
 *  - colocar parametro salario como atributo de classe
 *  - colocar mais atributos de classe para o método baterPonto
 *  - definir métodos que retornam alguma informação, que faz um processamento interno
 */


public class Principal {

    public static void main(String[] args) {


        Pessoa objetoPessoa = new Pessoa();

        //setando seus atributos
        objetoPessoa.nome = "Joao";
        objetoPessoa.cor ="pardo";
        objetoPessoa.idade= 18;
        objetoPessoa.sexo = 'M';

        //mostrando seus atributos
        System.out.println("\n pessoa nome " + objetoPessoa.nome);
        System.out.println(" pessoa cor " + objetoPessoa.cor);
        System.out.println(" pessoa idade " + objetoPessoa.idade);
        System.out.println(" pessoa sexo " + objetoPessoa.sexo);
        objetoPessoa.baterPonto();
        objetoPessoa.receberPagamento(100);

        //Usei a mesma variável já declarada e instanciei novamente
        objetoPessoa = new Pessoa();

        objetoPessoa.nome = "Alezandrus";
        objetoPessoa.cor ="pardo";
        objetoPessoa.idade= 51;
        objetoPessoa.sexo = 'M';//MACHÃO

        System.out.println("\n pessoa nome " + objetoPessoa.nome);
        System.out.println(" pessoa cor " + objetoPessoa.cor);
        System.out.println(" pessoa idade " + objetoPessoa.idade);
        System.out.println(" pessoa sexo " + objetoPessoa.sexo);
        objetoPessoa.baterPonto();
        objetoPessoa.receberPagamento(150);

        objetoPessoa.nome = "Fernandito";
        objetoPessoa.cor ="branquelo";
        objetoPessoa.idade= 18;
        objetoPessoa.sexo = 'M';

        System.out.println("\n pessoa nome " + objetoPessoa.nome);
        System.out.println(" pessoa cor " + objetoPessoa.cor);
        System.out.println(" pessoa idade " + objetoPessoa.idade);
        System.out.println(" pessoa sexo " + objetoPessoa.sexo);
        objetoPessoa.baterPonto();
        objetoPessoa.receberPagamento(300);

//        Pessoa objetoPessoa2 = new Pessoa();
//
//        objetoPessoa2.nome = "Fernandito";
//        objetoPessoa2.cor ="branquelo";
//        objetoPessoa2.idade= 18;
//        objetoPessoa2.sexo = 'M';
//
//        System.out.println("\n pessoa nome " + objetoPessoa2.nome);
//        System.out.println(" pessoa cor " + objetoPessoa2.cor);
//        System.out.println(" pessoa idade " + objetoPessoa2.idade);
//        System.out.println(" pessoa sexo " + objetoPessoa2.sexo);
//        objetoPessoa2.baterPonto();
//        objetoPessoa2.receberPagamento(300);
    }
}
