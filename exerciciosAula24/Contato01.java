package exerciciosAula24;
//Ciando uma classe de um sistema bancario rs
//E atribuindo os valores a esse sistema
public class Contato01 {
    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.nome = "Clemesson";
        contato.email = "clemesson.mini@gmail.com";
        contato.endereco = "Rua São Luis";
        contato.numCasa = 24;

        contato.telefones = new String[3];
        contato.telefones[0] = "99999-9999";
        contato.telefones[1] = "99999-9998";
        contato.telefones[1] = "99999-9997";
        contato.telefones[1] = "99999-9996";


    }
}
