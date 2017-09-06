package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.calculations.TaxCalculator;
import com.itenarary.Good;
import com.taxes.Tax;

public class MyTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Good> goodList = new ArrayList<Good>();
		goodList.add(new Good("paracetamol", "medical", 120.65));
		goodList.add(new Good("notebook", "stationary", 35));
		goodList.add(new Good("pizza", "food", 350));
		goodList.add(new Good("old monk", "alchohol", 1000));

		List<Tax> taxList = new ArrayList<Tax>();
		taxList.add(new Tax("basic tax", 5.5, Arrays.asList("medical")));
		taxList.add(new Tax("import tax", 10, Arrays.asList("medical", "food")));

		double totalTax = new TaxCalculator().calculateTotalTax(goodList,
				taxList);
		System.out.println("toal tax is:" + totalTax);
	}
}
