package MyPractice;

public class ArrayLargSmal {
    public static void main(String[] args) {
        int [] array = {12,2,5,7,9};
        int largest = 0;
        int smallest = 10000000;

        for (int count = 0; count < array.length; count++){
            if (array[count] > largest){
                largest = array[count];
            }if (array[count] < smallest){
                smallest = array[count];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
