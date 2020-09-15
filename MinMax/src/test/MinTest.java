package test;

import minMaxVariant4.MinMaxVariant4;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MinTest {

    private MinMaxVariant4 obj = new MinMaxVariant4();

    @DataProvider
    public Object[][] arrayProvider(){
        int[][] arrays = {{2,4,5,63,9},
                {3,4,5,3,5},
                {-3,4,-4,0,4},
                {1,1,1,1,1}};

        int[] result = {1,1,3,1};
        return new Object[][]{{arrays[0],result[0]},
                {arrays[1],result[1]},
                {arrays[2],result[2]},
                {arrays[3],result[3]}};
    }

    @Test(dataProvider = "arrayProvider")
    public void minNumberTest(int[] array, int result){
        assertEquals(result,obj.getNumberOfMin(array));
    }
}
