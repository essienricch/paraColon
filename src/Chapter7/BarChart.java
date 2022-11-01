package Chapter7;

public class BarChart {
    public static void main(String[] args) {
        int [] grade = {0,0,0,0,0,0,1,2,4,2,1};

        System.out.println("Grade Distribution: ");

        for (int count = 0; count < grade.length; count++){
            if (count < 10){
                System.out.printf("%02d - %02d: %n", (count * 10),(count * 10 + 9));
            }else {
                System.out.printf("%7d: ",100);
            }

            for (int star = 0; star < grade[count]; star++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
