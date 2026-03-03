
package exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
         ContaBancaria conta = new ContaBancaria();

        conta.titular = "Vitor";

        conta.depositar(1000);
        conta.sacar(300);
        conta.sacar(800);

        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
}
    
    

