package MyPractice;

public class ArrayAverage {

    public int averageNumb(int [] number){
        int sum = 0;
        int average;

        for (int j : number) {
            sum += j;
        } average = sum / number.length;
        return average;
    }
}
