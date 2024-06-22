

import Tela.Cadastro;
import Tela.TelaLogin;

import javax.swing.*;


public static void main(String[] args) {

   SwingUtilities.invokeLater(() -> {
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
    });

    SwingUtilities.invokeLater(() -> {
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
    });
  /**  SwingUtilities.invokeLater(() -> {
        telaProduto tp = new telaProduto();
        tp.setVisible(true);
    }); **/
}



