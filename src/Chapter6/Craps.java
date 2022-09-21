package Chapter6;
import java.security.SecureRandom;
public class Craps {


    public static final SecureRandom randomNumbers = new SecureRandom();

    public enum Status{CONTINUE , WON, LOST};

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN, YO_LEVEN -> gameStatus = Status.WON;
            case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.LOST;
            default -> {
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("point is %d%n", myPoint);
            }
        }
        while(gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();

            if(sumOfDice == myPoint){
                gameStatus = Status.WON;
            }
            else{
                if(sumOfDice == SEVEN || sumOfDice == YO_LEVEN){
                    gameStatus = Status.LOST;
                }
            }
        }
        if(gameStatus == Status.WON){
            System.out.println("Player wins");
        }
        else{
            System.out.println("Player loses");
        }
    }

    private static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n",die1,die2,sum);

        return sum;
    }

    public static Status getGameStatus(int sumOfDice){
        Status gameStatus;
        int myPoint;
        switch (sumOfDice) {
            case SEVEN, YO_LEVEN -> gameStatus = Status.WON;
            case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.LOST;
            default -> {
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("point is %d%n", myPoint);
            }
        }
        return gameStatus;
    }
    public static String playGame(int sumOfDice){
        int myPoint = 0;
        Status gameStatus = getGameStatus(sumOfDice);

//        int sumOfDice = rollDice();


        while(gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();

            if(sumOfDice == myPoint){
                gameStatus = Status.WON;
            }
            else{
                if(sumOfDice == SEVEN){
                    gameStatus = Status.LOST;
                }
            }
        }
        if(gameStatus == Status.WON){
            return "Player wins";
        }
        else{
            return "Player loses";
        }
    }
}