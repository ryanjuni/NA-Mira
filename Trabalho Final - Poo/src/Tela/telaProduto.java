package Tela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaProduto extends JFrame {
    private JPanel vendas;
    private JPanel Produtos;
    private JButton adicionarButton;
    private JButton removerButton;
    private JButton sairButton;
    private JSpinner spinner6;
    private JSpinner spinner1;
    private JCheckBox escolherCheckBox2;
    private JCheckBox escolherCheckBox5;
    private JSpinner spinner5;
    private JCheckBox escolherCheckBox1;
    private JSpinner spinner4;
    private JCheckBox escolherCheckBox;
    private JCheckBox escolherCheckBox4;
    private JSpinner spinner3;
    private JSpinner spinner2;
    private JCheckBox escolherCheckBox3;
    private JLabel Item4;
    private JLabel Item1;
    private JLabel Item2;
    private JLabel Item3;
    private JLabel Item5;
    private JLabel Item6;

    public telaProduto() {
        setTitle("Tela de Produtos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        vendas = new JPanel(new BorderLayout());
        Produtos = new JPanel(new GridLayout(3, 2, 10, 10));
        Produtos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        adicionarProduto("Rifle AR-15", "/Imagens/1.png", 100, 100, 2500.00, Produtos);
        adicionarProduto("Espingarda Remington 870", "/Imagens/2.png", 100, 100, 1500.00, Produtos);
        adicionarProduto("Revolver Smith & Wesson", "/Imagens/3.png", 100, 100, 1200.00, Produtos);
        adicionarProduto("Submetralhadora Uzi", "/Imagens/4 (1).png", 100, 100, 1800.00, Produtos);
        adicionarProduto("Rifle de Precisão Barrett M82", "/Imagens/5.png", 100, 100, 3000.00, Produtos);
        adicionarProduto("Escopeta Benelli M4", "/Imagens/6.png", 200, 200, 2000.00, Produtos);


        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        adicionarButton = new JButton("Adicionar", createScaledImageIcon("/Imagens/add.png", 20, 20));
        removerButton = new JButton("Remover", createScaledImageIcon("/Imagens/remove.png", 20, 20));
        sairButton = new JButton("Sair", createScaledImageIcon("/Imagens/exit.png", 20, 20));

        buttonPanel.add(adicionarButton);
        buttonPanel.add(removerButton);
        buttonPanel.add(sairButton);

        vendas.add(new JScrollPane(Produtos), BorderLayout.CENTER);
        vendas.add(buttonPanel, BorderLayout.SOUTH);

        add(vendas);

        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Produto adicionado ao Carrinho.");
            }
        });

        removerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Produto removido do Carrinho.");
            }
        });

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    private void adicionarProduto(String nome, String caminhoImagem, int largura, int altura, double preco, JPanel painel) {
        JPanel produtoPanel = new JPanel();
        produtoPanel.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new BorderLayout());
        JCheckBox checkBox = new JCheckBox(nome);
        checkBox.setIcon(createScaledImageIcon(caminhoImagem, largura, altura));
        checkBox.setHorizontalTextPosition(SwingConstants.CENTER);
        checkBox.setVerticalTextPosition(SwingConstants.BOTTOM);
        JLabel precoLabel = new JLabel(String.format("R$ %.2f", preco), SwingConstants.CENTER);

        topPanel.add(checkBox, BorderLayout.CENTER);
        topPanel.add(precoLabel, BorderLayout.SOUTH);

        JSpinner spinner = new JSpinner();
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(spinner, BorderLayout.CENTER);

        produtoPanel.add(topPanel, BorderLayout.CENTER);
        produtoPanel.add(bottomPanel, BorderLayout.SOUTH);

        painel.add(produtoPanel);
    }

    protected ImageIcon createScaledImageIcon(String path, int width, int height) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            ImageIcon icon = new ImageIcon(imgURL);
            Image image = icon.getImage();

            int originalWidth = image.getWidth(null);
            int originalHeight = image.getHeight(null);
            double aspectRatio = (double) originalWidth / originalHeight;

            int newWidth;
            int newHeight;

            if (originalWidth > originalHeight) {
                newWidth = width;
                newHeight = (int) (width / aspectRatio);
            } else {
                newHeight = height;
                newWidth = (int) (height * aspectRatio);
            }

            Image scaledImage = image.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            return new ImageIcon(scaledImage);
        } else {
            System.err.println("Não foi possível encontrar o arquivo de ícone: " + path);
            return null;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            telaProduto tp = new telaProduto();
            tp.setVisible(true);
        });
    }
}
