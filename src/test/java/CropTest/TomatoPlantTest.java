package CropTest;
import com.zipcodewilmington.froilansfarm.Food.Dragonfruit;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {


     @Test
     public void testInheritance(){
         TomatoePlant tomatoePlant  = new TomatoePlant();
         Assert.assertTrue(tomatoePlant instanceof Crop);
     }

    @Test
    public void testYield1(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.fertilize();
        Assert.assertTrue(tomatoPlant.yield() instanceof Tomato);
    }

    @Test
    public void testHarvest(){
        Crop crop = new TomatoPlant();
        Assert.assertFalse(crop.hasBeenHarvested());

        crop.harvest();
        Assert.assertTrue(crop.hasBeenHarvested());
    }


    @Test
    public void testHasBeenHarvested() {
        Crop crop = new TomatoPlant();
        Assert.assertFalse(crop.hasBeenHarvested());

        crop.harvest();
        Assert.assertTrue(crop.hasBeenHarvested());
    }

    @Test
    public void testFertilize(){
        Crop crop = new TomatoPlant();
        Assert.assertFalse(crop.hasBeenFertilized());

        crop.fertilize();
        Assert.assertTrue(crop.hasBeenFertilized());
    }


    @Test
    public void testHasBeenFertilized() {
        Crop crop = new TomatoPlant();
        Assert.assertFalse(crop.hasBeenFertilized());

        crop.fertilize();
        Assert.assertTrue(crop.hasBeenFertilized());
    }




//      @Test
//
//    public void TestYieldTomatoe() {
//         Tomatoe tomatoe  = new Tomatoe();
//         int yield = tomatoe.yieldTomatoe();
//         int expected = 30;
//         Assert.assertEquals(expected, yield);


}
