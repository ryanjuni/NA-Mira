package Tela;

import javax.swing.*;
import java.awt.*;

public class TelaLogin extends JFrame {
    private JTextField email;
    private JPasswordField senha;
    private JButton loginButton;
    private JPanel panel1;
    private JButton entrarButton;
    private JTextField nomeTextField;
    private JLabel Login;
    private JPasswordField passwordField1;

    public TelaLogin() {
        setTitle("Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        // Inicializar os componentes do formulário de login
        email = new JTextField(20);
        senha = new JPasswordField(20);
        loginButton = new JButton("Login");

        // Painel para os campos de entrada
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Adicionar padding

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("E-mail:"), gbc);

        gbc.gridx = 1;
        formPanel.add(email, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Senha:"), gbc);

        gbc.gridx = 1;
        formPanel.add(senha, gbc);

        // Painel para o botão de login
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(loginButton);

        // Adicionar os painéis ao JFrame
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

}
