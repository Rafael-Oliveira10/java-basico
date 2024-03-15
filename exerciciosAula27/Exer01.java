package exerciciosAula27;

public class Exer01 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.ligada = true;

        lampada.ligar();
            //chamando o método 'Estado' que foi criado no arquivo Lampada.
            //Incrível como diminui o tamanho do código
        lampada.Estado();

        lampada.desligar();

        lampada.Estado();

        lampada.mudarEstado();

        lampada.Estado();
    }
}
