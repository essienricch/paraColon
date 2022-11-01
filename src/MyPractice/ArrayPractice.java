package MyPractice;

public class ArrayPractice {
    public static void main(String[] args) {
        int[][][] myArray = new int[2][2][2];
        myArray[0][0][0] = 8;
        myArray[0][0][1]= 10;
        myArray[0][1][0]= 15;
        myArray[0][1][1]= 19;
        myArray[1][0][0]= 19;
        myArray[1][0][1]= 20;
        myArray[1][1][0]= 25;
        myArray[1][1][1]= 22;
        printSolution(myArray);
        }
    public static void printSolution (int array [][][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }

            }
            System.out.println("");
        }
    }
}
