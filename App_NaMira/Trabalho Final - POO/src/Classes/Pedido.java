package Classes;

public class Pedido {
    private int id;
    private String nome;
    private float valorTotal;
    private String status;
    private int quantidade;
    private String dataPagamento;
    private String endereco;


    public Pedido() {
    }


    public Pedido(int id, String nome, float valorTotal) {
        this.id = id;
        this.nome = nome;
        this.valorTotal = valorTotal;
    }


    public Pedido(int id, String nome, float valorTotal, String status, int quantidade, String dataPagamento, String endereco) {
        this.id = id;
        this.nome = nome;
        this.valorTotal = valorTotal;
        this.status = status;
        this.quantidade = quantidade;
        this.dataPagamento = dataPagamento;
        this.endereco = endereco;
    }

    // Getters e Setters para todos os atributos

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

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public void exibirPedido() {
        System.out.println("Pedido ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Valor Total: R$ " + valorTotal);
        System.out.println("Status: " + status);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Data do Pagamento: " + dataPagamento);
        System.out.println("Endereço: " + endereco);
    }


    public void agradecerCompra() {
        System.out.println("\n[ Obrigado pela Sua Confiança :) ]\n");
    }
}
