package Classes;
import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private int dia;
    private int mes;


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
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
              System.out.println("CPF :");
              System.out.println(sc.nextLine());
              System.out.println("Dia :");
              System.out.println(sc.nextLine());
              System.out.println("Mês :");
              System.out.println(sc.nextLine());
              if (nome.equals(nome) && cpf.equals(cpf)) {
                  System.out.println("\n Login Realizado com Sucesso !\n ");

                  System.out.println("Horario de Entrada :"+dia+":"+mes);

              }
     }
}
