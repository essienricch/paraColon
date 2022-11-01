package Chapter4;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TabularOutputTest {

    @Test
    void singleValueTest(){
        int value = TabularOutput.singleOutput(5);
        assertEquals(5,value);
    }

    @Test
    void squareRootTest(){
        int root = TabularOutput.rootOfValue(5);
        assertEquals(25,root);
    }

    @Test
    void tripleRootTest(){
        int tripleRoot = TabularOutput.tripleRoot(5);
        assertEquals(125,tripleRoot);
    }

    @Test
    void quadrupleTest(){
        int quadruple = TabularOutput.quadrupleValue(5);
        assertEquals(625,quadruple);
    }


}
