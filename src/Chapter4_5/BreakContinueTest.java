package Chapter4_5;

public class BreakContinueTest {
//    public static void main(String[] args) {
//        int count;
//        for (count = 1; count <= 10; count++){
//            if (count == 6){
//            break;
//            }
//            System.out.println(count);
//        }
//        System.out.printf("%n broke out of loop at Count = %d%n ",count);
//
//    }

    public static void main(String[] args) {
        int i;
        for (i=1;i <= 10;i++){
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println(i);
    }
}
