package com.scrumtrek.simplestore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pugach on 14/03/16.
 */
public class CustomerTest {
    @Test
    public void shouldStatementCalculateCorrectly(){

        String out = "Rental record for Jake\n" +
                "\tMovie43\t2.0\n" +
                "Amount owed is 2.0\n"+
                "You earned 1 frequent renter points.";

        Movie movie = new Movie("Movie43", PriceCodes.Regular);
        Rental rental = new Rental(movie, 1);
        Customer customer = new Customer("Jake");
        customer.addRental(rental);
        assertEquals(customer.Statement(), out);
    }
}