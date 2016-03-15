package com.scrumtrek.simplestore.pricecodes;

/**
 * Created by pugach on 15/03/16.
 */

/**
 * Абстрактный класс, представляющий логику вычисления цены и очков ренты по числу дней ренты
 */
public abstract class PriceCode {

    /**
     * Возваращет значение цены ренты для текущего прайс кода
     * @param daysRented - число дней ренты
     * @return
     */
    public abstract double getAmount(int daysRented);

    /**
     * Возвращает число дополнительных очков ренты для текущего прайс кода
     * @param daysRented - число дней ренты
     * @return
     */
    public abstract int getBonus(int daysRented);

}
