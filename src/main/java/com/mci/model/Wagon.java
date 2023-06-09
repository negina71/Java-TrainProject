package com.mci.model;

public class Wagon extends TrainComponents {

	private int counterOfPassengers;
	private final int MAX_CAPACITY;
	private Type.WagonType type;
	private final double MIN_WEIGHT;
	private double current_weight;
	private final double LENGHT;

	public Wagon(String manufacturer, String serialNum, int year, Type.WagonType type) {
		super(manufacturer, serialNum, year);
		this.type = type;
		if (type.equals(Type.WagonType.PASSENGER)) {
			this.counterOfPassengers = 0;
			this.MIN_WEIGHT = 20000;
			this.LENGHT = 20;
			this.MAX_CAPACITY = 40;
		} else {
			this.MIN_WEIGHT = 25000;
			this.LENGHT = 15;
			this.MAX_CAPACITY = 50000;
		}
	}

	public Wagon() {
		this.MIN_WEIGHT = 25000;
		this.LENGHT = 15;
		this.MAX_CAPACITY = 50000;
	}

	public int getPassengers() {
		return this.counterOfPassengers;
	}

	public void addPassanger() throws IllegalArgumentException {
		if (getType().equals(Type.WagonType.PASSENGER)) {
			if (getMAX_CAPACITY() >= getPassengers()) {
				this.counterOfPassengers++;
			} else {
				throw new IllegalArgumentException("PASSENGER Capacity has already reached the maximum value.");
			}
		} else {
			throw new IllegalArgumentException(
					"addPassanger method is only for PassangerWagon, you should use addCargo.");
		}
	}

	public double getCurrentCapacity() {
		double result = 0;
		if (getType().equals(Type.WagonType.PASSENGER)) {
			result = (getMAX_CAPACITY() - getPassengers());
		} else {
			result = getMAX_CAPACITY() - getCurrentWeight();
		}
		return result;
	}

	public void addCargo(double weight) {
		if (getType().equals(Type.WagonType.CARGO)) {
			double curentCapacity = getMAX_CAPACITY() - getCurrentWeight();
			if (curentCapacity >= weight) {
				set_weight(weight);
			} else {
				throw new IllegalArgumentException("Cargo Capacity has already reached the maximum value.");
			}
		} else {
			throw new IllegalArgumentException("addCargo method is only for CargoWagon, you should use addPassenger.");
		}
	}

	public void setType(Type.WagonType type) {
		this.type = type;
	}

	public Type.WagonType getType() {
		return this.type;
	}

	public void set_weight(double weight) {
		this.current_weight += weight;
	}

	public int getMAX_CAPACITY() {
		return this.MAX_CAPACITY;
	}

	public double getMIN_WEIGHT() {
		return this.MIN_WEIGHT;
	}

	public String toString() {
		return "Wagon [counterOfPassengers=" + this.counterOfPassengers + ", MAX_CAPACITY=" + this.MAX_CAPACITY
				+ ", type=" + this.type + ", MIN_WEIGHT=" + this.MIN_WEIGHT + ", current_weight=" + this.current_weight
				+ ", LENGHT=" + this.LENGHT + ", getYear()=" + getYear() + ", getManufacturer()=" + getManufacturer()
				+ ", getSerialNum()=" + getSerialNum() + ", getNext()=" + getNext() + ", getPrev()=" + getPrev()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public double getCurrentWeight() {
		return this.current_weight + getMIN_WEIGHT();

	}

	@Override
	public double getCurrentLenght() {
		return  this.LENGHT;
	}
}
