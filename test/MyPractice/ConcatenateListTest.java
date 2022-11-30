package MyPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConcatenateListTest {

    @Test
    void toTestThatTwoListConcatenate(){
        String [] number = {"1","2","3"};
        String [] letter = {"a","b","c"};
       String [] joint = ConcatenateList.addTwoArray(number,letter);
       assertArrayEquals(new String []{"1","2","3","a","b","c"}, joint);
    }
}
