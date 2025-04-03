package br.com.orientacaoobjeto.mamifero;

public class CentralMain {

    public static void main(String[] args) {

        CentralMain centralMain = new CentralMain();

//        centralMain.exibirComportamentoHeranca();

//        centralMain.definirComportamentosDiferentesNosFilhos();
        centralMain.verificarMetodoChamadoNaInstanciaQueFoiCriadoComONew();
    }


    public void exibirComportamentoHeranca() {

        Mamifero mamifero = null;

//        mamifero = new Mamifero();//definida como classe abstrata, não pode ser instanciada
//        mamifero.setNome("Rubão");
//        mamifero.andar();
//        mamifero.mamar();

        //

        Human human = new Human();
        human.setNome("Humano");
        human.andar();
        human.mamar();

        //
        Dog dog = new Dog();
        dog.setNome("Dog");
        dog.mamar();
        dog.andar();
    }

    public void definirComportamentosDiferentesNosFilhos() {
        Human human = new Human();
        human.setNome("Humano");
        human.andar();
        human.mamar();
        System.out.println();

        //
        Dog dog = new Dog();
        dog.setNome("Dog");
        dog.andar();
        dog.mamar();
        System.out.println();

        Cat cat = new Cat();
        cat.setNome("Gato");
        cat.andar();
        cat.mamar();

    }

    public void verificarMetodoChamadoNaInstanciaQueFoiCriadoComONew() {

        Mamifero objetoMan = null;
        objetoMan = new Human();
        objetoMan.setNome("Humano");
        //Polimorfimo: a mesma assinatura de método, com comportamento diferente nas classes filhas, ou seja, um comportamento especializado em cada classe que teve o método Sobrescrito(Override)
        objetoMan.mamar();
        objetoMan.andar();
        //Fazendo um Cast (que é uma conversão obrigatória em tempo de compilação e execução(runtime) da estrutura da classe declarada na variável para a classe instanciada com o new
        ((Human)objetoMan).setInteligencia(10);
        ((Human)objetoMan).raciocinar();
        System.out.println();

        objetoMan = new Cat();
        objetoMan.setNome("Gatinho");
        objetoMan.mamar();
        objetoMan.andar();
        ((Cat)objetoMan).setTotalArredio(5);
        ((Cat)objetoMan).recuperarArredio();
        System.out.println();

        objetoMan = new Dog();
        objetoMan.setNome("Cachorro");
        objetoMan.mamar();
        objetoMan.andar();
        ((Dog)objetoMan).setTamanhoAgressividade(1);
        ((Dog)objetoMan).recuperarAgressividade();
    }


}
