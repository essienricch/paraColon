package ClassPractice;

public class MethodOverloading {
    public int addNumbers(int number1, int number2){
      return number1 + number2 + 2;
    }
    public double addNumbers(int number1, double number2){
        return (number1 + number2);
    }
    public double addNumbers(double number1, double number2){
        return (number1 + number2) + 20 ;
    }
    public double addNumbers(double number1, int number2){
        return number1 + number2 ;
    }
    public static void main(String[] args) {
        MethodOverloading overloading = new MethodOverloading();
        int result = (int) overloading.addNumbers(20.5,45.5);
        System.out.printf("%s%d%n","sum of both number's: ", result);
        System.out.println(overloading.addNumbers(4,2));
        System.out.println(overloading.addNumbers(30,23.5));
        System.out.println(overloading.addNumbers(20.5,4));
        System.out.println(overloading.addNumbers(23.5,45.7));
    }
}
