
package exercicio6;

public class Exercicio6 {

    public static void main(String[] args) {
       Usuario usuario = new Usuario();

        usuario.setLogin("admin");
        usuario.setSenha("1234");

        boolean acesso = usuario.autenticar("admin", "1234");

        if (acesso) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Login ou senha incorretos!");
        }
    }   
}
