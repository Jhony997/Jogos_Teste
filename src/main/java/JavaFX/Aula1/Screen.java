package JavaFX.Aula1;
// https://www.youtube.com/watch?v=fqyOD-wl1Cs
// 32 - 34
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,
                "tudo certo","Titulo JOption Pane ",JOptionPane.INFORMATION_MESSAGE);
    }

    public Screen() {

        setVisible(true);
        setSize(800,500);
        setTitle("Aula 01 : ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JButton jButton = new JButton();
        jButton.setBounds(100,200,250,70);
        jButton.setText("Click Aqui");
        jButton.setFont(new Font("Arial",Font.BOLD,20));
        jButton.setForeground(new Color(0, 0, 0));
        jButton.setBackground(new Color(78, 221, 180));

        add(jButton);

        JButton jButton2 = new JButton("Ouro");
        jButton2.setBounds(50,50,250,70);
        jButton2.setFont(new Font("Arial",Font.ITALIC,20));
        jButton2.setForeground(new Color(0, 0, 0));
        jButton2.setBackground(new Color(78, 221, 180));

        add(jButton2);

        jButton.addActionListener(this);
        jButton2.addActionListener(this::teste);
    }

    private void teste(ActionEvent actionEvent) {JOptionPane.showMessageDialog(null,
            "Ouro é bom!","Titulo JOption Pane ",JOptionPane.WARNING_MESSAGE);
        System.out.println("Botao ouro!");
    }
}
