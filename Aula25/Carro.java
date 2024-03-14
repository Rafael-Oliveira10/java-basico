package Aula25;

//Aula 24, 25, 26 e 27
public class Carro {
    // aula 24
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    //método aula 25
    void exibirAutonomia() {//qualquer bloco de código
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel +
                " Km");
    }//boa prática java, os métodos devem iniciar com verbo

    //aula 26
    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado");
        return capCombustivel * consumoCombustivel;
    }
        //aula 27, parametros
    double calcularCombustivel(double km) {
        double qtdCombustivel = km / consumoCombustivel;

        return qtdCombustivel;
    }
}
