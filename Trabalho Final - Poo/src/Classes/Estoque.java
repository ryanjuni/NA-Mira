package Classes;
import java.util.Scanner;
public class Estoque {
    private int id;
    private String nome;
    private int quantidade;
    private int NumerodeSerie;


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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getNumerodeSerie() {
        return NumerodeSerie;
    }

    public void setNumerodeSerie(int numerodeSerie) {
        NumerodeSerie = numerodeSerie;
    }



        public void armazenamento () {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o nome do Produto: ");
        sc.nextLine();
        System.out.println("quantidade: ");
        int quantidade = Integer.parseInt(String.valueOf(sc.nextInt()));
        System.out.println("numero de serie:");
        NumerodeSerie = Integer.parseInt(String.valueOf(sc.nextInt()));
        System.out.println("Id:");
        id = Integer.parseInt(String.valueOf(sc.nextInt()));

         System.out.println("\n Retirando do Estoque ....\n");

         if (quantidade <= 0) {
             System.out.println("Esse Produto está em falta :(");
         }
         else {
             System.out.println(" Produto Disponivél no Estoque");
         }

        }

}
