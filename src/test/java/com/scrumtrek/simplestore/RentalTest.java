package com.scrumtrek.simplestore;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;

/**
 * Created by pugach on 14/03/16.
 */
public class RentalTest {

    private Rental rental;
    private int daysRented;

    @Before
    public void setUp() {
        daysRented = 5;
        rental = new Rental(mock(Movie.class), daysRented);
    }


    @Test
    public void getDaysRentedMethodTest() throws Exception {
        assertEquals(rental.getDaysRented(), daysRented);
    }


    @Test
    public void getMovieMethodTest() throws Exception {
        assertTrue(rental.getMovie() instanceof Movie);
    }
}