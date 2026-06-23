package RPG.Teste02.test01;

import RPG.Teste02.exercito1.ControleTropa;
import RPG.Teste02.exercito1.InterfaceInterativo;
import RPG.Teste02.exercito1.Soldado;

public class teste02 {
    public static void main(String[] args) {
        Soldado s1 = new Soldado(0,0,0,0,1,1);
        ControleTropa tp = new ControleTropa(s1);
        InterfaceInterativo fc = new InterfaceInterativo(s1);

        tp.controleTropa("",fc);
    }
}
