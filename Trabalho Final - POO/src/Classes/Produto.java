package Classes;

import Classes.Carrinho;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
        ImageIcon img = new ImageIcon();
    }

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public static ArrayList<String> ProdutoItem() {
        System.out.println("\n");
        System.out.println("[Na Mira]  \n");
        System.out.println("Selecione um Produto : \n");
        ArrayList<String> lista = new ArrayList<String>();
        System.out.println("Produtos");
        System.out.println("\n");
        lista.add(" AK-47               |  R$ (17400)\n");
        lista.add(" Munição             |  R$(242)\n");
        lista.add(" Glock 22            |  R$ (9490)\n");
        lista.add(" Desert Eagle        |  R$(11365)\n");
        lista.add(" Espingarda Charles  |  R$(29800)\n");
        lista.add(" Rifle Airgun        |  R$(15995)\n");
        System.out.println("\n");

        for (String item : lista) {
            System.out.print(item);
        }

        Scanner sc = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("(1) para Adicionar, (2) para Remover, (0) para Sair");
            opcao = sc.nextLine();

            if (opcao.equals("1")) {
                System.out.println("Digite o Nome do produto que deseja adicionar:");
                String nome = sc.nextLine();
                System.out.println("Digite a quantidade do produto:");
                int quantidade = sc.nextInt();
                sc.nextLine();

                Produto produto = null;

                switch (nome.toLowerCase()) {
                    case "rifle ar-15":
                        produto = new Produto(1, " AK-47     ", 17400, quantidade);
                        break;
                    case "espingarda remington 870":
                        produto = new Produto(2, "Munição  ", 242, quantidade);
                        break;
                    case "revolver smith & wesson":
                        produto = new Produto(3, "Glock 22 ", 9490, quantidade);
                        break;
                    case "submetralhadora uzi":
                        produto = new Produto(4, "Desert Eagle  ", 11365, quantidade);
                        break;
                    case "rifle de precisão barrett m82":
                        produto = new Produto(5, "Espingarda Charles", 29800, quantidade);
                        break;
                    case "escopeta benelli m4":
                        produto = new Produto(6, "Escopeta Benelli M4 ", 15995, quantidade);
                        break;


                    default:
                        System.out.println("Produto não encontrado!");
                        continue;
                }
                Carrinho.Adicionarcarrinho(produto);
                System.out.println("Produto adicionado com sucesso!");

            } else if (opcao.equals("2")) {
                System.out.println("Digite o Nome do produto que deseja remover:");
                String nome = sc.nextLine();
                Carrinho.RemoverCarrinho(String.valueOf(Integer.parseInt(nome)));
                System.out.println("Produto removido com sucesso!");

            } else if (!opcao.equals("0")) {
                System.out.println("Opção inválida, tente novamente.");
            }
        } while (!opcao.equals("0"));

        sc.close();
        return lista;

    }
}