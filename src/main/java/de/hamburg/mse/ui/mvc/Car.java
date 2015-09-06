package de.hamburg.mse.ui.mvc;

import lombok.Data;

@Data
public class Car {
	String randomId;
	String randomBrand;
	int randomYear;
	String randomColor;
	int randomPrice;
	boolean randomSoldState;

	public Car(String randomId, String randomBrand, int randomYear, String randomColor, int randomPrice,
			boolean randomSoldState) {
		super();
		this.randomId = randomId;
		this.randomBrand = randomBrand;
		this.randomYear = randomYear;
		this.randomColor = randomColor;
		this.randomPrice = randomPrice;
		this.randomSoldState = randomSoldState;
	}

}
