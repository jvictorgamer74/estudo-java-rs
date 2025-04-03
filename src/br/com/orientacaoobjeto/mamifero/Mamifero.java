package br.com.orientacaoobjeto.mamifero;

public abstract class Mamifero implements IMamifero{

    private String nome;
    private int peso;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mamar() {
        System.out.println(this.nome + " é um mamífero.");
    }

    public void andar() {
        System.out.println(this.nome + " anda.");
    }

    @Override
    public abstract void verificaMamiferoMaritimo();
}
