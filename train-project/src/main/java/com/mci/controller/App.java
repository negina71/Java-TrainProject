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

	Locomotive locHead=new LocomotiveBuilder().withManufacturer("ÖBB").withSerialNum("100").withYear(1900).withType(LocomotiveType.DIESEL).build();
	}
}