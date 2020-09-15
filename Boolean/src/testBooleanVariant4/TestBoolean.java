package testBooleanVariant4;

import BooleanVariant4.BooleanVariant4;


import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.Assert;

public class TestBoolean{

    private BooleanVariant4 obj = new BooleanVariant4();

    @DataProvider
    public Object[][] checkProvider(){
        boolean[] results = {false, false, true, false, true};

        return new Object[][]{{2,3,results[0]},{4,5,results[1]},{3,1,results[2]},{0,0,results[3]},{6,-2,results[4]}};
    }

    @Test(dataProvider = "checkProvider")
    public void checkStatementTest(int a, int b, boolean result){
        Assert.assertEquals(result, obj.checkStatement(a,b));
    }

}
