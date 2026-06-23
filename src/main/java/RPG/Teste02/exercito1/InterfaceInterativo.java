package RPG.Teste02.exercito1;
import javax.swing.*;

public class InterfaceInterativo {
    private Soldado sc;

    private JFrame frame;
    private JLabel texto;

    public InterfaceInterativo(Soldado sc) {
        this.sc = sc;

        frame = new JFrame("Console RPG");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        texto = new JLabel();
        texto.setBounds(20, 20, 350, 100);

        frame.add(texto);

        frame.setVisible(true);

        atualizarTela();
    }

    public void atualizarTela() {
        String info =
                "Para começar digite: mov_x | mov_y | info | off\n" +
                        "Vida: " + sc.getVida() + "\n" +
                        "Posição X: " + sc.pos_x() + "\n" +
                        "Posição Y: " + sc.pos_y();

        texto.setText("<html>" + info.replace("\n", "<br>") + "</html>");
    }

    public void limparTela(){
        texto.setText("");
    }
}
