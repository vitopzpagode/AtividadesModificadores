
package exercicio6;

public class Usuario {
    
    private String login;
    private String senha;

    
    public void setLogin(String login) {
        this.login = login;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public boolean autenticar(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }
}

