package Chapter6;

public class MethodScope {
    private static int x=10;

    public static void cooke(){

        System.out.println("the value of cooke is: "+x);
        x++;
        System.out.println("the new value of cooke: "+x);
    }
    public static void chopstix(){
        x = x + (5 * 5);
        System.out.println("chopstix has the number: "+x);
        x *= 10;
        System.out.println("chopstix takes a new value: "+x);
    }

    public static void main(String[] args) {
        System.out.println("big and bozz: "+x);
        cooke();
        chopstix();
        cooke();
        chopstix();
    }
}
