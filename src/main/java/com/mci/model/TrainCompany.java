package com.mci.model;

import java.util.ArrayList;
import java.util.List;

public class TrainCompany {
	private String name;
	private List<Train> trains = new ArrayList<>();

	public TrainCompany(String name) {

		this.name = name;

	}

	@Override
	public String toString() {
		return "TrainCompany [name=" + name + ", trains=" + trains + "]";
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void addTrain(Train train) {
		trains.add(train);

	};

	public void removeTrain(String serialNum) {

		for (int i=0;i<=getTrains().size();i++) {
			
			if (getTrains().get(i).getSerialNum().equalsIgnoreCase(serialNum)) {
			trains.remove(i);
				
			}
			
		}
	}
}
