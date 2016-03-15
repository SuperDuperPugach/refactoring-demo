package com.scrumtrek.simplestore.pricecodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pugach on 15/03/16.
 */
public class ChildrenCodeTest {
    public ChildrenCode childrenCode;

    @Before
    public void setUp() {
        childrenCode = new ChildrenCode();
    }

    @Test
    public void getAmountMethodTest() {
        double expected = 3.;
        double amount = childrenCode.getAmount(5);
        assertEquals(expected, amount, 0.001);
    }

    @Test
    public void getBonusMethodTest() {
        int expected = 1;
        int bonus = childrenCode.getBonus(5);
        assertEquals(expected, bonus);
    }


}