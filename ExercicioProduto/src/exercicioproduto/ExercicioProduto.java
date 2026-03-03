
package exercicioproduto;


public class ExercicioProduto {

    
    public static void main(String[] args) {
          Produto produto = new Produto();

        produto.setNome("Notebook");
        produto.setPreco(3500.00);

        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
    }
    }
    

