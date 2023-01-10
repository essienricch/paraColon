package timsChallenge.bills_burger;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Dotted","Brown",true);
        hamburger.addExtras();
        System.out.println(hamburger.viewBurgerExtrasPrice("tomato"));

    }
}
