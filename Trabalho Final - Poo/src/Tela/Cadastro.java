package Tela;

import javax.swing.*;
import java.awt.*;

import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;
import static java.awt.AWTEventMulticaster.add;

public class Cadastro extends TelaLogin {

    private JButton cadastrarButton;
    private JLabel Texto;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton CPFButton;
    private JButton CNPJButton;
    private JCheckBox checkBox1;

    public void MyFrame() {
        // Set up the frame
        setTitle("Cadastro");
        cadastrarButton.setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // Center the frame

        // Create a panel and add components to it
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add padding

        // Add components to the panel using GridBagConstraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(Texto, gbc);

        gbc.gridx = 1;
        panel.add(textField1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Field 2:"), gbc);

        gbc.gridx = 1;
        panel.add(textField2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Field 3:"), gbc);

        gbc.gridx = 1;
        panel.add(textField3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(CPFButton, gbc);

        gbc.gridx = 1;
        panel.add(CNPJButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(checkBox1, gbc);

        gbc.gridx = 1;
        panel.add(cadastrarButton, gbc);

        // Add panel to the frame
        add(panel);

        // Make the frame visible

    }

    private void setDefaultCloseOperation(int exitOnClose) {

    }

    private void setTitle(String myApplication) {
    }

    private void add(JPanel panel) {

    }

}
