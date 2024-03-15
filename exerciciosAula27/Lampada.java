package exerciciosAula27;

public class Lampada {
    String tipoLuz;
    String cor;
    String tensao;
    String modelo;
    int potencia;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada;

    //método
    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }
    //método:
    void Estado() {
        if (ligada) {
            System.out.println("Lampada está ligada");
        } else {
            System.out.println("Lampada está desligada");
        }
    }
    //outro método:
    void mudarEstado() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }
}
