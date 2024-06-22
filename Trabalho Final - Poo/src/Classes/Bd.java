import java.sql.*;

public void conectarEExecutarBancoDeDados() {
    // URL do banco de dados SQLite
    String url = "jdbc:sqlite:meu_banco_de_dados.db";

    // Código SQL para criar as tabelas
    String sql =
            "CREATE TABLE IF NOT EXISTS Produto (" +
                    "Id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "Nome TEXT," +
                    "Preco DOUBLE," +
                    "Quantidade INTEGER);" +

                    "CREATE TABLE IF NOT EXISTS Pedido (" +
                    "Id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "Nome TEXT," +
                    "ValorTotal FLOAT," +
                    "Status TEXT," +
                    "Quantidade INTEGER," +
                    "DataPagamento TEXT," +
                    "Endereco TEXT);" +

                    "CREATE TABLE IF NOT EXISTS Pessoa (" +
                    "Id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "Nome TEXT," +
                    "Email TEXT," +
                    "Telefone TEXT);" +

                    "CREATE TABLE IF NOT EXISTS PessoaFisica (" +
                    "Id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "Cpf TEXT);" +

                    "CREATE TABLE IF NOT EXISTS PessoaJuridica (" +
                    "Id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "Cnpj TEXT);" +

                    "CREATE TABLE IF NOT EXISTS Carrinho (" +
                    "Id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "Cep INTEGER);" +

                    "CREATE TABLE IF NOT EXISTS Estoque (" +
                    "Id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "Nome TEXT," +
                    "Quantidade INTEGER," +
                    "NumeroDeSerie INTEGER);" +

                    "CREATE TABLE IF NOT EXISTS Fornecedor (" +
                    "Id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "Nome TEXT," +
                    "Telefone INTEGER," +
                    "Email TEXT," +
                    "Endereco TEXT);" +

                    "CREATE TABLE IF NOT EXISTS Certificacao (" +
                    "Id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "DataEmissao INTEGER," +
                    "NomeEmissor TEXT," +
                    "DataValidade INTEGER);" +

                    "CREATE TABLE IF NOT EXISTS Pagamento (" +
                    "Id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "Quantidade INTEGER," +
                    "Pagamento INTEGER," +
                    "Endereco TEXT," +
                    "Preco INTEGER);" +

                    "CREATE TABLE IF NOT EXISTS Funcionario (" +
                    "Id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "Nome TEXT," +
                    "Cpf TEXT," +
                    "Telefone TEXT," +
                    "Email TEXT);";

    // Conexão ao banco de dados
    try (Connection conn = DriverManager.getConnection(url);
         Statement stmt = conn.createStatement()) {

        // Executar a criação das tabelas
        stmt.executeUpdate(sql);

        // Exemplo de inserção de dados
        String insertSql = "INSERT INTO Produto (Nome, Preco, Quantidade) VALUES ('Produto1', 10.0, 100);";
        stmt.executeUpdate(insertSql);

        // Exemplo de seleção de dados
        ResultSet rs = stmt.executeQuery("SELECT * FROM Produto;");
        while (rs.next()) {
            System.out.println("Id: " + rs.getInt("Id") + ", Nome: " + rs.getString("Nome") + ", Preço: " + rs.getDouble("Preco") + ", Quantidade: " + rs.getInt("Quantidade"));
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}


public void main() {
}

