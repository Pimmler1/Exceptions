package task2;

import org.testng.Assert;
import org.testng.annotations.Test;
import task2.StringToInt;
import task3.ElectronicDevice;
import task3.IllegalWattException;

public class Testing {
    @Test
    public void testParseInts1(){
        int[]actual = StringToInt.parseInts("3", "5", "17");
        int[]expected = {3,5,17};
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testParseInts2(){
        int[]actual = StringToInt.parseInts("3", "a", "17");
        int[]expected = {3,0,17};
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testParseInts3(){
        int[]actual = StringToInt.parseInts("3", null, "17");
        int[]expected = {3,0,17};
        Assert.assertEquals(actual, expected);
    }
}
