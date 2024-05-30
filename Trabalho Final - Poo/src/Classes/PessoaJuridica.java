package Classes;

public class PessoaJuridica extends Pessoa {
       private  int cnpj;


    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;


    }

    public  PessoaJuridica( int cnpj) {
        this.cnpj = cnpj;

    }

    public PessoaJuridica() {
        super();
    }

   @Override
    public void Imprimir () {
        super.Imprimir();
        System.out.println("CNPJ: " + getCnpj());



   }
}
