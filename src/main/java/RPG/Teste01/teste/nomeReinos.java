package RPG.Teste01.teste;

import RPG.Teste01.Reino.*;

public class nomeReinos {
    public static void main(String[] args) {
        Reino1 r1 = new Reino1("Reino doces",15,7,"julain");
        Reino2 r2 = new Reino2("Reino pedras",0,15,"danilo");
        Reino3 r3 = new Reino3("Reino fogo",2,20,"jonas");
        Reino4 r4 = new Reino4("Reino gelo",12_000,1_000,"kelvin");
        Reino5 r5 = new Reino5("Reino azul",1_500,200,"carlos");
        Reino6 r6 = new Reino6("Reino vermehlo",1,2,"betinha");

        r1.informacaoReino();
        r2.informacaoReino();
        r3.informacaoReino();
        r4.informacaoReino();
        r5.informacaoReino();
        r6.informacaoReino();

    }
}
