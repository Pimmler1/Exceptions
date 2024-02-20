import org.testng.Assert;
import org.testng.annotations.Test;
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
    @Test
    public void testSetPower(){
        String exceptionMessage = null;
        try{
            ElectronicDevice ed = new ElectronicDevice();
            ed.setPower(-50);
        }catch(IllegalWattException e){
           exceptionMessage=e.getMessage();
        }
        Assert.assertEquals(exceptionMessage, "power can not be negative!");
    }
    @Test(expectedExceptions = IllegalWattException.class)
    public void testSetPower2(){
        ElectronicDevice ed = new ElectronicDevice();
        ed.setPower(-50);
    }
}
