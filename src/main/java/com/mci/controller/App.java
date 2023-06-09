package com.mci.controller;

import java.util.List;

import com.mci.model.Locomotive;
import com.mci.model.LocomotiveBuilder;
import com.mci.model.Train;
import com.mci.model.TrainCompany;
import com.mci.model.TrainComponents;
import com.mci.model.Type.LocomotiveType;
import com.mci.model.Type.WagonType;
import com.mci.model.Wagon;
import com.mci.model.WagonBuilder;

public class App {
	public static void main(String[] args) {
		// Locomotive and Wagons
		Locomotive locHead = new LocomotiveBuilder().withManufacturer("ÖBB").withSerialNum("200").withYear(1900)
				.withType(LocomotiveType.DIESEL).build();
		Wagon w1 = new WagonBuilder().withManufacturer("ÖBB").withSerialNum("101").withYear(1910)
				.withType(WagonType.PASSENGER).build();
		Wagon w2 = new WagonBuilder().withManufacturer("ÖBB").withSerialNum("102").withYear(1910)
				.withType(WagonType.CARGO).build();

		// Train
		Train train = new Train(locHead);
		train.add(w1);
		train.add(w2);
		// new Locomotive
		Locomotive loc2 = new LocomotiveBuilder().withManufacturer("ÖBB").withSerialNum("104").withYear(1900)
				.withType(LocomotiveType.DIESEL).build();
		train.add(loc2);

		System.out.println("num of loc :" + train.getCounterOfLocomotive());
		System.out.println("num of wagon :" + train.getCounterOfWagon());
		System.out.println(train.getSize());
		train.removeLast();
		System.out.println("num of loc :" + train.getCounterOfLocomotive());
		System.out.println("num of wagon :" + train.getCounterOfWagon());
		System.out.println(train.getSize());

		System.out.println("num of loc :" + train.getCounterOfLocomotive());
		System.out.println("num of wagon :" + train.getCounterOfWagon());
		System.out.println(train.getSize());
	}
}
