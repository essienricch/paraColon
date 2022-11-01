package Chapter7;

public class ArraySum {
    //display main method (PSVM)
    public static void main(String[] args) {

        //initialize a variable name total to zero
        int total=0;
        //initialize an array with data elements
        int [] bones = {10,29,30,49,44,54,37};
        // set a looping counter (FOR LOOP) and assign the variable
        System.out.println("chauffeur\r Index  \"Bones\"");
        for(int count=0; count < bones.length; count++) {
            // variable total store up the sum of elements of the array in it
            total += bones[count];
            //displays the sum
            System.out.printf("%n%3d%9d", count, bones[count]);
        }
        System.out.println();
        System.out.println("total of all values in the array: "+total);

    }
}