package dsa.multidimensional_array;

import java.util.Arrays;

public class Two_D_Array {
    public static void main(String[] args) {

//
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '>';
            }
        }

        char[][] boardTwo = new char[][]{
                new char[] {'-','>'},
                new char[] {'<','-'},
                new char[] {':',';','?' }
        };

        board[0][0] = 'o';
        board[1][1] = 'p';
        board[2][2] = 'e';

        System.out.println("Board-Two" + "--> "+Arrays.deepToString(boardTwo));
        System.out.println("Board-one" + "--> "+Arrays.deepToString(board));




    }

}
