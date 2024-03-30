package CropTest;
import CropRow.CropRow;
import org.junit.Assert;
import org.junit.Test;

public class AppleTreeTest {


    @Test
    public void testInheritance(){
        AppleTree appleTree = new AppleTree();
        Assert.assertTrue(appleTree instanceof Crop);
    }
    @Test
    public void testYield1(){
        AppleTree appleTree = new AppleTree();
        appleTree.fertilize();
        Assert.assertTrue(appleTree.yield() instanceof Apple);
    }

    @Test
    public void testHarvest(){
        Crop crop = new AppleTree();
        Assert.assertFalse(crop.hasBeenHarvested());

        crop.harvest();
        Assert.assertTrue(crop.hasBeenHarvested());
    }


    @Test
    public void testHasBeenHarvested() {
        Crop crop = new AppleTree();
        Assert.assertFalse(crop.hasBeenHarvested());

        crop.harvest();
        Assert.assertTrue(crop.hasBeenHarvested());
    }

    @Test
    public void testFertilize(){
        Crop crop = new AppleTree();
        Assert.assertFalse(crop.hasBeenFertilized());

        crop.fertilize();
        Assert.assertTrue(crop.hasBeenFertilized());
    }


    @Test
    public void testHasBeenFertilized() {
        Crop crop = new AppleTree();
        Assert.assertFalse(crop.hasBeenFertilized());

        crop.fertilize();
        Assert.assertTrue(crop.hasBeenFertilized());
    }

}
