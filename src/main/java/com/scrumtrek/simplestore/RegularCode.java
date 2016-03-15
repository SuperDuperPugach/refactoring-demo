package com.scrumtrek.simplestore;

/**
 * Created by pugach on 15/03/16.
 */
public class RegularCode extends PriceCode {

    @Override
    public double getAmount(int daysRented) {
        double amount = 2;
        if (daysRented > 2) amount += (daysRented-2)*1.5;
        return amount;
    }

    @Override
    public double getBonus(int daysRented) {
        return 1;
    }
}
