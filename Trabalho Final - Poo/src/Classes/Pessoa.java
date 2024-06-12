package Classes;
import java.io.*;
import java.util.Scanner;
public  class Pessoa {
    private String nome;
    private String email;
    private String telefone;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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


    public Pessoa() {

        this.nome = "";
        this.email = "";
        this.telefone = "";

    }


    public void Cadastro () {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n------------------------------------ \n");
            System.out.println(" Ok ,  ");
            System.out.print(" Precisamos de Algumas Informações suas Certo : )");
            System.out.print("\n");
            System.out.println("\n------------------------------------ \n");
            System.out.print("\n");

            System.out.println ("  Nome : " );
            nome = sc.nextLine();
            System.out.println ("  Email : " );
            email = sc.nextLine();
            System.out.println (" Telefone : ");
            telefone = sc.nextLine();
            System.out.print("\n");



    }

    public void salvar (){
        System.out.print(" \n ");
        String fileName = nome+email+telefone;
        try (BufferedWriter out = new BufferedWriter(new BufferedWriter(new FileWriter(fileName)))) {
            System.out.println("\n------------------------------------ \n");
            System.out.println(" Salvando Seus Dados Agora ... :/ ");
            System.out.println("  Dados Principais :  ");
            System.out.print(" \n ");
            System.out.println(nome);
            System.out.println(email);
            System.out.println(telefone);

        }catch (IOException e){
            System.out.println("Erro ao Salvar :(");
            e.printStackTrace();
        }
    }

    public void remover() {
        System.out.println("\n------------------------------------ \n");
        System.out.println(" Desejar Remover os Seus dados ? ");
        System.out.println(" se (Sim) clique em 1");
        System.out.println(" \n");
        Scanner sc2 = new Scanner (System.in);
         switch (sc2.nextLine()){
             case "1":

        if (nome.isEmpty() && email.isEmpty() && telefone.isEmpty()) {

        } else {
            System.out.println(" \n");
            System.out.println(" Removendo Seus Dados Agora .... :/");
            this.nome = "";
            this.telefone = "";
            this.email = "";

           }
        }
    }

    public void Imprimir () {
        System.out.println("\n------------------------------------ \n");
        System.out.println("Feito com Sucesso ;)");
        System.out.println("\n");

        System.out.println("Nome     : " + nome);
        System.out.println("Email    : " + email);
        System.out.println("Telefone : " + telefone);

    }

}




