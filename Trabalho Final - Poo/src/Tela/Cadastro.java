package Tela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro extends JFrame {
    private JTextField email;
    private JTextField telefone;
    private JTextField nome;
    private JCheckBox cpf;
    private JButton cadastrarButton;
    private JCheckBox cnpj;
    private JPanel Cadastro2;
    private JPanel TelaInicial;
    private JPanel Telaincial1;
    private JPanel Telainicial2;
    private JButton nãoButton;
    private JButton simButton;

    public Cadastro() {
        setTitle("Cadastro");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        // Inicializar os componentes do formulário de cadastro
        nome = new JTextField(20);
        telefone = new JTextField(20);
        email = new JTextField(20);
        cpf = new JCheckBox("CPF");
        cnpj = new JCheckBox("CNPJ");
        cadastrarButton = new JButton("Cadastrar");

        // Criar o painel principal Cadastro2 com BorderLayout
        Cadastro2 = new JPanel(new BorderLayout());

        // Painel para os campos de entrada (Center)
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Adicionar padding

        // Adicionar componentes ao painel usando GridBagConstraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Nome:"), gbc);

        gbc.gridx = 1;
        formPanel.add(nome, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Telefone:"), gbc);

        gbc.gridx = 1;
        formPanel.add(telefone, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("E-mail:"), gbc);

        gbc.gridx = 1;
        formPanel.add(email, gbc);

        // Adicionar CPF e CNPJ
        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(cpf, gbc);

        gbc.gridx = 1;
        formPanel.add(cnpj, gbc);

        // Adicionar formPanel ao centro de Cadastro2
        Cadastro2.add(formPanel, BorderLayout.CENTER);

        // Painel para as opções (Norte)
        JPanel optionsPanel = new JPanel();
        optionsPanel.add(cpf);
        optionsPanel.add(cnpj);
        Cadastro2.add(optionsPanel, BorderLayout.NORTH);

        // Painel para o botão de cadastrar (Sul)
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(cadastrarButton);
        Cadastro2.add(buttonPanel, BorderLayout.SOUTH);

        // Adicionar Cadastro2 ao JFrame
        add(Cadastro2);

        // Adicionar ActionListener ao botão cadastrarButton
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cnpj.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com Sucesso: Pessoa Jurídica");
                } else if (cpf.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com Sucesso: Pessoa Física");
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, selecione CPF ou CNPJ.");
                    return; // Se nenhum checkbox estiver selecionado, não abrir a tela de login
                }

                // Abrir a tela de login após a mensagem de sucesso
                TelaLogin login = new TelaLogin();
                login.setVisible(true);

                // Fechar a tela de cadastro
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        // Criar e exibir a tela de cadastro
        SwingUtilities.invokeLater(() -> {
            Cadastro cadastro = new Cadastro();
            cadastro.setVisible(true);
        });
    }
}
