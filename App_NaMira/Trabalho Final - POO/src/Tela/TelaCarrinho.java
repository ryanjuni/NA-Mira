package Tela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaCarrinho {

    public JPanel panelCarrinho;
    private JRadioButton debitoRadioButton;
    private JRadioButton creditoRadioButton;
    private JRadioButton pixRadioButton;
    private JButton verificarButton;
    private JButton pagarButton;
    private ButtonGroup grupoPagamento;

    private ArrayList<Item> itensCarrinho;

    public TelaCarrinho(ArrayList<Item> itensCarrinho) {
        this.itensCarrinho = itensCarrinho;

        grupoPagamento = new ButtonGroup();
        grupoPagamento.add(debitoRadioButton);
        grupoPagamento.add(creditoRadioButton);
        grupoPagamento.add(pixRadioButton);

        verificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (grupoPagamento.getSelection() != null) {
                    mostrarItensCarrinho();
                } else {
                    JOptionPane.showMessageDialog(panelCarrinho, "Por favor, selecione uma forma de pagamento.", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        pagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (grupoPagamento.getSelection() != null) {
                    float total = calcularTotal();
                    String formaPagamento = obterFormaPagamentoSelecionada();
                    criarPedido(total, formaPagamento);
                } else {
                    JOptionPane.showMessageDialog(panelCarrinho, "Por favor, selecione uma forma de pagamento.", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    private float calcularTotal() {
        float total = 0;
        for (Item item : itensCarrinho) {
            total += item.getValor() * item.getQuantidade();
        }
        return total;
    }


    private String obterFormaPagamentoSelecionada() {
        if (debitoRadioButton.isSelected()) {
            return "Débito";
        } else if (creditoRadioButton.isSelected()) {
            return "Crédito";
        } else if (pixRadioButton.isSelected()) {
            return "PIX";
        } else {
            return "Não selecionado";
        }
    }


    private void mostrarItensCarrinho() {
        double total = 0;
        StringBuilder sb = new StringBuilder();
        for (Item item : itensCarrinho) {
            sb.append(item.getNome()).append(": R$ ").append(item.getValor()).append(" x ").append(item.getQuantidade()).append("\n");
            total += item.getValor() * item.getQuantidade();
        }
        sb.append("Total: R$ ").append(total);
        JOptionPane.showMessageDialog(panelCarrinho, sb.toString(), "Itens do Carrinho", JOptionPane.INFORMATION_MESSAGE);
    }


    private void criarPedido(float total, String formaPagamento) {
        StringBuilder sb = new StringBuilder();
        sb.append("Resumo do Pedido:\n\n");
        sb.append("Total: R$ ").append(total).append("\n");
        sb.append("Forma de Pagamento: ").append(formaPagamento).append("\n\n");
        sb.append("Itens do Carrinho:\n");
        for (Item item : itensCarrinho) {
            sb.append(item.getNome()).append(": R$ ").append(item.getValor()).append(" x ").append(item.getQuantidade()).append("\n");
        }

        JOptionPane.showMessageDialog(panelCarrinho, sb.toString(), "Resumo do Pedido", JOptionPane.INFORMATION_MESSAGE);


        int option = JOptionPane.showOptionDialog(panelCarrinho, "Confirma o pedido?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
