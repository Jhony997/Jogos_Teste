package RPG.Teste01.Reino;

public class ReinoPadrao {
    private String nomeReino;
    private int ouro;
    private int tropas;
    private String rei;

    public ReinoPadrao(String nomeReino, int ouro, int tropas, String rei) {
        this.nomeReino = nomeReino;
        this.ouro = ouro;
        this.tropas = tropas;
        this.rei = rei;
    }

    public void informacaoReino(){
        System.out.println("--- Informaçao ---");
        System.out.println("Reino : " + nomeReino +  " | " + "Rei : " + rei);
        System.out.println("Quantidade de ouro : " + ouro + "$");
        System.out.println("Quantia de tropas : " + tropas + "x");
    }
}
