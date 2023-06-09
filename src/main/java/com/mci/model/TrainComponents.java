package com.mci.model;

public abstract class TrainComponents implements TrainInterface {

	private int year;
	private String manufacturer;
	private String serialNum;
	private TrainComponents next = null;
	private TrainComponents prev = null;

	public TrainComponents(String manufacturer, String serialNum, int year) {
		this.manufacturer = manufacturer;
		this.serialNum = serialNum;
		this.year = year;
	}

	public TrainComponents() {
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getSerialNum() {
		return this.serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public TrainComponents getNext() {
		return this.next;
	}

	public void setNext(TrainComponents next) {
		this.next = next;
	}

	public TrainComponents getPrev() {
		return this.prev;
	}

	public void setPrev(TrainComponents prev) {
		this.prev = prev;
	}
}
