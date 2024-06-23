package Classes;

import java.util.Scanner;

public class PessoaFisica extends Pessoa{
    private int id;
    private String cpf;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public PessoaFisica() {
        super();
        this.cpf = "";
    }
    @Override
    public void Cadastro () {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------- ");
        System.out.println("\n");
        System.out.println(" Repita Por Favor Algumas Informações ");
        System.out.println("---------------------------------------------- ");
        super.Cadastro();
        System.out.println(" CPF :");
        setCpf(cpf);
        cpf = (sc.nextLine());
        System.out.print("\n");
        System.out.println("Cadastro Efetuado com Sucesso | PessoaFisica | :) ");
    }


    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println("CPF      : " + getCpf());


    }
    @Override
    public void remover (){
        super.remover();
        if (cpf.isEmpty()) {

        } else {

            this.cpf = "";


        }
    }
}
