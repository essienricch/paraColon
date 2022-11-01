package Chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2x2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList <ArrayList <String>> team = new ArrayList<>();

        ArrayList <String> barcaPlayers = new ArrayList<>();
        barcaPlayers.add(0,"XAVI");
        barcaPlayers.add(1,"TER-STERGEN");
        barcaPlayers.add(2,"BELLERIN");
        barcaPlayers.add(3,"PIQUE");
        barcaPlayers.add(4,"ARAUJO");
        barcaPlayers.add(5,"SERGIO");

        ArrayList <String> barca2 = new ArrayList<>();
        barca2.add(0,"RICHARD");
        barca2.add(1,"DEMBELE");
        barca2.add(2,"PEDRI");
        barca2.add(3,"LEWANDOSKI");
        barca2.add(4,"A.FATI");

        ArrayList <String> barca3 = new ArrayList<>();
        barca3.add(0,"FERRAN");
        barca3.add(1,"MEMPHIS");
        barca3.add(2,"GAVI");
        barca3.add(3,"RAPHINHA");
        barca3.add(4,"KOUNDE");

        team.add(barcaPlayers);
        team.add(barca2);
        team.add(barca3);

        System.out.println(team.get(2).get(3));



        //String name;

       /* for (int i =0; i < barcaPlayers.size(); i++){
            System.out.println("Enter a player name: ");
            name = input.next();
            barcaPlayers.add(name);
        }*/

       // System.out.println(barcaPlayers);
    }
}
