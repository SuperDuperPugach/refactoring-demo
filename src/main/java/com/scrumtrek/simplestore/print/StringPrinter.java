package com.scrumtrek.simplestore.print;

import com.scrumtrek.simplestore.Movie;
import com.scrumtrek.simplestore.Rental;

import java.util.List;

/**
 * Created by pugach on 15/03/16.
 */
public class StringPrinter extends JournalPrinter {


    public StringPrinter(List<Rental> rentals, String customerName) {
        super(rentals, customerName);
    }

    @Override
    public String print() {

        double totalAmount = 0;
        int frequentRenterPoints = 0;

        String result = "Rental record for " + customerName + "\n";

        for(Rental rental: rentals) {
            double thisAmount = 0;
            for (Movie movie : rental.getMovies().keySet()) {
                int days = rental.getMovies().get(movie);
                thisAmount += movie.getPriceCode().getAmount(days);
                frequentRenterPoints +=  movie.getPriceCode().getBonus(days);
                // Show figures for this rental
                result += "\t" + movie.getTitle() + "\t" + thisAmount + "\n";
                totalAmount += thisAmount;
            }


        }

        // Add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points.";
        return result;
    }
}
