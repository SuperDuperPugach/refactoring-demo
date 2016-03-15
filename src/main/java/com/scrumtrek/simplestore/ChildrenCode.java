package com.scrumtrek.simplestore;

/**
 * Created by pugach on 15/03/16.
 */
public class ChildrenCode extends PriceCode {

    @Override
    public double getAmount(int daysRented) {
        double amount = 1.5;
        if(daysRented > 3) amount = (daysRented-3)*1.5;
        return amount;
    }

    @Override
    public double getBonus(int daysRented) {
        return 1;
    }
}
