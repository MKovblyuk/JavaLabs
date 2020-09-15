package testCaseVariant4;

import caseVariant4.CaseVariant4;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class TestCase{

    private CaseVariant4 obj = new CaseVariant4();

    @DataProvider
    public Object[][] daysProvider(){
        return new Object[][]{{1,31},{4,30},{5,31},{6,30},{11,30}};
    }

    @Test(dataProvider = "daysProvider")
    public void getMonthDaysCountTest(int monthNumber, int daysCount){
        Assert.assertEquals(daysCount,obj.getMonthDaysCount(monthNumber));
    }
}
