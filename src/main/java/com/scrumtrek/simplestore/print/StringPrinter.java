package com.scrumtrek.simplestore.print;

import com.scrumtrek.simplestore.Movie;
import com.scrumtrek.simplestore.Rental;

import java.util.List;

/**
 * Created by pugach on 15/03/16.
 */
public class StringPrinter extends JournalPrinter {

    /**
     * Выводит журнал ренты в стринг
     * @param rentals - ренты участника
     * @param customerName - имя учатсника
     * @return
     */
    @Override
    public String print(List<Rental> rentals, String customerName) {

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
