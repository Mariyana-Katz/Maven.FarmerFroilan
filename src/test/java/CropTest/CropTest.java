package CropTest;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CropTest {



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
        CropRow<tomatoPlant> rowOne = new CropRow<>();
        if(croprow.hasBeenFertilized = true && croprow.hasBeenHarvested = false){

        }
           Assert.assertTrue(true);
        }
        }


    @Test
    public void testYield2(){
        CropRow<Crop> rowOne = new CropRow<>();
        if(croprow.hasBeenFertilized == false && croprow.hasBeenHarvested == true){

            Assert.assertTrue();
        }
    }











}

















