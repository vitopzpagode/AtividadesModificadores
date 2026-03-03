
package exercicio7;

public class Aluno extends Pessoa {

    
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    
    public void exibirIdade() {
        System.out.println("Idade do aluno: " + idade);
    }
}
