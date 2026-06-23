package RPG.Teste02.exercito1;

public class Soldado {
    private int vida;
    private int pos_x;
    private int pos_y;
    private int id_tropa;
    private int andar_x;
    private int andar_y;

    public Soldado(int vida, int pos_x, int pos_y, int id_tropa, int andar_x, int andar_y) {
        this.vida = vida;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.id_tropa = id_tropa;
        this.andar_x = andar_x;
        this.andar_y = andar_y;
    }

    public int pos_x(){
        pos_x+=andar_x;
        return pos_x;
    }

    public int pos_y(){
        pos_y+=andar_y;
        return pos_y;
    }

    public int getVida() {
        return vida;
    }

    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void imprime(){
        System.out.println("Posiçao x : " + pos_x);
        System.out.println("Posiçao y : " + pos_y);
    }
}
