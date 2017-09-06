package com.calculations;

import java.util.Iterator;
import java.util.List;

import com.itenarary.Good;
import com.taxes.Tax;

public class TaxCalculator {
	public double calculateTotalTax(List<Good> goodsList, List<Tax> taxList) {
		double totalTax = 0;
		Iterator<Good> goodsIterator = goodsList.iterator();
		while (goodsIterator.hasNext()) {
			Good currentItem = goodsIterator.next();
			Iterator<Tax> taxIterator = taxList.iterator();
			while (taxIterator.hasNext()) {
				Tax currentTax = taxIterator.next();
				boolean exempt = false;
				if (currentTax.getExemptedCategories().contains(
						currentItem.getCategory())) {
					exempt = true;
				}
				if (!exempt) {
					totalTax += currentItem.getPrice()
							* currentTax.getTaxPercent() / 100;
				}
			}
		}

		return totalTax;
	}
}
