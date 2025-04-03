package je28_expressoes;

import java.time.LocalTime;

public class ExpressoesSimples {
    public static void main(String[] args) {
        String nome ="Gleyson";
        String sobrenome = "Sampaio";
        Integer matricula = 22209841;
        Double salario = 6500.60;



        String textoImpresso = String.format("Ola %s %s  sua matrícula é %d e seu salário cadastrado %f ",nome , sobrenome ,matricula, salario);


        System.out.println(textoImpresso);
    }

}
