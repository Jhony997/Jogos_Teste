package JavaFX.Teste02.dominio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

public class Screen {
    JFrame jf = new JFrame();
    JLabel textGold = new JLabel();
    JLabel textUp = new JLabel();
    JLabel textUpgradeUp = new JLabel();
    JLabel textBooleano = new JLabel();
    JLabel textQuantiaOuroGanho = new JLabel();
    JButton button = new JButton();
    JButton buttonUp = new JButton();
    JButton buttonAfk = new JButton();
    Game game = new Game(0,10,1,false);

    Timer timer = new Timer(1000, e -> {
       game.ganhoPassivo();
        textGold.setText("Ouro : " + game.getGold());
    });

    public Screen(){
        jf.setVisible(true);
        jf.setSize(800,500);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLayout(null);

        button.setVisible(true);
        button.setBounds(0,0,200,100);
        button.setText("Click me");
        button.setFont(new Font("Arial",Font.BOLD,20));
        button.setForeground(new Color(0,0,0));
        button.setBackground(new Color(27, 180, 184));

        buttonUp.setVisible(true);
        buttonUp.setBounds(300,0,200,100);
        buttonUp.setText("Upgrades");
        buttonUp.setFont(new Font("Arial",Font.BOLD,20));
        buttonUp.setForeground(new Color(0,0,0));
        buttonUp.setBackground(new Color(27, 180, 184));

        buttonAfk.setVisible(true);
        buttonAfk.setBounds(580,0,200,100);
        buttonAfk.setText("Afk ganho");
        buttonAfk.setFont(new Font("Arial",Font.BOLD,20));
        buttonAfk.setForeground(new Color(0,0,0));
        buttonAfk.setBackground(new Color(27, 180, 184));


        button.addActionListener(this::ganhoMoeda);
        buttonUp.addActionListener(this::updrages);
        buttonAfk.addActionListener(this::afkGanho);

        textGold.setVisible(true);
        textGold.setBounds(0,400,200,100);
        textGold.setText("Ouro : " + game.getGold());
        textGold.setFont(new Font("Arial",Font.BOLD,20));
        textGold.setForeground(new Color(0,0,0));
        textGold.setBackground(new Color(27, 180, 184));

        textQuantiaOuroGanho.setVisible(true);
        textQuantiaOuroGanho.setBounds(0,70,200,100);
        textQuantiaOuroGanho.setText("Ganho click : " + game.getTotalBonus());
        textQuantiaOuroGanho.setFont(new Font("Arial",Font.BOLD,20));
        textQuantiaOuroGanho.setForeground(new Color(0,0,0));
        textQuantiaOuroGanho.setBackground(new Color(27, 180, 184));


        textUp.setVisible(true);
        textUp.setBounds(200,400,200,100);
        textUp.setText("Total Upgrades : " + game.getUpgrades());
        textUp.setFont(new Font("Arial",Font.BOLD,20));
        textUp.setForeground(new Color(0,0,0));
        textUp.setBackground(new Color(27, 180, 184));

        textUpgradeUp.setVisible(true);
        textUpgradeUp.setBounds(500,400,200,100);
        textUpgradeUp.setText("Requisito up : " + game.getQuantiaProximoUpgrade());
        textUpgradeUp.setFont(new Font("Arial",Font.BOLD,20));
        textUpgradeUp.setForeground(new Color(0,0,0));
        textUpgradeUp.setBackground(new Color(27, 180, 184));

        textBooleano.setVisible(true);
        textBooleano.setBounds(590,70,200,100);
        textBooleano.setText("AfkGrind : " + game.isGrind());
        textBooleano.setFont(new Font("Arial",Font.BOLD,20));
        textBooleano.setForeground(new Color(0,0,0));
        textBooleano.setBackground(new Color(27, 180, 184));


        jf.add(button);
        jf.add(buttonUp);
        jf.add(buttonAfk);
        jf.add(textGold);
        jf.add(textBooleano);
        jf.add(textUp);
        jf.add(textUpgradeUp);
        jf.add(textQuantiaOuroGanho);
    }

    private void afkGanho(ActionEvent actionEvent) {
        game.afkLoop();
        textBooleano.setText("AfkGrind : " + game.isGrind());
        textGold.setText("Ouro : " + game.getGold());

        if(game.isGrind()){
            timer.start();
        }
    }

    private void updrages(ActionEvent actionEvent) {
        textUp.setText("Total Upgrades : " + game.upgradesJogo());
        textGold.setText("Ouro : " + game.getGold());
        textUpgradeUp.setText("Requisito up : " + game.getQuantiaProximoUpgrade());
        textQuantiaOuroGanho.setText("Ganho click : " + game.getTotalBonus());
    }

    private void ganhoMoeda(ActionEvent actionEvent) {
        textGold.setText("Ouro : " + game.goldGanho());
    }
}
