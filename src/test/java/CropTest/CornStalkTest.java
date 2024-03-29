package CropTest;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test

    @Test
    public void testInheritance(){
        CornStalk cornStalk = new CornStalk();
        Assert.assertTrue(cornStalk instanceof Crop);
    }
}
