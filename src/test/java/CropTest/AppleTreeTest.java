package CropTest;
import org.junit.Assert;
import org.junit.Test;

public class AppleTreeTest {

    @Test

    @Test
    public void testInheritance(){
        AppleTree appleTree = new AppleTree();
        Assert.assertTrue(appleTree instanceof Crop);
    }
}
