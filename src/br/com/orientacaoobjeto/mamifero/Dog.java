package br.com.orientacaoobjeto.mamifero;

public class Dog extends BichoEstimacao {

    private int tamanhoAgressividade;

    public int getTamanhoAgressividade() {
        return tamanhoAgressividade;
    }

    public void setTamanhoAgressividade(int tamanhoAgressividade) {
        this.tamanhoAgressividade = tamanhoAgressividade;
    }

    public void recuperarAgressividade() {
        System.out.println(this.getNome() + " tem o total de agressividade = " + this.tamanhoAgressividade);
    }

    @Override
    public void andar() {
        System.out.println(this.getNome() + " o cachorrao anda de 4 patas com mais agilidade");
    }

    @Override
    public void verificaMamiferoMaritimo() {
        System.out.println("terrestre");
    }

    @Override
    public void mamar() {
        System.out.println(this.getNome() + " mama dos bicos do peito da cachorrinha.");
    }
}
