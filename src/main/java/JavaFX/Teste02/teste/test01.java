package JavaFX.Teste02.teste;

import JavaFX.Teste02.dominio.Game;
import JavaFX.Teste02.dominio.Screen;

public class test01 {
    public static void main(String[] args) {
        Game gm1 = new Game(0,10,1,false);
        Screen screen = new Screen();

        gm1.ganhoPassivo();

    }
}
