 package Classes;

public class Pedido {
    private int id;
    private int nomeDoCliente;
    private float tipoDePagamento;
    private float ValorTotal;
    private String StatusdoPagamento;
    private int Quantidade;
    private String DataPagamento;
    private String Endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(int nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public float getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(float tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    public float getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float valorTotal) {
        ValorTotal = valorTotal;
    }

    public String getStatusdoPagamento() {
        return StatusdoPagamento;
    }

    public void setStatusdoPagamento(String statusdoPagamento) {
        StatusdoPagamento = statusdoPagamento;
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
}
