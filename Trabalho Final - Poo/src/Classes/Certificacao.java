package Classes;

import java.util.Scanner;

public class Certificacao {
    private int id;
    private int dataEmissao;
    private String nomeEmissor;
    private int dataValidade;


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

    public int getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(int dataValidade) {
        this.dataValidade = dataValidade;
    }

    public  void imprimirCertificacao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do Orgão Emissor :");
        String nomeEmissor = sc.nextLine();

        System.out.println("Data de Emissão (Ano):");
        int dataEmissao = Integer.parseInt(sc.nextLine());

        System.out.println("Data de Validade (Ano):");
        int dataValidade = Integer.parseInt(sc.nextLine());

        System.out.println("Id :");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Você tem 18 anos? (sim/não):");
        String resposta = sc.nextLine();
        boolean maiorDeIdade = resposta.equalsIgnoreCase("sim");

        if (maiorDeIdade) {
            System.out.println("\nCertificado com sucesso!\n");
            System.out.println("\n------------------------------\n");
            System.out.println("Orgão Emissor: " + nomeEmissor);
            System.out.println("ID: " + id);
            System.out.println("Data de Validade: " + dataValidade);
            System.out.println("Data de Emissão: " + dataEmissao);
            System.out.println("\n------------------------------\n");
            System.out.println("Certificação Aceita com sucesso!");
        } else {
            System.out.println("-----------------------------------------------");
            System.out.println("Acesso Negado !!!! :(");
        }

        sc.close();
    }

}

