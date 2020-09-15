package test;

import integerVariant4.IntegerVariant4;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IntegerTest {

    private IntegerVariant4 obj = new IntegerVariant4();

    @DataProvider
    public Object[][] numbersProvider(){
        return new Object[][]{{4,1,4},{5,3,1},{1,1,1},{1,4,0},{4,5,0},{9,3,3}};
    }
    @Test(dataProvider = "numbersProvider")
    public void getSegmentsTest(int a, int b ,int result){
        assertEquals(result,obj.getSegments(a,b));
    }
}
