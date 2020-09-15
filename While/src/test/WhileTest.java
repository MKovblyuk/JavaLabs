package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import whileVariant4.WhileVariant4;

import static org.testng.Assert.assertEquals;

public class WhileTest {
    private WhileVariant4 obj = new WhileVariant4();

    @DataProvider
    public Object[][] numberProvider(){
        return new Object[][]{{1,true},{2,false},{6,false},{9,true},{18,false},{81,true}};
    }

    @Test(dataProvider = "numberProvider")
    public void checkPowerTest(int n, boolean result){
        assertEquals(result,obj.checkPower(n));
    }

}
