//package tdd;
//
//import org.testng.annotations.Test;
//
//import static org.junit.Assert.assertTrue;
//import static org.testng.AssertJUnit.assertTrue;
//import static tdd.CrapGameDie.rollDices;
//
//public class CrapGameDieTest {
//    private static final CrapGameDie die1 = new CrapGameDie();
//    private static final CrapGameDie die2 = new CrapGameDie();
//
//    @Test
//
//    public void die1ShouldBeGreaterOrEqualToOne(){
//       for (int i=1; i <= 10; i++){
//           int face1 = die1.rollDie();
//           assertTrue(face1 >= 1);
//       }
//    }
//
//    @Test
//    public void die2ShouldBeGreaterOrEqualToOne(){
//        for (int i=1;i<=10;i++){
//            int face2 = die2.rollDie();
//            assertTrue(face2 >= 1);
//        }
//    }
//
//    @Test
//    public void die1ShouldBeLessThanOrEqualToSix(){
//        for (int i=1;i<=10;i++){
//            int face1 = die1.rollDie();
//            assertTrue(face1 <= 6);
//        }
//    }
//
//    @Test
//    public void die2ShouldBeLessThanOrEqualToSix(){
//        for (int i=1;i<=10;i++){
//            int face2 = die2.rollDie();
//            assertTrue(face2 <= 6);
//        }
//    }
//
//    @Test
//    public void sumOfDieShouldBeGreaterThanOrEqualToTwo() {
//        for(int i = 1; i <= 10; i++) {
//            int face = rollDices(die1, die2);
//            assertTrue(face >= 2);
//        }
//
//    }
//
//    @Test
//    public void sumOfDieShouldBeLessThanOrEqualToTwelve() {
//        for(int i = 1; i <= 10; i++) {
//            int face = rollDices(die1, die2);
//            assertTrue(face <= 12);
//        }
//    }
//
//
//
//
//
//
//}
