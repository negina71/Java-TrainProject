package com.mci.model;

public class Train {

	private TrainComponents head = null;
	private TrainComponents tail = null;
	private int size = 0;
	private int counterOfWagon = 0;
	private int counterOfLocomotive;
	private boolean active = false;
	private double lenght = 0;

	public Train(Locomotive locomotive) {
		this.head = locomotive;
		this.tail = locomotive;
		this.size++;
		this.active = true;
		this.counterOfLocomotive = 1;
	}

	public boolean isReady() {
		return this.active;
	}

	public int getCounterOfWagon() {
		return this.counterOfWagon;
	}

	public int getCounterOfLocomotive() {

		return this.counterOfLocomotive;
	}

	public void add(TrainComponents component) {
		if (head == null) {
			head = (Locomotive) component;
			tail = (Locomotive) component;
		} else {
			tail.setNext(component);
			tail = component;
		}
		if (component instanceof Wagon) {
			counterOfWagon++;
		}
		if (component instanceof Locomotive) {
			counterOfLocomotive++;
		}
		size++;
	}

	public void removeLast() {
		if (head == tail) {
			head = null;
			tail = null;
		} else {
			TrainComponents current = head;
			while (current.getNext() != tail) {
				current = current.getNext();
			}
			current.setNext(null);
			tail = current;
			if(tail instanceof Locomotive ) {
				counterOfLocomotive--;
			}
			else {
				counterOfWagon--;
			}
		}
		size--;
	}

	public int getSize() {
		return this.size;
	}

	public double getTotalTrainWeight() {
		double weight = 0;
		TrainComponents current = head;
		while (current != null) {
			if (current instanceof Wagon) {
				weight += current.getCurrentWeight();
			} else {
				weight += current.getCurrentWeight();
			}
			this.lenght += current.getCurrentLenght();
			current = current.getNext();
		}
		return weight;
	}

	private void initLenght() {
		TrainComponents current = head;
		while (current != null) {
			this.lenght += current.getCurrentLenght();
			current = current.getNext();
		}
	}

	public TrainComponents getHead() {
		return head;
	}

	public TrainComponents getTail() {
		return tail;
	}

	public double getTotalTrainLenght() {
		initLenght();
		return this.lenght;
	}

	public String getSerialNum() {
		return getHead().getSerialNum();
	}

	@Override
	public String toString() {
		return "Train [head=" + head + ", tail=" + tail + ", size=" + size + ", counterOfWagon=" + counterOfWagon
				+ ", active=" + active + ", lenght=" + lenght + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
