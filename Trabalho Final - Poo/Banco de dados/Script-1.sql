CREATE TABLE Produto (
Id INTEGER PRIMARY KEY AUTOINCREMENT,
Nome String ,
Preco DOUBLE ,
quantidade INTEGER 

    SELECT * FROM  Produto p 
 
   
	DELETE FROM   Produto  WHERE Nome  = '';
	DELETE FROM   Produto  WHERE Preco  = '';
	DELETE FROM   Produto  WHERE quantidade =  '';


	UPDATE Produto SET NOME = '' WHERE Nome = '';
	UPDATE Produto SET Preco = '' WHERE Preco = '';
	UPDATE Produto SET quantidade  = '' WHERE quantidade = '';

	INSERT INTO Produto (Nome,Preco,Quantidade)VALUES ('','','');
	

);
------------------------------------------------------------------------
CREATE TABLE  Pedido (
Id INTEGER PRIMARY KEY AUTOINCREMENT ,
Nome String ,
ValorTotal Float ,
Status String,
quantidade INTEGER ,
DataPagamento String,
Endereco String

    SELECT * FROM  Pedido p 
 
 
	DELETE FROM   Pedido  WHERE Nome  = '';
	DELETE FROM   Pedido  WHERE ValorTotal  = '';
	DELETE FROM   Pedido  WHERE Status =  '';
	DELETE FROM   Pedido  WHERE quantidade =  '';
	DELETE FROM   Pedido  WHERE DataPagamento =  '';
	DELETE FROM   Pedido  WHERE Endereco =  '';

	UPDATE Pedido SET Nome = '' WHERE Nome ='' ;
	UPDATE Pedido SET ValorTotal = '' WHERE ValorTotal = '';
	UPDATE Pedido SET Status = '' WHERE Status = '';
	UPDATE Pedido SET Quantidade = '' WHERE Quantidade = '';
	UPDATE Pedido SET DataPagamento = '' WHERE DataPagamento = '';
	UPDATE Pedido SET Endereco = '' WHERE Endereco = '';

	INSERT INTO Pedido ( NOME,ValorTotal, Status,quantidade,DataPagamento,Endereco )VALUES ('','','','','','');

);
-------------------------------------------------------------------------
CREATE TABLE  Pessoa (
Id INTEGER PRIMARY KEY AUTOINCREMENT,
Nome String,
Email String,
Telefone String

    SELECT * FROM  Pessoa p 
 
	DELETE FROM   Pessoa  WHERE Nome  = '';
	DELETE FROM   Pessoa  WHERE Email  = '';
	DELETE FROM   Pessoa  WHERE Telefone =  '';
	

	UPDATE Pessoa SET NOME = 'Daniel' WHERE Nome = '';
	UPDATE Pessoa SET TELEFONE = '(+31)99457-5939' WHERE Telefone = '';
	UPDATE Pessoa SET Email  = 'danielOfc@gmail.com' WHERE Email = '';


	INSERT INTO Pessoa ( NOME,TELEFONE, EMAIL)VALUES ('DANIEL','(+31)99845-1758','danielOfc@gmail.com');
	INSERT INTO Pessoa ( NOME, TELEFONE,EMAIL)VALUES ( 'PIETRO', '(+31)99764-4521','Pietro5050@gmail.com');
	INSERT INTO Pessoa ( NOME, TELEFONE,EMAIL)VALUES ( 'FELIPE', '(+31)99899-7548','Felipe2009@gmail.com');

);
------------------------------------------------------------------------
CREATE TABLE  PessoaFisica (
Id INTEGER PRIMARY KEY AUTOINCREMENT,
Cpf String

	SELECT * FROM  PessoaFisica pf 
	
	DELETE FROM    PessoaFisica  WHERE Cpf  = '';

 	UPDATE Pessoa SET Cpf = '' WHERE Cpf ='' ;
 
 	INSERT INTO PessoaFisica (Cpf)VALUES ('');
);
------------------------------------------------------------------------
CREATE  TABLE PessoaJuridica (
Id INTEGER PRIMARY KEY AUTOINCREMENT,
Cnpj String

 	SELECT * FROM  PessoaJuridica pj 
 
	DELETE FROM    PessoaJuridica  WHERE Cnpj  = '';

	UPDATE PessoaJuridica SET Cnpj = '' WHERE Cnpj ='' ;

	INSERT INTO PessoaJuridica (Cnpj)VALUES ('');
);
------------------------------------------------------------------------
CREATE TABLE Carrinho (
 Id INTEGER PRIMARY KEY AUTOINCREMENT,
 cep INTEGER
 
    SELECT * FROM  Carrinho c 
  
  
	DELETE FROM   Carrinho  WHERE cep  = '';

	UPDATE carrinho SET cep = '34826450' WHERE cep ='' ;

	INSERT INTO Carrinho (cep)VALUES ('34826450');
		
);
------------------------------------------------------------------------
CREATE TABLE Estoque (
 Id INTEGER PRIMARY KEY AUTOINCREMENT,
 Nome String , 
 Quantidade INTEGER ,
 NumerodeSerie INTEGER
 
    SELECT * FROM  Estoque e 
 
	DELETE FROM   Estoque  WHERE Nome  = '';
	DELETE FROM   Estoque  WHERE NumerodeSerie  = '';
	DELETE FROM   Estoque  WHERE quantidade =  '';

	UPDATE Estoque    SET Nome = '' WHERE Nome ='' ;
	UPDATE Estoque    SET quantidade = '' WHERE Quantidade = '';
	UPDATE Estoque    SET NumerodeSerie = '' WHERE NumerodeSerie = '';

	INSERT INTO Estoque ( Nome ,quantidade,NumerodeSerie)VALUES ('','','',);
);
------------------------------------------------------------------------
CREATE  TABLE Fornecedor (
 Id INTEGER PRIMARY KEY AUTOINCREMENT,
 Nome String ,
 Telefone INTEGER ,
 Email String ,
 Endereco String
 
    SELECT * FROM  Fornecedor f 
  
	DELETE FROM  Fornecedor  WHERE Nome  = '';
	DELETE FROM  Fornecedor  WHERE Telefone  = '';
	DELETE FROM  Fornecedor  WHERE Email =  '';
	DELETE FROM  Fornecedor  WHERE Endereco =  '';

	UPDATE Fornecedor SET Nome = '' WHERE Nome ='' ;
	UPDATE Fornecedor SET Telefone = '' WHERE Telefone = '';
	UPDATE Fornecedor SET Email = '' WHERE Email = '';
	UPDATE Fornecedor SET Endereco = '' WHERE Endereco = '';

	INSERT INTO Fornecedor ( NomeEmissor , DataEmissao , DataValidade)VALUES ('','','',);
	
   
);
------------------------------------------------------------------------
CREATE  TABLE Certificacao (
 Id INTEGER PRIMARY KEY AUTOINCREMENT,
 DataEmissao INTEGER ,
 NomeEmissor String ,
 DataValidade INTEGER
 
    SELECT * FROM  Certificacao c 
  
	DELETE FROM  Certificacao  WHERE DataEmissao  = '';
	DELETE FROM  Certificacao  WHERE NomeEmissor  = '';
	DELETE FROM  Certificacao  WHERE DataValidade =  '';

	
	UPDATE Certificacao SET DataEmissao = '' WHERE DataEmissao ='' ;
	UPDATE Certificacao SET NomeEmissor = '' WHERE NomeEmissor = '';
	UPDATE Certificacao SET DataValidade= '' WHERE DataValidade = '';

	


	INSERT INTO Certificacao ( NomeEmissor , DataEmissao , DataValidade)VALUES ('','','',);
	
);
-------------------------------------------------------------
CREATE  TABLE Pagamento(
 Id INTEGER PRIMARY KEY AUTOINCREMENT,
 Quantidade INTEGER ,
 Pagamento INTEGER ,
 Endereco  String ,
 Preco INTEGER 
 
 
    SELECT * FROM  Pagamento p 
 
	DELETE FROM Pagamento WHERE Preco  = '';
	DELETE FROM Pagamento WHERE Pagamento  = '';
	DELETE FROM Pagamento WHERE Endereco  =  '';
	DELETE FROM Pagamento WHERE Quantidade  =  '';


	UPDATE Pagamento SET Preco = '' WHERE Preco ='' ;
	UPDATE Pagamento SET Pagamento = '' WHERE Pagamento = '';
	UPDATE Pagamento SET Endereco = '' WHERE Endereco = '';
	UPDATE Pagamento SET Quantidade = '' WHERE Quantidade = '';
	


	INSERT INTO Pagamento ( Preco, Pagamento , Endereco,Quantidade)VALUES ('','','','');
	
 
);
-------------------------------------------------------------
CREATE  TABLE Funcionario (
 Id INTEGER PRIMARY KEY AUTOINCREMENT,
 Nome String ,
 Cpf String ,
 Telefone String ,
 Email	String
 
    SELECT * FROM  Funcionario f 
  
  	
	DELETE FROM Funcionario WHERE Nome  = '';
	DELETE FROM Funcionario WHERE Cpf  = '';
	DELETE FROM Funcionario WHERE Telefone  =  '';
	DELETE FROM Funcionario WHERE Email  =  '';

UPDATE Funcionario SET Cpf = '15091100843' WHERE Cpf ='' ;
UPDATE Funcionario SET NOME = 'João' WHERE Nome = '';
UPDATE Funcionario SET TELEFONE = '(+31)99377-5939' WHERE Telefone = '';
UPDATE Funcionario SET Email  = 'joãofc@gmail.com' WHERE Email = '';

INSERT INTO Funcionario ( NOME,TELEFONE, Cpf , EMAIL)VALUES ('EMILLY','(+31)99845-6778','15091100548','Emilly450@gmail.com');
INSERT INTO Funcionario ( NOME, TELEFONE, Cpf, EMAIL)VALUES ( 'DANIEL', '(+31)99744-4541','18011960843', 'daniel220@gmail.com');
INSERT INTO Funcionario ( NOME, TELEFONE,Cpf , EMAIL)VALUES ( 'GUSTAVO', '(+31)99794-4548','13011402460', 'gustavo550@gmail.com');
	 
);
--------------------------------------------------------------