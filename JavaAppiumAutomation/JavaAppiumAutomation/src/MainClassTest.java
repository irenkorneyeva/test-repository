import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassString(){
        String returned = getClassString();
        boolean match1 = returned.contains("Hello");
        boolean match2 = returned.contains("hello");

        if (!match1 && !match2) {
            throw new AssertionError("There is no such substring in the string");
        } else {
            System.out.println("There is such substring in the string");
        }
    }

}
