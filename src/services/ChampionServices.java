package services;

import entities.Champion;

import java.util.List;

public class ChampionServices {

    private List<Champion> championList;
    public ChampionServices(List<Champion> championList) {
        this.championList = championList;

    }

    public void fight(int n) {

        Champion champion1 = championList.get(0);
        Champion champion2 = championList.get(1);

        for (int i = 0; i < n; i++) {

           int turno = i + 1;

            champion1.takeDamage(champion2);
            champion2.takeDamage(champion1);

            if (champion1.getLife() > 0 && champion2.getLife() > 0) {
                summary( turno, champion1,  champion2);

            } else {
                summary( turno, champion1,  champion2);
                System.out.println("FIM DO COMBATE ");
                return;
            }

        }

    }

    public void summary(int turno, Champion champion1, Champion champion2){
        System.out.println("Resultado do turno " + turno);
        System.out.println(champion1.status());
        System.out.println(champion2.status());
        System.out.println();
    }


}
