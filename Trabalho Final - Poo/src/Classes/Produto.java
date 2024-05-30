package Classes;

public class Produto {
    private String nome;
    private double peso;
    private String calibre;
    private String Precisao;
    private float  velocidade;
    private Double Pontecia;
    private double recuo;
    private float capacidadeDeMunicao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCalibre() {
        return calibre;
    }

    public void setCalibre(String calibre) {
        this.calibre = calibre;
    }

    public String getPrecisao() {
        return Precisao;
    }

    public void setPrecisao(String precisao) {
        Precisao = precisao;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public Double getPontecia() {
        return Pontecia;
    }

    public void setPontecia(Double pontecia) {
        Pontecia = pontecia;
    }

    public double getRecuo() {
        return recuo;
    }

    public void setRecuo(double recuo) {
        this.recuo = recuo;
    }

    public float getCapacidadeDeMunicao() {
        return capacidadeDeMunicao;
    }

    public void setCapacidadeDeMunicao(float capacidadeDeMunicao) {
        this.capacidadeDeMunicao = capacidadeDeMunicao;
    }
}
