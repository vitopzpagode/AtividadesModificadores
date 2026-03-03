
package exercicio10;

public class Carro {
    
    private String marca;
    private String modelo;

    public int ano;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAno(int ano) {
        if (ano >= 1886) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido! Deve ser >= 1886.");
        }
    }

    public int getAno() {
        return ano;
    }
}

