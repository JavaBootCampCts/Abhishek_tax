package com.taxes;

import java.util.List;

public class Tax {
	protected String taxName;
	protected double taxPercent;
	protected List<String> exemptedCategories;

	public Tax(String taxName, double taxPercent,
			List<String> exempetedCategoris) {
		this.taxName = taxName;
		this.taxPercent = taxPercent;
		this.exemptedCategories = exempetedCategoris;
	}

	public String getTaxName() {
		return taxName;
	}

	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}

	public double getTaxPercent() {
		return taxPercent;
	}

	public void setTaxPercent(double taxPercent) {
		this.taxPercent = taxPercent;
	}

	public List<String> getExemptedCategories() {
		return exemptedCategories;
	}

	public void setExemptedCategories(List<String> exemptedCategories) {
		this.exemptedCategories = exemptedCategories;
	}
}
