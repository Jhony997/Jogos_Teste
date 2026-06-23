package JavaFX.Test01;

import JavaFX.Aula1.Screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ScreenTest01 extends JFrame {
    int gold = 0;
    int posi_x = 0;
    int posi_y = 0;
    JLabel texto;
    JLabel textoX;
    JLabel textoY;

    public ScreenTest01(){
        setVisible(true);
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocale(null);

        setLayout(null);

        JButton jButton = new JButton("Farm Gold");
        jButton.setBounds(0,0,300,70);

        JButton jButtonW = new JButton("W");
        jButtonW.setBounds(100,100,50,70);

        JButton jButtonS = new JButton("S");
        jButtonS.setBounds(100,200,50,70);

        JButton jButtonD = new JButton("D");
        jButtonD.setBounds(160,150,50,70);

        JButton jButtonA = new JButton("A");
        jButtonA.setBounds(40,150,50,70);


        add(jButton);
        add(jButtonW);
        add(jButtonS);
        add(jButtonD);
        add(jButtonA);

        jButton.addActionListener(this::teste);
        jButtonW.addActionListener(this::testeW);
        jButtonS.addActionListener(this::testeS);
        jButtonD.addActionListener(this::testeD);
        jButtonA.addActionListener(this::testeA);


        texto = new JLabel("Ouro : 0$ | Teste ");
        texto.setBounds(0,400,350,100);
        texto.setFont(new Font("Arial",Font.ITALIC,20));
        texto.setForeground(new Color(0,0,0));
        texto.setBackground(new Color(97, 213, 173));
        texto.setVisible(true);

        textoX = new JLabel("Posiçao X : 0");
        textoX.setBounds(200,400,350,100);
        textoX.setFont(new Font("Arial",Font.ITALIC,20));
        textoX.setForeground(new Color(0,0,0));
        textoX.setBackground(new Color(97, 213, 173));
        textoX.setVisible(true);

        textoY = new JLabel("Posiçao Y : 0");
        textoY.setBounds(400,400,350,100);
        textoY .setFont(new Font("Arial",Font.ITALIC,20));
        textoY.setForeground(new Color(0,0,0));
        textoY.setBackground(new Color(97, 213, 173));
        textoY.setVisible(true);

        add(texto);
        add(textoX);
        add(textoY);

    }

    private void testeA(ActionEvent actionEvent) {
        posi_x--;
        textoX.setText("Posiçao X : "+posi_x);
    }

    private void testeS(ActionEvent actionEvent) {
        posi_y--;
        textoY.setText("Posiçao Y : "+posi_y);
    }

    private void testeW(ActionEvent actionEvent) {
        posi_y++;
        textoY.setText("Posiçao Y : "+posi_y);
    }

    private void testeD(ActionEvent actionEvent) {
        posi_x++;
        textoX.setText("Posiçao X : "+posi_x);
    }

    private void teste(ActionEvent actionEvent) {
        gold++;
        texto.setText("Ouro : " + gold +"$");
    }
}
