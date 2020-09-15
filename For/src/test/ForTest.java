package test;


import forVariant4.ForVariant4;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForTest {

    private ForVariant4 obj = new ForVariant4();

    public static double EPS = 0.00000001;

    @DataProvider
    public Object[][] priseProvider(){
        double[][] results = {{1,2,3,4,5,6,7,8,9,10},
                {2.6,5.2,7.8,10.4,13,15.6,18.2,20.8,23.4,26},
                {4.5,9,13.5,18,22.5,27,31.5,36,40.5,45},
                {5,10,15,20,25,30,35,40,45,50}};

        return new Object[][]{{1,results[0]},{2.6,results[1]},{4.5,results[2]},{5,results[3]}};
    }

    @Test(dataProvider = "priseProvider")
    public void getPrisesTest(double prise,double[] result){
        double[] actual = obj.getPrises(prise);

        for(int i = 0;i < 10;i++){
            if(Math.abs(result[i] - actual[i]) > EPS)
                assertEquals(1,0);
        }
    }
}
