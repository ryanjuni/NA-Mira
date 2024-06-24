package Classes;

import java.util.Scanner;



    public class Pagamento  {

        private int preco;
        private int quantidade;
        private int pagamento;
        private String endereco;
        private int id;

        public String getEndereco() {
            return this.endereco;
        }

        public int getPreco() {
            return preco;
        }

        public void setPreco(int preco) {
            this.preco = preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public int getPagamento() {
            return this.pagamento;
        }

        public void setPagamento(int pagamento) {
            this.pagamento = pagamento;
        }

        public Pagamento() {
        }

        public int ImprimirPagamento( ) {
            Scanner sc2 = new Scanner(System.in);
            this.pagamento = preco * quantidade;
            System.out.println(" Id :");
            id = Integer.parseInt(String.valueOf(sc2.nextInt()));
            System.out.println("  Qual a Forma de Pagamento: (1) Dinheiro (2) Pix (3) Cartão de Credito");
            String Opcao = String.valueOf(sc2.nextInt());
            switch (Opcao) {
                case "1 ":
                    System.out.println("Dinheiro");
                    System.out.println("\n Total a pagar : R$  " + pagamento);
                    break;
                case "2":
                    System.out.println("Pix");
                    System.out.println("\n Total a pagar : R$  " + pagamento);
                    break;
                case "3":
                    System.out.println("Cartão de Credito");
                    System.out.println(" \n Total a pagar : R$  " + pagamento/quantidade);
                    break;
                default:
                    System.out.println("\n [Forma de Pagamento Invalída !!] \n");

                    if (this.pagamento >= preco) {
                        System.out.println("\n Pagamneto realizado com Sucesso \n");
                    } else {
                        System.out.println("\n Pagamento Recusado !!!\n");
                    }



            }
            return pagamento;
        }
    }


