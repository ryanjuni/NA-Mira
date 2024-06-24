package Classes;

import java.util.Scanner;

public class Fornecedor extends Estoque{
    private int id;
    private String nome;
    private int telefone;
    private String email;
    private String endereco;


    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getPreco() {
        return 100; // Exemplo de preço fixo
    }

    public void fornecedor1() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Dados do Fornecedor");
        System.out.println("---------------------------------------------------");
        System.out.println("Nome: " ) ;
        nome = sc.nextLine();
        System.out.println("Telefone: ");
        telefone = Integer.parseInt(sc.nextLine());
        System.out.println("E-mail: " );
        email = sc.nextLine();
        System.out.println("Endereço: ");
        endereco = sc.nextLine();
        System.out.println("----------------------------------------------------");


        System.out.println("Qual o melhor horario para entregar ? ");
        String nomeProduto = sc.nextLine();


        float preco = getPreco();
        float valorFornecedor = preco - (preco * 30 / 100);
        float taxa = (float) valorFornecedor / 18;


        System.out.println("O produto está disponível? (sim/não):");
        String resposta = sc.nextLine();
        boolean produtoDisponivel = resposta.equalsIgnoreCase("sim");

        if (produtoDisponivel) {

            System.out.println("Digite a quantidade : ");
            int quantidade = Integer.parseInt(sc.nextLine());

            System.out.println("Digite o CEP da Loja: ");
            String cep = sc.nextLine();

            System.out.println("Digite a Cidade da Loja: ");
            String cidade = sc.nextLine();

            System.out.println("Digite o Estado da Loja: ");
            String estado = sc.nextLine();

            System.out.println("Digite o Nome do Produto: ");
            String produto = sc.nextLine();


            double valorTotal = valorFornecedor * quantidade;
            System.out.println("O valor a ser pago é de R$ = "  + valorTotal + " e a taxa de entrega é de R$ = " + taxa);

            int prazoEntrega = 7;
            System.out.println("O Produto Chegará em " + prazoEntrega + " dias");
        } else {
            System.out.println("Indisponível no momento");
        }

        sc.close();
    }

    }




