package br.com.orientacaoobjeto.mamifero;

public class Cat extends BichoEstimacao {

    private int totalArredio;

    public int getTotalArredio() {
        return totalArredio;
    }

    public void setTotalArredio(int totalArredio) {
        this.totalArredio = totalArredio;
    }

    public void recuperarArredio() {
        System.out.println(this.getNome() + " tem o total de agressividade = " + this.totalArredio);
    }

    @Override
    public void andar() {
        System.out.println(this.getNome() + " o gato anda de forma sinuosa");
    }

    @Override
    public void verificaMamiferoMaritimo() {
        System.out.println("terrestre");
    }

    @Override
    public void mamar() {
        System.out.println(this.getNome() + " mama no bico do peito da gatinha.");
    }
}
