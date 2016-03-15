package com.scrumtrek.simplestore;

/**
 * Created by pugach on 15/03/16.
 */
public class NewRealeseCode extends PriceCode {

    @Override
    public double getAmount(int daysRented) {
        return daysRented*3;
    }

    @Override
    public double getBonus(int daysRented) {
        int renterPoints = 1;
        if(daysRented > 1) renterPoints++;
        return renterPoints;
    }
}
