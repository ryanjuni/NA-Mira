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
        lista.add(" Rifle AR-15              |R$ (7500.00)\n");
        lista.add(" Espingarda Remington 870 |R$(3000.00)\n");
        lista.add(" Revolver Smith & Wesson  |R$ (2000.00)\n");
        lista.add(" Submetralhadora Uzi      |R$(9000.00)\n");
        lista.add(" Rifle de Precisão Barrett M82 |R$(15000.00)\n");
        lista.add(" Escopeta Benelli M4 | R$(4500.00)\n");
        lista.add(" Munição| R$(50)\n");
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
                        produto = new Produto(1, "Rifle AR-15", 7500.00, quantidade);
                        break;
                    case "espingarda remington 870":
                        produto = new Produto(2, "Espingarda Remington 870", 3000.00, quantidade);
                        break;
                    case "revolver smith & wesson":
                        produto = new Produto(3, "Revolver Smith & Wesson", 2000.00, quantidade);
                        break;
                    case "submetralhadora uzi":
                        produto = new Produto(4, "Submetralhadora Uzi", 9000.00, quantidade);
                        break;
                    case "rifle de precisão barrett m82":
                        produto = new Produto(5, "Rifle de Precisão Barrett M82", 15000.00, quantidade);
                        break;
                    case "escopeta benelli m4":
                        produto = new Produto(6, "Escopeta Benelli M4", 4500.00, quantidade);
                        break;
                    case "Munição":
                        produto = new Produto(7, "Pistola Desert Eagle", 50, quantidade);
                        break;

                    default:
                        System.out.println("Produto não encontrado!");
                        continue;
                }
                Carrinho.Adicionarcarrinho(produto); // Passar o produto como argumento
                System.out.println("Produto adicionado com sucesso!");

            } else if (opcao.equals("2")) {
                System.out.println("Digite o Nome do produto que deseja remover:");
                String nome = sc.nextLine();
                Carrinho.RemoverCarrinho(String.valueOf(Integer.parseInt(nome))); // Passar o nome como argumento
                System.out.println("Produto removido com sucesso!");

            } else if (!opcao.equals("0")) {
                System.out.println("Opção inválida, tente novamente.");
            }
        } while (!opcao.equals("0"));

        sc.close();
        return lista;

    }
}