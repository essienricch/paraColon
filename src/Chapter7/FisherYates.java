package Chapter7;

public class FisherYates {

    public static int [] number (int [] number){
        int index=0;
        for (int count = 0; count < number.length; count++){
            index = (int) (Math.random() * number.length);

            int temp = number[count];
            number[count] = number[index];
            number[index] = temp;
        }
        return new int[]{number[index]};

    }

    public static void main(String[] args) {
        int [] num = {5,1,23,2,4};
        FisherYates.number(num);
    }


}
