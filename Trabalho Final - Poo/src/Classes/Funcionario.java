package Classes;
import java.util.Scanner;

public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

     public void CadastrarFuncionario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome :");
         nome  = sc.nextLine();
        System.out.println("Telefone :");
         telefone = sc.nextLine();
        System.out.println("Cpf :");
         cpf  = sc.nextLine();
        System.out.println("E-mail:");
          email  = sc.nextLine();

          System.out.println("\n");
          System.out.println(nome);
          System.out.println(telefone);
          System.out.println(cpf);
          System.out.println(email);
          System.out.println("\n");
          System.out.println("Ok, Vamos Fazer  o Login :)");


              System.out.println("Login  \n");

              System.out.println("Senha:");
              System.out.println("Nome :");
              System.out.println(sc.nextLine());
              System.out.println("Email :");
              System.out.println(sc.nextLine());

              System.out.println(sc.nextLine());
              if (nome.equals(nome) && email.equals(email)) {
                  System.out.println("\n Login Realizado com Sucesso !\n ");


              }
     }
}
