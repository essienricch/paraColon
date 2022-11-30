package MyPractice;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementTest {

    @Test
    void toTestForLengthOfElements(){
       int getword = ElementTypes.lenghtOfWord("g_1!!_+(56)ehaz5zit67");
        assertEquals(6,getword);
    }
}
