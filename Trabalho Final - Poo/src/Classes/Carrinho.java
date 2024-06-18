package Classes;
import java.util.Scanner;

public class Carrinho extends Produto {
    private int id;
    private int cep;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public Carrinho() {
        super();

    }


    public static void Adicionarcarrinho(Produto produto) {
        Scanner sc = new Scanner(System.in);


        System.out.println(" Cep:");
        System.out.println("cep : " + sc.nextLine());


    }
    public static void RemoverCarrinho(String nome) {

    }

}








