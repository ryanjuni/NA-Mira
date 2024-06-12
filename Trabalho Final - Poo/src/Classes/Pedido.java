 package Classes;
import java.util.Scanner;

public class Pedido extends Pagamento {
    private int id;
    private int nome;
    private float ValorTotal;
    private String Status;
    private int Quantidade;
    private String DataPagamento;
    private String Endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }


    public float getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float valorTotal) {
        ValorTotal = valorTotal;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public String getDataPagamento() {
        return DataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        DataPagamento = dataPagamento;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
    /**
     * criar a sobre carga
     *
     */

    public void Pedido_ (String pagamento,int id,String nome,float valorTotal,int quantidade,String dataPagamento,String endereco) {

        System.out.println("Pedido : \n " );
        System.out.println("Id: \s"+id );
        System.out.println("Nome :\s"+nome );
        System.out.println("Quantidade:\s"+quantidade);
        System.out.println("Endereco: \s" + endereco);
        System.out.println("Data do Pagamento: " + dataPagamento);
        System.out.println("Status: " + pagamento);
        System.out.println("Valor total: " + valorTotal);

        System.out.println("\n [   Obrigado pela Sua Confiança :) ] \n " );



    }
}

