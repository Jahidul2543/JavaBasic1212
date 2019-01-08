package unit.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindMonthlyCostsTest {

    @Test
    public void costCalculatorTest(){

        FindMonthlyCosts obj = new FindMonthlyCosts();

        int actualExpenses = obj.costCalculator(500, 500, 500);

        System.out.println("ActualExpenses" + actualExpenses);

        // Test Data
        int expectedExpenses = 1500;

        /**
         *
         * Let us bring a system to compare Expected and Actual values automatically.
         * Once compared if comparison is correct it should tell us test passed or method is working properly
         * If not it should tell Test Failed or method/unit of the application is not working properly
         *
         * In order to do above action we will use Testing Framework called TestNG
         */

        Assert.assertEquals(actualExpenses, expectedExpenses);

        System.out.println("*********Test Passed*********");


    }
}
