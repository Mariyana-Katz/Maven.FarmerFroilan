package CropTest;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.WatermelonVine;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Food.Watermelon;
import org.junit.Assert;
import org.junit.Test;

public class WatermelonVineTest {


    @Test
    public void testInheritance(){
        WatermelonVine watermelonVine = new WatermelonVine();
        Assert.assertTrue(watermelonVine instanceof Crop);
    }

    @Test
    public void testYield1(){
        WatermelonVine watermelonVine = new WatermelonVine();
        watermelonVine.fertilize();
        Assert.assertTrue(watermelonVine.yield() instanceof Watermelon);
    }

    @Test
    public void testHarvest(){
        Crop crop = new WatermelonVine();
        Assert.assertFalse(crop.hasBeenHarvested());

        crop.harvest();
        Assert.assertTrue(crop.hasBeenHarvested());
    }


    @Test
    public void testHasBeenHarvested() {
        Crop crop = new WatermelonVine();
        Assert.assertFalse(crop.hasBeenHarvested());

        crop.harvest();
        Assert.assertTrue(crop.hasBeenHarvested());
    }

    @Test
    public void testFertilize(){
        Crop crop = new WatermelonVine();
        Assert.assertFalse(crop.hasBeenFertilized());

        crop.fertilize();
        Assert.assertTrue(crop.hasBeenFertilized());
    }


    @Test
    public void testHasBeenFertilized() {
        Crop crop = new WatermelonVine();
        Assert.assertFalse(crop.hasBeenFertilized());

        crop.fertilize();
        Assert.assertTrue(crop.hasBeenFertilized());
    }






}
