package MyPractice;

public class Sum2Largest {
        static int [] large = new int[2];
    public static int [] largeElement(int [] numb){
        int large1  = numb[0];
        int large2 = numb[0];
        int temp;
        for (int i = 1; i < numb.length; i++) {
            if (numb[i] > large1){
                large1 = numb[i];
                if (large1 > large2){
                   temp = large1;
                    large1 = large2;
                    large2 = temp;
                }
            }
        }
        large[0] = large1;
        large[1] = large2;
        return large;
    }

    public static int largeSum(int [] large) {
        int sum = 0;
        for (int i = 0; i < large.length; i++) {
            sum += large[i];
        }return sum;
    }
}
