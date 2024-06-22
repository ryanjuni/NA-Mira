package Classes;
import java.util.Scanner;

public class Carrinho extends Produto {
    private int id;
    private int endereco;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int cep) {
        this.endereco = cep;
    }

    public Carrinho() {
        super();

    }


    public static void Adicionarcarrinho(Produto produto) {
        Scanner sc = new Scanner(System.in);


        System.out.println(" Endereço:");
        System.out.println("endereço : " + sc.nextLine());


    }
    public static void RemoverCarrinho(String nome) {

    }

}








