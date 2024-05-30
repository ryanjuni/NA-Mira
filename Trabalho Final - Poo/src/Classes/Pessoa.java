package Classes;
import java.util.Scanner;
public abstract class Pessoa {
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

    }


    public void Cadastro () {
            Scanner sc = new Scanner(System.in);
            System.out.println (" Qual o  seu  Nome ? " );
            nome = sc.nextLine();
            System.out.println (" Qual o  seu Email ? " );
            email = sc.nextLine();
            System.out.println (" Qual o seu Telefone ? ");
            telefone = sc.nextLine();

        System.out.println(" Documento : ");
        System.out.println("\n");
        System.out.println("Escolhar uma Opção  (1) CNPJ  (2)  CPF (3) Cancelar" );

        int Opcao = 0;
        String documento;
        Opcao = sc.nextInt();
        sc.nextLine();

           Scanner sc1 = new Scanner(System.in);
            switch (Opcao) {
                case 1:
                    System.out.println("Digite Seu CNPJ :");
                    Opcao = 1;
                    documento = sc.nextLine();
                    System.out.println("Cadastro efetuado com sucesso :) ");
                    break;
                case 2:
                    System.out.println(" Diginte seu CPF:");
                    Opcao = 2;
                    documento = sc.nextLine();
                    System.out.println("Cadastro efetuado com sucesso :) ");

                    break;
                case 3:
                    System.out.println("Cadastro Cancelado :( ");
                    Opcao = 3;
                     return;
                default:
                    System.out.println("Cadastro não efetuado  :( ");
                     return;

            }
    }

    public void salvar (){}

    public void remover(){}

    public void Imprimir () {
        System.out.println("Dados salvos com sucesso :) \n");
        System.out.println("Nome     : " + nome);
        System.out.println("Email    : " + email);
        System.out.println("Telefone : " + telefone);

    }

}




