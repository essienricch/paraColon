package Chapter7.sudoku;



public class Sudoku {
    public void checkersBoard(int number) {
        int [][] myArray = new int[number][number];
        for (int row = 0; row != myArray.length; row++) {
            for (int column = 0; column != myArray[row].length; column++) {
                int digit = row + column + 1;
                if (digit > myArray.length){
                    digit %= myArray.length;
                }
                myArray[row][column] = digit;
            }
        }

        for (int index = 0; index != myArray.length; index++) {
            for (int other = 0; other != myArray.length; other++) {
                System.out.print(myArray[index][other] + " ");
            }
            System.out.println(" ");
        }
    }

}
