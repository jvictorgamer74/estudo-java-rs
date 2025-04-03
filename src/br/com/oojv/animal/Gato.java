package br.com.oojv.animal;

public class Gato {

    private String corDoPelo;
    public int peso;
    private double altura;
    private boolean temMuitosPelos = true;

    public String getCorDoPelo() {
        return this.corDoPelo;
    }

    public void setCorDoPelo(String value) {
        this.corDoPelo = value;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public boolean isTemMuitosPelos() {
        return temMuitosPelos;
    }


    //métodos  ou ações do cachorros
    public void passearComDog(){
        System.out.println("Passeando com o cat");
        this.brincarNoPasseio();
    }

    private void brincarNoPasseio() {
        System.out.println("cat brincando com o seu dono");
    }

}
