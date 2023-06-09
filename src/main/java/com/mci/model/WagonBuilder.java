package com.mci.model;

import com.mci.model.Type.WagonType;

public class WagonBuilder {
	private Wagon tmpWagon = new Wagon();

	public WagonBuilder withManufacturer(String manufacturer) {
		this.tmpWagon.setManufacturer(manufacturer);
		return this;
	}

	public WagonBuilder withYear(int year) {
		this.tmpWagon.setYear(year);
		return this;
	}

	public WagonBuilder withSerialNum(String serialNum) {
		this.tmpWagon.setSerialNum(serialNum);
		return this;
	}

	public WagonBuilder withType(WagonType type) {
		this.tmpWagon.setType(type);
		return this;
	}

	public Wagon build() {
		return new Wagon(tmpWagon.getManufacturer(), tmpWagon.getSerialNum(), tmpWagon.getYear(), tmpWagon.getType());
	}

}
