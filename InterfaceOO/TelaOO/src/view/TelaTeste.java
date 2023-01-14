package view;



import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaTeste {

    private JFrame janelaPrincipal;
    private JDesktopPane painelDesktop;
    private JInternalFrame janelaInterna;

    public TelaTeste() {
        janelaPrincipal = new JFrame("Janela Principal");
        janelaPrincipal.setSize(500, 500);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria o painel desktop
        painelDesktop = new JDesktopPane();
        janelaPrincipal.add(painelDesktop);

        // Cria a janela interna
        janelaInterna = new JInternalFrame("Janela Interna", true, true, true, true);
        janelaInterna.setSize(300, 300);
        janelaInterna.setLocation(50, 50);
        painelDesktop.add(janelaInterna);

        // Adiciona um label na janela interna
        JLabel label = new JLabel("Conteúdo da Janela Interna");
        janelaInterna.add(label);

        // Exibe as janelas
        janelaInterna.setVisible(true);
        janelaPrincipal.setVisible(true);
    }

    public static void main(String[] args) {
        new TelaTeste();
    }
}