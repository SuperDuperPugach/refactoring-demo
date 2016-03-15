package com.scrumtrek.simplestore;

import com.scrumtrek.simplestore.print.StringPrinter;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String m_Name;
	private List<Rental> m_Rentals = new ArrayList<Rental>();

	public Customer(String name) {
		m_Name = name;
	}

	public String getName() {
		return m_Name;
	}


	public void addRental(Rental arg){
		m_Rentals.add(arg);
	}

	public String Statement()
	{
		StringPrinter stringPrinter = new StringPrinter(m_Rentals, m_Name);
		return stringPrinter.print();
	}
}

