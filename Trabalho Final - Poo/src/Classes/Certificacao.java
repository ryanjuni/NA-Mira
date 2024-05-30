package Classes;

public class Certificacao {
    private int id;
    private int dataEmissao;
    private String nomeEmissor;
    private String dataValidade;
    private String Status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(int dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getNomeEmissor() {
        return nomeEmissor;
    }

    public void setNomeEmissor(String nomeEmissor) {
        this.nomeEmissor = nomeEmissor;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
