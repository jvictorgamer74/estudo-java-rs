package br.com.oojv;


import br.com.oojv.animal.Gato;

public class Central {

    public static void main(String[] args) {

        Cachorro dog = new Cachorro();

        System.out.println(" A cor do cachorro é " +  dog.getCorDoPelo() + ", uma bela cor para um cachorro");
        dog.setCorDoPelo("branco");
        System.out.println(" A cor do cachorro é " +  dog.getCorDoPelo() + ", uma bela cor para um cachorro");

        dog.peso = 10;
        System.out.println(" O peso do cachorro é " + dog.peso + ", ele tem um corpo bem atlético" );
        System.out.println(" O peso do cachorro é " + dog.getPeso() + ", ele tem um corpo bem atlético" );

        dog.setPeso(20);
        System.out.println(" O peso do cachorro é " + dog.peso + ", ele tem um corpo bem atlético" );
        System.out.println(" O peso do cachorro é " + dog.getPeso() + ", ele tem um corpo bem atlético" );

        Cachorro dog2 = new Cachorro();
        dog2.setCorDoPelo("marrom");
        System.out.println(" A cor do cachorro é " +  dog2.getCorDoPelo() + ", uma bela cor para um cachorro");

        //setando seus atributos
        dog.altura =  1;
//        dog.corDoPelo ="amarelo";
//        dog.peso= 30;
//        dog.raca = "Golden";
//        dog.latidos = 1;
//
//        //afirmação dos atributos
//        System.out.println(" A cor do cachorro é " + dog.corDoPelo + ", uma bela cor para um cachorro");
//        System.out.println(" A altura do cachorro é " + dog.altura + ", ele é bem grande" );
//        System.out.println(" O peso do cachorro é " + dog.peso + ", ele tem um corpo bem atlético" );
//        System.out.println(" A raça do cachorro é " + dog.raca + " e ele tem pedigre" );

        dog.passearComDog();

        Gato gato = new Gato();
        gato.setCorDoPelo("branco");
        gato.setPeso(20);
        gato.setAltura(2);
        System.out.println(" O gato tem muito pelo = " + gato.isTemMuitosPelos()  );

    }
}
