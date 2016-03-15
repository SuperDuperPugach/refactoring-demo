package com.scrumtrek.simplestore.pricecodes;

/**
 * Created by pugach on 15/03/16.
 */
public class NewRealeseCode extends PriceCode {

    /**
     * Возваращет значение цены ренты для текущего прайс кода
     * @param daysRented - число дней ренты
     * @return
     */
    @Override
    public double getAmount(int daysRented) {
        return daysRented*3;
    }

    /**
     * Возвращает число дополнительных очков ренты для текущего прайс кода
     * @param daysRented - число дней ренты
     * @return
     */
    @Override
    public int getBonus(int daysRented) {
        int renterPoints = 1;
        if(daysRented > 1) renterPoints++;
        return renterPoints;
    }
}
