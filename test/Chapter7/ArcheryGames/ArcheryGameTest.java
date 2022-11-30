package Chapter7.ArcheryGames;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArcheryGameTest {
    private ArcheryGame game;


    @BeforeEach
    void setUp(){
        game = new ArcheryGame(1);
    }

    @Test
    void testThatGameExists(){
        assertNotNull(game);
    }

    @Test
    void testThatPlayersCanExistInArcheryGame(){
        Player[] players = game.getPlayers();
        assertNotNull(players);
        assertTrue(players.length > 0);
    }

    @Test
    void testThatGameHasPlayer(){
        Player[] players = game.getPlayers();
        Player player = players[0];
        assertNotNull(player);
    }


}
