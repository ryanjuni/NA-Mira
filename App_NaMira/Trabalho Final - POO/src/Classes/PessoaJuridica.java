package Classes;

import java.util.Scanner;

public class PessoaJuridica extends Pessoa {
    private int id;
    private  String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;


    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public  PessoaJuridica( String cnpj) {
        this.cnpj = cnpj;

    }

    public PessoaJuridica() {
        super();
        this.cnpj = "" ;
    }

    @Override
    public void Cadastro (){
        Scanner sc = new Scanner(System.in);
        super.Cadastro();
        System.out.println(" CNPJ :");
        setCnpj(cnpj);
        cnpj = sc.nextLine();
        System.out.print("\n");
        System.out.println("Cadastro Efetuado com Sucesso | PessoaJuridica | :) ");
    }

   @Override
    public void Imprimir () {
        super.Imprimir();
        System.out.println("CNPJ     : " + getCnpj());



   }

   @Override
    public void remover(){
        super.remover();
       if (cnpj.isEmpty()) {

       } else {

           this.cnpj = "";


       }
   }


}
