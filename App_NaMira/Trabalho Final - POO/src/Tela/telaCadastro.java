package Tela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.*;


public class telaCadastro {
    public JPanel cadastroFrame;
    public JTextField txtNome;
    public JButton certificacaoBotao;
    public JButton voltarBotao;
    private JTextField txtSenha;
    private JButton cadastrarBotao;
    private JTextField txtEmail;
    private JTextField txtCpf;
    private JTextField txtCnpj;
    private JTextField txtEndereco;

    public telaCadastro() {
        voltarBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameLogin = new JFrame("Login");
                frameLogin.setContentPane(new TelaLogin().loginframe);
                frameLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameLogin.pack();
                frameLogin.setSize(600, 400);
                frameLogin.setLocationRelativeTo(null);
                frameLogin.setVisible(true);

                JFrame cadastroFrame = new JFrame();
                cadastroFrame = (JFrame) SwingUtilities.getWindowAncestor(cadastroFrame);
                cadastroFrame.dispose();
            }
        });

        certificacaoBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(cadastroFrame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    JOptionPane.showMessageDialog(cadastroFrame, "Arquivo selecionado: " + ((File) selectedFile).getAbsolutePath());
                }
            }
        });

        cadastrarBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtNome.getText();
                String email = txtEmail.getText();
                String senha = txtSenha.getText();
                String cpf = txtCpf.getText();
                String cnpj = txtCnpj.getText();
                String endereco = txtEndereco.getText();

                if (usuario.isEmpty() || email.isEmpty() || senha.isEmpty()) {
                    JOptionPane.showMessageDialog(cadastroFrame, "Nome, email e senha não podem estar vazios.");
                    return;
                }

                String tipoPessoa;
                if (!cpf.isEmpty()) {
                    tipoPessoa = "Pessoa Física";
                } else if (!cnpj.isEmpty()) {
                    tipoPessoa = "Pessoa Jurídica";
                } else {
                    JOptionPane.showMessageDialog(cadastroFrame, "CPF ou CNPJ devem ser preenchidos.");
                    return;
                }

                // Exibe a mensagem de cadastro realizado com sucesso
                JOptionPane.showMessageDialog(cadastroFrame, "Cadastro realizado com sucesso! [" + tipoPessoa + "]");
            }
        });
    }
}
