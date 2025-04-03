package je25_java_time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateSample {
    public static void main(String[] args) {
        LocalDate niverDoVilao = LocalDate.of(2006,12,12);

        System.out.println(niverDoVilao);

        // este conteúdo pode ser um argumento de seu programa via console
        // ou toString() de algum componente visual
        //String stringData = "2023-01-17";

        //LocalDate dataConcreta = LocalDate.parse(stringData);


        //System.out.println(dataConcreta);

        /*
        String stringDataBr = "17/01/2023";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataConcreta = LocalDate.parse(stringDataBr,formatter);
        System.out.println(dataConcreta);
        **/

        /*
        LocalDate paradaDeFormula = LocalDate.of(2024,12,15);

        LocalDate dataQueTera1AnoDeFormula = paradaDeFormula.plusMonths(6);

        System.out.println(dataQueTera1AnoDeFormula);
        **/


        //LocalDate data1 = LocalDate.of(2023,3,4);
        //LocalDate data2 = LocalDate.of(2024,4,3);

        //data2 está após a data 1? true
        //System.out.println(data2.isAfter(data1));

        //data2 está antes que data 1? flase
        //System.out.println(data2.isBefore(data1));

        //data2 é igual a data 1? false
        //System.out.println(data2.isEqual(data1));

        /*
        LocalTime horaAtual = LocalTime.now();
        LocalTime horaAtualMais30Minutos = horaAtual.plusMinutes(30);
        LocalTime horaAtualMenos2Horas = horaAtual.minusHours(2);

        System.out.println(horaAtual);
        System.out.println(horaAtualMais30Minutos);
        System.out.println(horaAtualMenos2Horas);
        **/






    }




}
