package Tela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal {
    public JPanel principalFrame;
    public JButton simBotao;
    public JButton naoBotao;
    public TelaPrincipal() {
        simBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame t = new JFrame("");
                t.setContentPane(new TelaLogin().loginframe);
                t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                t.pack();
                t.setResizable(true);
                t.setSize(600, 500);
                t.setLocationRelativeTo(null);
                t.setVisible(true);
            }
        });
            naoBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(naoBotao);
                frame.dispose();
            }
        });
    }



}

