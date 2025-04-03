package br.com.jvictor.estudo.ifelse;

import java.util.Scanner;

public class FluxoParImpar {

    public static void main(String[] args) {

        var con = System.console();
        if (con != null) {
            Scanner sc = new Scanner(con.reader());
            System.out.println("Digite um número e tecle enter: \n " );
            int numLido = sc.nextInt();
            //System.out.println("con - lido = " + numLido);
            System.out.println("\n RESULTADO \n");

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
        //System.out.println("fim!!");
    }
}
