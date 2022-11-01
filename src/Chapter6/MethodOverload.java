package Chapter6;

public class MethodOverload {
    public static int scopatumuna(int scope, double scope1){
        return (int) (scope * scope1);
    }
    public static double scopatumuna(double scope, int scope1){
        double sum =(scope + scope1) * 10;
        return sum;
    }
    public static double scopatumuna(double scope, double scope1){
        return scope + scope1;
    }

    public static void main(String[] args) {
        System.out.println(scopatumuna(10,10.2));
        System.out.println(scopatumuna(2.5,3));
        System.out.println(scopatumuna(10.5,12.5));

    }
}
