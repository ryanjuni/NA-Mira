package Tela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin {
    JPanel loginframe;
    private JTextField txtNome;
    private JButton cadastroBotao;
    private JButton entrarBotao;
    private JPasswordField passwordField1;

    public TelaLogin() {
        cadastroBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameCadastro = new JFrame("Cadastro");
                frameCadastro.setContentPane(new telaCadastro().cadastroFrame);
                frameCadastro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Dispose para fechar apenas esta janela
                frameCadastro.pack();
                frameCadastro.setSize(600, 500);
                frameCadastro.setLocationRelativeTo(null);
                frameCadastro.setVisible(true);
            }
        });

        entrarBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String senha = new String(passwordField1.getPassword());

                if (nome.isEmpty() || senha.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos");
                } else {
                    JFrame frameVendas = new JFrame("Vendas");
                    frameVendas.setContentPane(new TelaVendas().framevendas);
                    frameVendas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação ao fechar esta janela
                    frameVendas.pack();
                    frameVendas.setSize(800, 600);
                    frameVendas.setLocationRelativeTo(null);
                    frameVendas.setVisible(true);

                    JFrame loginFrame = (JFrame) SwingUtilities.getWindowAncestor(loginframe);
                    loginFrame.dispose(); // Fecha o JFrame atual (tela de login)
                }
            }
        });
    }
}
