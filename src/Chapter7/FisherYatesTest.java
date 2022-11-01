package Chapter7;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;

public class FisherYatesTest {

    @Test
    public void shuffleArr(){
        FisherYates fisherYates;
        int [] numbs = {3,2,1,5,7};
        assertNotEquals(numbs,FisherYates.number(numbs));
    }


}
