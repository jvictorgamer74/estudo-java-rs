package br.com.oojv;

public class Cachorro {

        //tipos de atributos
        private String corDoPelo;
        public int peso;
        protected double altura;
//        private String raca;
//        private int latidos;

        //encapsulamento: esconder o que for importante para uso da somente classe,
        //ou seja tratar o escopo de visibilidade

        //Para acessar os atributos criar os correspondentes métodos get e set
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

        //métodos  ou ações do cachorros
        public void passearComDog(){
           System.out.println("Passeando com o dog");
           this.brincarNoPasseio();
        }

        private void brincarNoPasseio() {
                System.out.println("dog brincando com o seu dono");
        }

}
