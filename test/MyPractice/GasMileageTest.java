package MyPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMileageTest {

    @Test
    void totalAverage(){
        double average =GasMileage.totalAverage(250,5,10);
        assertEquals(5.0,average);
    }
}
