package CropTest;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


    public static class CropTest {

//    @Test
//    public void testInheritance(){
//        Crop crop = new Crop();
//        Assert.assertTrue(crop instanceof Crop);
//    }




    @Test
    public void testImplementation() {
        Crop crop = new Crop();
        Assert.assertTrue(crop instanceof Produce);
    }

//        @Test
//     public void testHasBeenFertilized(){
//            CropDuster cropDuster = new CropDuster();
//            List<Crop> crops = new ArrayList<Crop>();
//            crops.add(new TomatoPlant());
//            CropRow<Crop> cr = new CropRow<Crop>(crops);
//            cropDuster.fertilized(cr);
//            Assert.assertTrue(cr.hasBeenFertilized());
//        }
//
//        @Test
//     public void testHasBeenHarvested() {
//            Tractor tractor = new Tractor();
//            List<Crop> crops = new ArrayList<Crop>();
//            crops.add(new TomatoPlant());
//            CropRow<Crop> cr = new CropRow<Crop>(crops);
//            tractor.harvested(cr);
//            Assert.assertTrue(cr.hasBeenHarvested());
//        }
        @Test
        public void testYield(){
       int  randomNumber = 7;
       int yield = 1*randomNumber;
       Assert.assertEquals(7, yield);
    }

        @Test
    public void testYield1(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        Assert.assertTrue(tomatoPlant.yield() instanceof Tomato);
    }

        @Test
        public void testYield2(){
            AppleTree AppleT = new AppleTree();
            Assert.assertTrue(appleTree.yield() instanceof Apple);
        }



    }

















