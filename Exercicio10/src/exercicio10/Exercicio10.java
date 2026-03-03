
package exercicio10;

public class Exercicio10 {

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setMarca("Ford");
        carro.setModelo("Model T");
        carro.setAno(1908);

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.ano);

        carro.setAno(1800);
    }
}
    
    

