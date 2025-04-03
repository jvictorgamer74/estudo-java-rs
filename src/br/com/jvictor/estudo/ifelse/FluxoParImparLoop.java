package br.com.jvictor.estudo.ifelse;

public class FluxoParImparLoop {
    public static void main(String[] args) {


        int numLido = -1 ;

        for (int i=0; i<10; i++) {
            numLido = i;

            System.out.println("\n RESULTADO para o número " + numLido+ "\n");

            if ( numLido%2 == 1) {
                System.out.println("Weird");
            } else if (( numLido%2 == 0) && (numLido >=2 && numLido <= 5)) {
                System.out.println("Not Weird");
            } else if (( numLido%2 == 0) && (numLido >=6 && numLido<=20)) {
                System.out.println("Weird");
            } else if (( numLido%2 == 0) &&  (numLido>20)) {
                System.out.println("Not Weird");
            }

        }


    }
}
