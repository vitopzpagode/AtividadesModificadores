
package exercicio3;


public class ContaBancaria {
     // Atributo público
    public String titular;

    // Atributo privado
    private double saldo;

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    // Método para consultar saldo
    public double getSaldo() {
        return saldo;
    }
}

