package com.scrumtrek.simplestore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pugach on 14/03/16.
 */
public class CustomerTest {
    @Test
    public void shouldStatementCalculateOneMovieCorrectly(){

        String out = "Rental record for Jake\n" +
                "\tMovie43\t3.5\n" +
                "Amount owed is 3.5\n"+
                "You earned 1 frequent renter points.";

        Movie movie = new Movie("Movie43", new RegularCode());
        Rental rental = new Rental(movie, 3);
        Customer customer = new Customer("Jake");
        customer.addRental(rental);
        assertEquals(customer.Statement(), out);
    }

    @Test
    public void shouldStatementCalculateTwoMovieCorrectly(){

        String out = "Rental record for Jake\n" +
                "\tMovie43\t9.0\n" +
                "\tAladdin\t1.5\n" +
                "Amount owed is 10.5\n"+
                "You earned 3 frequent renter points.";

        Movie movie = new Movie("Movie43", new NewRealeseCode());
        Movie movie2 = new Movie("Aladdin", new ChildrenCode());
        Rental rental = new Rental(movie, 3);
        Rental rental2 = new Rental(movie2,4);
        Customer customer = new Customer("Jake");
        customer.addRental(rental);
        customer.addRental(rental2);
        assertEquals(customer.Statement(), out);
    }

    @Test
    public void shouldStatementCalculateRegularyMovieCorrectly(){

        String out = "Rental record for Jake\n" +
                "\tMovie43\t2.0\n" +
                "Amount owed is 2.0\n"+
                "You earned 1 frequent renter points.";

        Movie movie = new Movie("Movie43", new RegularCode());
        Rental rental = new Rental(movie, 1);
        Customer customer = new Customer("Jake");
        customer.addRental(rental);
        assertEquals(customer.Statement(), out);
    }
}