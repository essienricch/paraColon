package Chapter7.ArcheryGames;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlayerTest {
    private Player player;

    @BeforeEach
    void setUp(){
        player = new Player();
    }


    @Test
   void testThatPlayerIsCreated(){

        assertNotNull(player);
    }

}
