package com.scrumtrek.simplestore.print;

import com.scrumtrek.simplestore.Rental;

import java.util.List;

/**
 * Абстрактный класс, отвечающий за вывод данных в нужном формате
 */
public abstract class JournalPrinter {


    public abstract String print(List<Rental> rentals, String customerName);
}
