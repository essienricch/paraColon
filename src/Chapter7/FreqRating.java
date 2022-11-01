package Chapter7;


/*Twenty students were asked to rate on a scale of 1 to 5 the quality of the food in the
        student cafeteria, with 1 being “awful” and 5 being “excellent.” Place the 20 responses
        in an integer array and determine the frequency of each rating */

public class FreqRating {
    public static void main(String[] args) {
        int [] response = {2,5,3,1,2,1,3,4,3,5,5,2,1,5,4,5,2,31,4,2};
        int [] frequency = new int [6];
        int answer = 0;
        for (answer = 0; answer < response.length; answer++){
            try {
                ++frequency[response[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
               // System.out.println(response.toString());
                System.out.println(e);

            }
        }System.out.printf(" responses[%d] = %d%n%n", response.length-3,response[17]);
        System.out.printf("%n%s%15s%n", "RATING","FREQUENCY");
        for (int rate = 1; rate < frequency.length;rate++){
            System.out.printf("%d%12d%n",rate,frequency[rate]);
        }
    }
}
