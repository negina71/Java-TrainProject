package com.mci.model;

public class Locomotive extends TrainComponents {

	private Type.LocomotiveType type;
	private final double MIN_WEIGHT;
	private final double MAX_WEIGHT = 40000;
	private final double LENGHT = 10;
	private double current_weight;

	public Locomotive(String manufacturer, String serialNum, int year, Type.LocomotiveType type) {
		super(manufacturer, serialNum, year);
		this.type = type;
		if (type.equals(Type.LocomotiveType.DIESEL)) {
			this.MIN_WEIGHT = 25000;
		} else {
			this.MIN_WEIGHT = 15000;
		}
	}

	public Locomotive() {
		this.MIN_WEIGHT = 0;
	}

	public Type.LocomotiveType getType() {
		return this.type;
	}

	public void setType(Type.LocomotiveType type) {
		this.type = type;
	}

	public double getMax_weight() {
		return 40000;
	}

	public double getMIN_WEIGHT() {
		return this.MIN_WEIGHT;
	}

	

	public String toString() {
		return "Locomotive [type=" + this.type + ", MIN_WEIGHT=" + this.MIN_WEIGHT + ", max_weight=" + 40000.0D
				+ ", LENGHT=" + 10.0D + ", current_weight=" + this.current_weight + ", getYear()=" + getYear()
				+ ", getManufacturer()=" + getManufacturer() + ", getSerialNum()=" + getSerialNum() + ", getNext()="
				+ getNext() + ", getPrev()=" + getPrev() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public double getCurrentWeight() {
	
		return  this.current_weight + getMIN_WEIGHT();
	}

	@Override
	public double getCurrentLenght() {
		
		return this.LENGHT;
	}
}
