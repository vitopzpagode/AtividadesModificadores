
package exercicio5;

public class Funcionario {
    
    private String nome;
    private double salario;

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário inválido!");
        }
    }

    
    public double getSalario() {
        return salario;
    }
}

