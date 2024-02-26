package task3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing {
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
