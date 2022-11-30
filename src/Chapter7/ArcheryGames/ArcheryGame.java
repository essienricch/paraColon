package Chapter7.ArcheryGames;

public class ArcheryGame {
   // private final Player[] players;
    private Player [] players;

    public ArcheryGame(int numberOfArchers){
      players  = new Player[numberOfArchers];
        for (int i = 0; i < numberOfArchers; i++) {
            players[i] = new Player();
        }
    }
    public Player[] getPlayers() {
      return players;
    }

    public static void addPlayers(int numberOfArchers){

    }
}
