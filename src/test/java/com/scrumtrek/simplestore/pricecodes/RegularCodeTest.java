package com.scrumtrek.simplestore.pricecodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pugach on 15/03/16.
 */
public class RegularCodeTest {

    public RegularCode regularCode;

    @Before
    public void setUp() {
        regularCode = new RegularCode();
    }

    @Test
    public void getAmountMethodTest() {
        double expected = 3.5;
        double amount = regularCode.getAmount(3);
        assertEquals(expected, amount, 0.001);
    }

    @Test
    public void getBonusMethodTest() {
        int expected = 1;
        int bonus = regularCode.getBonus(5);
        assertEquals(expected, bonus);
    }

}