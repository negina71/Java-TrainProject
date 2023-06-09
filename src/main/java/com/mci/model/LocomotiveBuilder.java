package com.mci.model;

import com.mci.model.Type.LocomotiveType;

public class LocomotiveBuilder {
	private Locomotive tmpLoc = new Locomotive();

	public LocomotiveBuilder withManufacturer(String manufacturer) {
		this.tmpLoc.setManufacturer(manufacturer);
		return this;
	}

	public LocomotiveBuilder withYear(int year) {
		this.tmpLoc.setYear(year);
		return this;
	}

	public LocomotiveBuilder withSerialNum(String serialNum) {
		this.tmpLoc.setSerialNum(serialNum);
		return this;
	}

	public LocomotiveBuilder withType(LocomotiveType type) {
		this.tmpLoc.setType(type);
		return this;
	}

	public Locomotive build() {
		return new Locomotive(tmpLoc.getManufacturer(), tmpLoc.getSerialNum(), tmpLoc.getYear(), tmpLoc.getType());
	}
}
