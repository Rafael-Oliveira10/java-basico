package exerciciosAula24;

public class ContaCorrente01 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.numero = "8792";
        conta.numeroDig = "2";
        conta.agencia = "256";
        conta.especial = true;
        conta.limiteEspecial = 500000;
        conta.saldo = 147980;

        System.out.println("---------- BANCO UNIÃO CENTRAL ----------");
        System.out.println("Número da conta: " + conta.numero + " - " + conta.numeroDig);
        System.out.println("Agencia: " + conta.agencia);
        System.out.println("Sua conta é especial? " + conta.especial);
        System.out.println("Limite disponível: " +conta.limiteEspecial);
        System.out.println("Saldo disponível: " +conta.saldo);
    }
}
