package RPG.Teste02.exercito1;

import java.util.Scanner;

public class ControleTropa {
    private Soldado s1;

    public ControleTropa(Soldado s1) {
        this.s1 = s1;
    }

    public void controleTropa(String input, InterfaceInterativo fc){
        boolean e = true;
        Scanner sc = new Scanner(System.in);

        while (e){
            fc.limparTela();
            fc.atualizarTela();
            input = sc.next();

            switch (input){
                case "mov_x":
                    System.out.println("\rVoce andou direçao X");
                    s1.pos_x();
                    break;
                case "mov_y":
                    System.out.println("\rVoce andou direçao Y");
                    s1.pos_y();
                    break;
                case "info":
                    System.out.println("\rdesligando sistema !");
                    s1.imprime();
                    break;
                case "off":
                    e = false;
                    break;
                default:
                    System.out.println("\rCase inválido | Palavras : " + " mov_x | mov_y | info | off");
                    break;
            }
        }
    }
}
