package MyPractice;



public class Array {

    private static int nElement;
    private static int[] number = new int[30];


    public static void insert(int value) {
        number[nElement] = value;
            nElement++;
    }

    public static void isDisplay() {
        for (int count = 0; count < nElement; count++) {
            System.out.print(number[count]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void isSearch(int value) {
        int count;
        int temp =0;
        for (count = 0; count < number.length; count++) {
            if (value == number[count]) {
                    System.out.println(value + " found  in the index "+ count);
                    break;
            }
        }if (count==number.length)
            System.out.println(value + " Not found in the list");
    }


    public static void deleteSect ( int values){
            int count1;

            for (count1 = 0; count1 < number.length; count1++) {
                if (values == number[count1]) {
                        System.out.println("number " + values + " Found and will be adjusted on the list " + count1);
                    break;
                }
            }
            for (int i = count1; i < nElement; i++) {
                   number[i] = number[i + 1];
            }
            nElement--;

            if (count1 == nElement) {
                System.out.println("The number doesn't match the numbers on the list");
                System.out.println("Number Not updated on the list");
            }
    }

}

