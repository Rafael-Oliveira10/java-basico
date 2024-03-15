package exerciciosAula27;

public class Exer02 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.numero = "8792";
        conta.agencia = "256";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;
        conta.saldo = -10;

        System.out.println("Saldo da conta: " + conta.numero + " = " + conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(10);

        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso!");
            conta.consultarSaldo();
        } else {
            System.out.println("Você não possui saldo suficiente.");
        }

        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de 500 reais.");

        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso!");
            conta.consultarSaldo();
        } else {
            System.out.println("Não foi possível efetuar o saque. Saldo insuficiente.");
        }

        System.out.println("Depósito de 500 reais");
        conta.depositar(500);
        conta.consultarSaldo();

        saqueEfetuado = conta.realizarSaque(600);
        conta.consultarSaldo();
        if (conta.verificarChequeEspecial()) {
            System.out.println("Está usando o cheque especial.");
        } else {
            System.out.println("Não está usando o cheque especial.");
        }


    }
}
