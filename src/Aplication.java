import entities.Champion;
import services.ChampionServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Champion> championList = new ArrayList<>();

        System.out.println("");


        int quantidade = 2;


        for (int i = 0; i < quantidade; i++) {

            int n = 1 + i;
            System.out.println("Digite os dados do " + (n == 1 ? "primeiro campeão: " : "segundo campeão: "));

            if(n > 1){
                sc.nextLine();
            }

            System.out.print("Nome: ");
            String name = sc.nextLine();



            System.out.print("Vida inicial: ");
            int life = sc.nextInt();

            System.out.print("Ataque: ");
            int attack = sc.nextInt();

            System.out.print("Armadura: ");
            int armor = sc.nextInt();


            Champion champion = new Champion(name,life,attack,armor);
            championList.add(champion);

            System.out.println();



        }

       ChampionServices services = new ChampionServices(championList);

        System.out.print("Quantos turnos você deseja executar? ");
        int n = sc.nextInt();

        System.out.println();

        services.process(n);

        sc.close();

    }
}