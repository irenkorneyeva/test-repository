import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassNumber(){
        int returned = getClassNumber();
        Assert.assertTrue("Returned value is less than 45 !",returned > 45);
    }

}
