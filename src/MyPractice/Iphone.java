package MyPractice;

public class Iphone {
    private static String color;
    private  static  int price;


    public static void setPrice(int price) {
        Iphone.price=price;

    }

    public static int getPrice() {
        return price;
    }

    public static void setColor(String color){

        Iphone.color=color;
    }
    public static String getColor(){
        return color;
    }
}
