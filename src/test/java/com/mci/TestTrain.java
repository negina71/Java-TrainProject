package com.mci;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mci.model.Locomotive;
import com.mci.model.LocomotiveBuilder;
import com.mci.model.Train;
import com.mci.model.TrainComponents;
import com.mci.model.Wagon;
import com.mci.model.WagonBuilder;
import com.mci.model.Type.LocomotiveType;
import com.mci.model.Type.WagonType;

/**
 * Unit test for Train.
 */
public class TestTrain {
		Locomotive locomotiveHead = new LocomotiveBuilder().withManufacturer("Siemens").withYear(2020).withSerialNum("101").withYear(1900).withType(LocomotiveType.DIESEL).build();
		Train train = new Train(locomotiveHead);
		
		Wagon wagon1 = new WagonBuilder().withSerialNum("10").withManufacturer("Siemens").withYear(2020).withType(WagonType.PASSENGER).build();
		Wagon wagon2 = new WagonBuilder().withSerialNum("20").withManufacturer("Siemens").withYear(2020).withType(WagonType.PASSENGER).build();
		Wagon wagon3 = new WagonBuilder().withSerialNum("30").withManufacturer("Siemens").withYear(2020).withType(WagonType.PASSENGER).build();
		Wagon wagon4 = new WagonBuilder().withSerialNum("40").withManufacturer("Siemens").withYear(2020).withType(WagonType.PASSENGER).build();
		Wagon cargo = new WagonBuilder().withSerialNum("50").withManufacturer("Siemens").withYear(2020).withType(WagonType.CARGO).build();
		TrainComponents locomotiveTail=new LocomotiveBuilder().withYear(2020).withType(LocomotiveType.DIESEL).build();
		
	@Test
	public void testTrainGetCounterOfWagon() {
		Train trainTest=train;
		trainTest.add(wagon1);
		trainTest.add(wagon1);
		trainTest.add(cargo);
		assertEquals(trainTest.getCounterOfWagon(),3);
	}
		
	@Test
	public void testTrainIsReady() {
		Train trainTest=train;
		trainTest.add(wagon1);
		trainTest.add(cargo);
		assertTrue(trainTest.isReady());
	}
	
	
	@Test
	public void testTrainGetCounterOfLocomotive() {
		Train trainTest=train;
		trainTest.add(wagon1);
		trainTest.add(wagon1);
		trainTest.add(cargo);
		assertEquals(trainTest.getCounterOfLocomotive(),1);
	}
	
	@Test
	public void testTrainSize() {
		Train trainSize=train;
		trainSize.add(wagon1);
		trainSize.add(wagon2);
		trainSize.add(cargo);
		assertEquals(trainSize.getSize(), 4);
	}
	
	
	@Test
	public void testTrainGetTotalTrainWeight() {
		Train trainTest=train;
		trainTest.add(wagon1);
		trainTest.add(wagon2);
		
		assertEquals(trainTest.getTotalTrainWeight(),65000,0.001);
	}
	
	@Test
	public void testTrainLenght() {
		Train trainLenght=train;
		trainLenght.add(wagon1);
		trainLenght.add(wagon2);
		assertEquals((int)trainLenght.getTotalTrainLenght(), 50);
	}
	
	@Test
	public void testTrainAdd() {
		Train trainTest=train;
		trainTest.add(wagon1);
		trainTest.add(wagon2);
		assertEquals(trainTest.getElements().size(),3);
	}
	@Test
	public void TestTrainRemoveLast() {
		Train trainTest=train;
		trainTest.add(wagon1);
		trainTest.add(wagon2);
		trainTest.removeLast();
		assertEquals(trainTest.getSize(),2);
	}
}
