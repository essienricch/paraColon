package Chapter4;

import java.util.Scanner;

public class DisplayRowsColumn {
    public static void main(String[] args) {
        int rows ;
        int columns;
        String symbol = " ";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter # of ROWS: ");
        rows = input.nextInt();

        System.out.println("Enter # of COLUMNS: ");
        columns = input.nextInt();

        System.out.println("Enter any Symbol: ");
        symbol = input.next();

        for (int i = 0; i < rows; i++){
            System.out.println();
            for (int j = 0; j < columns; j++){
                System.out.print(symbol + " ");
            }
        }
    }
}
