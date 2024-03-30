package CropTest;
import com.zipcodewilmington.froilansfarm.Food.Dragonfruit;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class DragonfruitTest {

    @Test

    @Test
    public void testInheritance(){
        Dragonfruit dragonfruit = new Dragonfruit();
        Assert.assertTrue(dragonfruit instanceof Crop);
    }

    @Test
    public void testYield1(){
        Dragonfruit dragonfruit = new Dragonfruit();
        dragonfruit.fertilize();
        Assert.assertTrue(dragonfruit.yield() instanceof Dragonfruit);
    }

    @Test
    public void testHarvest(){
        Crop crop = new Dragonfruit();
        Assert.assertFalse(crop.hasBeenHarvested());

        crop.harvest();
        Assert.assertTrue(crop.hasBeenHarvested());
    }


    @Test
    public void testHasBeenHarvested() {
        Crop crop = new Dragonfruit();
        Assert.assertFalse(crop.hasBeenHarvested());

        crop.harvest();
        Assert.assertTrue(crop.hasBeenHarvested());
    }

    @Test
    public void testFertilize(){
        Crop crop = new Dragonfruit();
        Assert.assertFalse(crop.hasBeenFertilized());

        crop.fertilize();
        Assert.assertTrue(crop.hasBeenFertilized());
    }


    @Test
    public void testHasBeenFertilized() {
        Crop crop = new Dragonfruit();
        Assert.assertFalse(crop.hasBeenFertilized());

        crop.fertilize();
        Assert.assertTrue(crop.hasBeenFertilized());
    }

}
