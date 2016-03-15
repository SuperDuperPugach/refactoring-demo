package com.scrumtrek.simplestore.pricecodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pugach on 15/03/16.
 */
public class NewRealeseCodeTest {

    public NewRealeseCode newRealeseCode;

    @Before
    public void setUp() {
        newRealeseCode = new NewRealeseCode();
    }

    @Test
    public void getAmountMethodTest() {
        double expected = 15;
        double amount = newRealeseCode.getAmount(5);
        assertEquals(expected, amount, 0.001);
    }

    @Test
    public void getBonusMethodTest() {
        int expected = 2;
        int bonus = newRealeseCode.getBonus(5);
        assertEquals(expected, bonus);
    }

}