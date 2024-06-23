package Tela;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaVendas {

    public JPanel framevendas;

    public JSpinner quantMunicao;
    public JSpinner quantAk;
    public JSpinner quantEspingarda;
    public JSpinner quantDesert;
    public JSpinner quantRifle;

    public JPanel item1;
    public JPanel item2;
    public JPanel item3;
    public JPanel item4;
    public JPanel item5;
    public JPanel item6;

    public JLabel img2;
    public JLabel img3;
    public JLabel img4;
    public JLabel img5;
    public JLabel img6;

    public JButton addcarrinhoButton;

    public JCheckBox akBox;
    public Container vendasFrame;
    private JCheckBox municaoBox;
    private JCheckBox glockBox;
    private JCheckBox desertBox;
    private JCheckBox espingardaBox;
    private JCheckBox rifleBox;

    private JSpinner quantGlock;

    private JButton carrinhoButton;
    private JButton sairButtton;

    private ArrayList<Item> itensCarrinho = new ArrayList<>();

    public TelaVendas() {

        carrinhoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                irParaOutraTela();
            }
        });

        addcarrinhoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarItens();
            }
        });

        sairButtton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                framevendas.getTopLevelAncestor().setVisible(false);
            }
        });
    }

    private void salvarItens() {
        if (akBox.isSelected()) {
            itensCarrinho.add(new Item("AK-47", 17400, (Integer) quantAk.getValue()));
        }
        if (municaoBox.isSelected()) {
            itensCarrinho.add(new Item("Munição", 242, (Integer) quantMunicao.getValue()));
        }
        if (glockBox.isSelected()) {
            itensCarrinho.add(new Item("Glock 22", 9490, (Integer) quantGlock.getValue()));
        }
        if (desertBox.isSelected()) {
            itensCarrinho.add(new Item("Desert Eagle", 11365, (Integer) quantDesert.getValue()));
        }
        if (espingardaBox.isSelected()) {
            itensCarrinho.add(new Item("Espingarda Charles", 29800, (Integer) quantEspingarda.getValue()));
        }
        if (rifleBox.isSelected()) {
            itensCarrinho.add(new Item("Rifle Airgun", 15995, (Integer) quantRifle.getValue()));
        }
        mostrarResumoCarrinho();
    }

    private void mostrarResumoCarrinho() {
        StringBuilder resumo = new StringBuilder();
        double valorTotal = 0;

        for (Item item : itensCarrinho) {
            resumo.append(item.getQuantidade())
                    .append("x ")
                    .append(item.getNome())
                    .append(": R$")
                    .append(item.getValor() * item.getQuantidade())
                    .append("\n");
            valorTotal += item.getValor() * item.getQuantidade();
        }

        resumo.append("Valor total: R$").append(valorTotal);

        int confirm = JOptionPane.showConfirmDialog(null, resumo.toString(), "Confirmar Carrinho", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            irParaOutraTela();
        }
    }
    private void irParaOutraTela(){
        TelaCarrinho telaCarrinho = new TelaCarrinho(itensCarrinho);
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(framevendas);
        frame.setContentPane(telaCarrinho.panelCarrinho);
        frame.setLocationRelativeTo(null);
        frame.revalidate();
        frame.repaint();
    };

    public static void main(String[] args) {
        JFrame frame = new JFrame("Vendas");
        frame.setContentPane(new TelaVendas().framevendas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(750,700);
    }
}