package Classes;

public class PessoaFisica extends Pessoa{
    private int cpf;


    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }


    public PessoaFisica() {
        super();
    }


    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println("CPF: " + getCpf());


    }
}
