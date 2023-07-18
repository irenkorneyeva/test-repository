import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber(){
        int expected = 14;
        int returned = getLocalNumber();

        Assert.assertTrue("Returned value is not 14 !",expected == returned);
    }

}
