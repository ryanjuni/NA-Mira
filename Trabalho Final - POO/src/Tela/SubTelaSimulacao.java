package Tela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubTelaSimulacao extends JFrame {
    private JLabel lblNome;
    private JLabel lblEmail;
    private JLabel lblCpfCnpj;
    private JLabel lblEndereco;

    private JTextField txtNomeSimulado;
    private JTextField txtEmailSimulado;
    private JTextField txtCpfCnpjSimulado;
    private JTextField txtEnderecoSimulado;
    private JButton voltarBotao;

    public SubTelaSimulacao() {
        setTitle("Dados Salvos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));

        lblNome = new JLabel("Nome:");
        txtNomeSimulado = new JTextField();
        txtNomeSimulado.setEditable(false);
        panel.add(lblNome);
        panel.add(txtNomeSimulado);

        lblEmail = new JLabel("Email:");
        txtEmailSimulado = new JTextField();
        txtEmailSimulado.setEditable(false);
        panel.add(lblEmail);
        panel.add(txtEmailSimulado);

        lblCpfCnpj = new JLabel("CPF/CNPJ:");
        txtCpfCnpjSimulado = new JTextField();
        txtCpfCnpjSimulado.setEditable(false);
        panel.add(lblCpfCnpj);
        panel.add(txtCpfCnpjSimulado);

        lblEndereco = new JLabel("Endereço:");
        txtEnderecoSimulado = new JTextField();
        txtEnderecoSimulado.setEditable(false);
        panel.add(lblEndereco);
        panel.add(txtEnderecoSimulado);

        voltarBotao = new JButton("Voltar para Login");
        panel.add(new JLabel()); // Adiciona um rótulo vazio para ajustar o layout
        panel.add(voltarBotao);

        add(panel);

        voltarBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameLogin = new JFrame("Login");
                frameLogin.setContentPane(new TelaLogin().loginframe);
                frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frameLogin.pack();
                frameLogin.setSize(600, 400);
                frameLogin.setLocationRelativeTo(null);
                frameLogin.setVisible(true);

                dispose();
            }
        });
    }

    public void simularDados(String nome, String email, String cpfCnpj, String endereco) {
        txtNomeSimulado.setText(nome);
        txtEmailSimulado.setText(email);
        txtCpfCnpjSimulado.setText(cpfCnpj);
        txtEnderecoSimulado.setText(endereco);
    }
}

