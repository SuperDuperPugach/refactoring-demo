package com.scrumtrek.simplestore.pricecodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pugach on 15/03/16.
 */
public class XXXCodeTest {

    public XXXCode xxxCode;

    @Before
    public void setUp() {
        xxxCode = new XXXCode();
    }

    @Test
    public void getAmountMethodTest() {
        double expected = 3.5;
        double amount = xxxCode.getAmount(3);
        assertEquals(expected, amount, 0.001);
    }

    @Test
    public void getBonusMethodTest() {
        int expected = 1;
        int bonus = xxxCode.getBonus(5);
        assertEquals(expected, bonus);
    }

}