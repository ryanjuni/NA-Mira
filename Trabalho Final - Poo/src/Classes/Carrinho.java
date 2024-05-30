package Classes;
import java.util.ArrayList;

public class Carrinho extends Pessoa {
    private String nome;
    private float valor;
    private int quatidade;
    private int Id_DoPedido;
    private ArrayList<Integer> item;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuatidade() {
        return quatidade;
    }

    public void setQuatidade(int quatidade) {
        this.quatidade = quatidade;
    }

    public int getId_DoPedido() {
        return Id_DoPedido;
    }

    public void setId_DoPedido(int id_DoPedido) {
        Id_DoPedido = id_DoPedido;
    }


    public Carrinho() {
        item = new ArrayList<>();
    }


    public void adicionar (int quatidade,float valor) {
        System.out.println("Adicionando no Carrinho ....");
        ArrayList <Integer> item = new ArrayList<Integer>();
        item.add(quatidade);
        item.add(Id_DoPedido);


        this.Id_DoPedido = (int) (quatidade * valor /5*3);


        this.quatidade += quatidade;
        this.valor += quatidade * valor ;
    }
       public void  Imprimir (){
        if (nome == null){
            System.out.println("Nome nao foi definido.");
        }else {
            System.out.println("Nome :"+nome);
        }

        System.out.println("Id   :"+ Id_DoPedido);
        System.out.println("Quantidade do Carrinho = " + quatidade);
        System.out.println("Valor Total R$ = " + valor);

    }

}
