package exerciciosAula27;

public class ContaCorrente {
    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double valorSaque) {
        //tem saldo
        if (saldo >= valorSaque) {
            saldo -= valorSaque;
            return true;
        } else { //Não tem saldo
            if (especial) { //verificar se o limite tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= valorSaque) {
                    saldo -= valorSaque;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false; // Não é especial e não possui o saldo suficiente para saque
            }
        }
    }

    void depositar(double valorDepositado) {//depósito
        saldo += valorDepositado;
    }

    void consultarSaldo() {
        System.out.println("Saldo atual da conta: " + saldo);
    }

    boolean verificarChequeEspecial() {
        return saldo < 0;
    }
}
