package br.com.orientacaoobjeto.mamifero;

public abstract class BichoEstimacao extends Mamifero {

    private boolean temDono;
    private int quantidadePelo;

    public boolean isTemDono() {
        return temDono;
    }

    public void setTemDono(boolean temDono) {
        this.temDono = temDono;
    }

    public void necessitarAdestramento() {
        System.out.println(this.getNome() + " o bicho de estimação precisa de adestramento");
    }

    @Override
    public void andar() {
        System.out.println(this.getNome() + " o bicho de estimação anda diferente do Humano");
    }
}
