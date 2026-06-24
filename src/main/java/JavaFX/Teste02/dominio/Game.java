package JavaFX.Teste02.dominio;

import java.util.Timer;

public class Game {
    private int gold;
    private int upgrades;
    private int quantiaProximoUpgrade;
    private int totalBonus;
    private boolean isGrind;

    public Game(int gold,int quantiaProximoUpgrade,int grindUpgrade,boolean isGrind) {
        this.gold = gold;
        this.quantiaProximoUpgrade = quantiaProximoUpgrade;
        this.totalBonus = grindUpgrade;
        this.isGrind = isGrind;
    }

    public boolean isGrind() {
        return isGrind;
    }


    public void afkLoop(){
        if(gold >= 1_500){
            isGrind = true;
            gold-=1_500;
        }else {
            System.out.println("Voce precisa de 1_500$ para realizar essa açao!");
        }
    }

    public int ganhoPassivo(){
        gold+= totalBonus;
        return gold;
    }


    public int upgradesJogo(){
        if(gold >= quantiaProximoUpgrade){
            gold-=quantiaProximoUpgrade;
            upgrades++;
            totalBonus++;
            quantiaProximoUpgrade*=2;
        }

        return upgrades;
    }

    public int getTotalBonus() {
        return totalBonus;
    }

    public int getQuantiaProximoUpgrade() {
        return quantiaProximoUpgrade;
    }

    public int getUpgrades() {
        return upgrades;
    }

    public int goldGanho (){
        gold += totalBonus;
        return gold;
    }

    public int getGold() {
        return gold;
    }

}
