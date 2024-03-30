package PersonTest;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class FarmerTest {
    Farmer farmer;
    CropRow cropRow;

    @Before
    public void setup(){
        farmer = new Farmer();
        cropRow = new Croprow();
    }
    @Test
    public void testInheritance() {
        Assert.assertTrue(farmer != null);
    }
    @Test
    public void harvestTest(){
        Boolean isHarvested = cropRow.beenHarvested();
        farmer.harvest();
        Assert.assertTrue(isHarvested);
    }
}
//