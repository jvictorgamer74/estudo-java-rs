package br.com.orientacaoobjeto.mamifero;

public class Human extends Mamifero {

    private int inteligencia;

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void raciocinar() {
        System.out.println("o ser humando tem uma inteligencia de valor " + this.inteligencia);
    }

    @Override
    public void andar() {
        System.out.println(this.getNome() + " anda em pé com duas pernas.");
    }

    @Override
    public void verificaMamiferoMaritimo() {
        System.out.println("é um ser terrestre");
    }

    @Override
    public void mamar() {
        System.out.println(this.getNome() + " mama do peito da Mãe.");
    }
}
