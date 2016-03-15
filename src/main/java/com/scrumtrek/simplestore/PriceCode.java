package com.scrumtrek.simplestore;

/**
 * Created by pugach on 15/03/16.
 */
public abstract class PriceCode {

    String title;
    /**
     *
     * @param daysRented
     * @return
     */
    public abstract double getAmount(int daysRented);

    /**
     *
     * @param daysRented
     * @return
     */
    public abstract double getBonus(int daysRented);

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }
}
