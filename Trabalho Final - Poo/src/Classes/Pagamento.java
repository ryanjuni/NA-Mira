package Classes;

public class Pagamento {
        private String Pagamento;
        private  double preco;
        private String Descricao;

        public String getPagamento() {
                return Pagamento;
        }

        public void setPagamento(String pagamento) {
                Pagamento = pagamento;
        }

        public double getPreco() {
                return preco;
        }

        public void setPreco(double preco) {
                this.preco = preco;
        }

        public String getDescricao() {
                return Descricao;
        }

        public void setDescricao(String descricao) {
                Descricao = descricao;
        }
        public Pagamento(){

        }
        public void ImprimirPagamento(){
                System.out.println("Pagamento:"+ Pagamento);
                System.out.println("Preco:"+preco);
                System.out.println("Descricao:"+ Descricao);
        }

}
