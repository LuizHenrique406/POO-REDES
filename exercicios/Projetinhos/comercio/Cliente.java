package comercio;
import java.util.Scanner;

public class Cliente {
    Scanner sc = new Scanner(System.in);
    private String email;
    private String senha;
    
    public Cliente(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    public void setEmail() {
        System.out.println("Coloque um novo email:");
        this.email = sc.nextLine();
    }
    public String getEmail() {
        return this.email;
    }
    public void setSenha() {
        System.out.println("Coloque uma nova senha:");
        this.senha = sc.nextLine();
    }
    public String getSenha() {
        return this.senha;
    }
}