package test;


import ifVariant4.IfVariant4;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IfTest {
    private IfVariant4 obj = new IfVariant4();

    @DataProvider
    public Object[][] numbersProvider(){
        return new Object[][]{{2,0,-2,1},{1,1,1,3},{0,0,0,0},{-1,-2,-3,0},{2,3,0,2},{0,0,6,1}};
    }
    @Test(dataProvider = "numbersProvider")
    public void getPositiveTest(int a,int b,int c,int result){
        assertEquals(result,obj.getCountPositive(a,b,c));
    }
}
