package CropTest;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {


     @Test
     public void testInheritance(){
         TomatoePlant tomatoePlant  = new TomatoePlant();
         Assert.assertTrue(tomatoePlant instanceof Crop);
     }
//      @Test
//
//    public void TestYieldTomatoe() {
//         Tomatoe tomatoe  = new Tomatoe();
//         int yield = tomatoe.yieldTomatoe();
//         int expected = 30;
//         Assert.assertEquals(expected, yield);


      }







}
