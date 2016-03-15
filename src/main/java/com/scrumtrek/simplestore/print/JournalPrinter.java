package com.scrumtrek.simplestore.print;

import com.scrumtrek.simplestore.Rental;

import java.util.List;

/**
 * Created by pugach on 15/03/16.
 */
public abstract class JournalPrinter {
    public List<Rental> rentals;
    public String customerName;

    public JournalPrinter(List<Rental> rentals, String customerName) {
        this.rentals = rentals;
        this.customerName = customerName;
    }

    public abstract String print();
}
