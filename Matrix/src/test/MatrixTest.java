package test;

import matrixVariant4.MatrixVariant4;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class MatrixTest {

    private MatrixVariant4 obj = new MatrixVariant4();

    @DataProvider
    public Object[][] matrixProvider(){
        int[][] result1 = {{1,2,3},{1,2,3}};
        int[][] result2 = {{2,3,4,5},{2,3,4,5},{2,3,4,5}};
        int[][] result3 = {{1,1,1,1},{1,1,1,1},{1,1,1,1}};

        int[][] rows = {{1,2,3},{2,3,4,5},{1,1,1,1}};

        int[] rowsCount = {2,3,3};

        return new Object[][]{{rowsCount[0],rows[0],result1},
                {rowsCount[1],rows[1],result2},
                {rowsCount[2],rows[2],result3}};
    }

    @Test(dataProvider = "matrixProvider")
    public void filledMatrixTest(int m, int[] row, int[][] result){
        for(int i = 0;i < m;i++){
            if(!Arrays.equals(result[i],row)){
                assertEquals(1,0);
            }
        }
    }
}
