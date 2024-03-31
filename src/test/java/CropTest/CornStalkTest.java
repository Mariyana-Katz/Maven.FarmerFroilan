package CropTest;
import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {



    @Test
    public void testInheritance(){
        CornStalk cornStalk = new CornStalk();
        Assert.assertTrue(cornStalk instanceof Crop);
    }
    @Test
    public void testYield1(){
       CornStalk cornStalk = new CornStalk();
       cornStalk.fertilize();
        Assert.assertTrue(cornStalk.yield() instanceof EarCorn);
    }

    @Test
    public void testHarvest(){
        Crop crop = new CornStalk();
        Assert.assertFalse(crop.hasBeenHarvested());

        crop.harvest();
        Assert.assertTrue(crop.hasBeenHarvested());
    }


    @Test
    public void testHasBeenHarvested() {
        Crop crop = new CornStalk();
        Assert.assertFalse(crop.hasBeenHarvested());

        crop.harvest();
        Assert.assertTrue(crop.hasBeenHarvested());
    }

    @Test
    public void testFertilize(){
        Crop crop = new CornStalk();
        Assert.assertFalse(crop.hasBeenFertilized());

        crop.fertilize();
        Assert.assertTrue(crop.hasBeenFertilized());
    }


    @Test
    public void testHasBeenFertilized() {
        Crop crop = new CornStalk();
        Assert.assertFalse(crop.hasBeenFertilized());

        crop.fertilize();
        Assert.assertTrue(crop.hasBeenFertilized());
    }

}
