package testArrayVariant4;

import arrayVariant4.ArrayVariant4;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.Assert;



public class TestArray{

    private ArrayVariant4 arr = new ArrayVariant4();

    @DataProvider
    public Object[][] fillProvider(){
        double[][] result = {{2d,6d,18d,54d},
                {5d,20d,80d,320d,1280d},
                {2.4d,6d,15d,37.5d}};

        return new Object[][]{{4,2d,3d,result[0]},{5,5d,4d,result[1]},{4,2.4d,2.5d,result[2]}};
    }

    @Test(dataProvider = "fillProvider")
    public void fillArrayTest(int size, double firstElem, double denominator, double[] result){
        Assert.assertEquals(result,arr.fillArray(size,firstElem,denominator));
    }



}