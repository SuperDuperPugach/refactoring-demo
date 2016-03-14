package com.scrumtrek.simplestore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pugach on 14/03/16.
 */
public class MovieTest {

    @Test
    public void getPriceCodeMethodTest() {
        Movie movie = new Movie("BNL", PriceCodes.NewRelease);

        assertEquals(movie.getPriceCode(), PriceCodes.NewRelease);
    }

    @Test
    public void setPriceCodeMethodTest() {
        Movie movie = new Movie("BNL", PriceCodes.NewRelease);
        movie.setPriceCode(PriceCodes.Childrens);

        assertEquals(movie.getPriceCode(), PriceCodes.Childrens);
    }

    @Test
    public void getTitleCodeMethodTest() {
        Movie movie = new Movie("BNL", PriceCodes.NewRelease);

        assertEquals(movie.getTitle(), "BNL");
    }

}