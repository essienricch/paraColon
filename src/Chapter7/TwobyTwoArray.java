package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class TwobyTwoArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = " ";
        String[][] players = {
                                {"JACK", "GWAYNE", "PHAROAH", "CROCS"},
                                {"JAY", "JERRY", "SECURE", "POST"}
                            };

        //for (int count = 0; count < players.length; count++) {
           // for (int i = 0; i < players[count].length; i++) {
               // System.out.println("Enter Team Player Name: ");
                //players[i][count] = input.next();

            System.out.println();
        System.out.print(players[0][0] + " ");
        System.out.print(players[0][1] + " ");
        System.out.print(players[1][3] + " ");

        System.out.println(players[0][3]+ " ");
        System.out.print(players[1][0] + " ");
        System.out.print(players[1][1] + " ");
        System.out.print(players[1][2] + " ");
        System.out.print(players[0][2] + " ");



            //System.out.println();
            /*for (int j = 0; j < players[i].length(); j++) {

                System.out.print(players[i] + " ");
                //System.out.println(players[i][j] + " ");
            }*/
            //System.out.println();


//        for (int k = 0; k < players[i][j]; k++){
//            System.out.printf("%n%s%s", "Double listed players: " , k);

    }
}
