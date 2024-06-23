import Tela.TelaLogin;
import Tela.TelaPrincipal;

import javax.swing.*;

public class Main {
    public static void main(String[]args){
        JFrame t = new JFrame("NaMira");
        t.setContentPane(new TelaPrincipal().principalFrame);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setResizable(true);
        t.setSize(600,600);
        t.setLocationRelativeTo(null);
        t.setVisible(true);
    }
}
