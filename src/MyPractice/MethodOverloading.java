package MyPractice;

public class MethodOverloading {
    public int addNumbers(int number1, int number2){

        return number1 + number2 + 2;
    }
    public int addNumbers(int number1, double number2){
        return (int)(number1 + number2);
    }
    public double addNumbers(double number1, double number2){
        return (number1 + number2) + 20 ;
    }
    public double addNumbers(double number1, int number2){

        return (double) (number1 + number2) ;
    }
    public static void main(String[] args) {
        MethodOverloading overloading = new MethodOverloading();
        System.out.println(overloading.addNumbers(4,2));
        System.out.println(overloading.addNumbers(23,30.5));
        System.out.println(overloading.addNumbers(56.5,10.0));
        System.out.println(overloading.addNumbers(10.5,23));
    }
}
