package com.sample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PrimeNumberTest {
    private final Integer inputNumber;
    private final Boolean expectedResult;
    private PrimeNumberChecker primeNumberChecker;

    @Before
    public void initislizer() {
        primeNumberChecker = new PrimeNumberChecker();
    }
    public PrimeNumberTest(Integer inputNumber,Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult =expectedResult;
    }

   // @Contract(pure = true)
    @Parameterized.Parameters

    public static  Collection primeNumbers() {
        return Arrays.asList(new Object[][] {{2, true},{6,false},{ 23,true}});
    }

    @Test
    public void testPrimeNumberCheker() {
        System.out.println("Parameterized no is: " +inputNumber);
        Assert.assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
    }


}
