package com.mci;

import static org.junit.Assert.assertArrayEquals;
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
 * Unit test for simple App.
 */
public class AppTest {
		Locomotive locomotiveHead = new LocomotiveBuilder().withManufacturer("Siemens").withYear(2020).withSerialNum("101").withYear(1900).withType(LocomotiveType.DIESEL).build();
		Train train = new Train(locomotiveHead);
		
		Wagon wagon1 = new WagonBuilder().withSerialNum("10").withManufacturer("Siemens").withYear(2020).withType(WagonType.PASSENGER).build();
		Wagon wagon2 = new WagonBuilder().withSerialNum("20").withManufacturer("Siemens").withYear(2020).withType(WagonType.PASSENGER).build();
		Wagon wagon3 = new WagonBuilder().withSerialNum("30").withManufacturer("Siemens").withYear(2020).withType(WagonType.PASSENGER).build();
		Wagon wagon4 = new WagonBuilder().withSerialNum("40").withManufacturer("Siemens").withYear(2020).withType(WagonType.PASSENGER).build();
		Wagon cargo = new WagonBuilder().withSerialNum("50").withManufacturer("Siemens").withYear(2020).withType(WagonType.CARGO).build();
		TrainComponents locomotiveTail=new LocomotiveBuilder().withYear(2020).withType(LocomotiveType.DIESEL).build();
		
	@Test
	public void testGetCounterOfWagon() {
		Train TrainTest=train;
		TrainTest.add(wagon1);
		TrainTest.add(wagon1);
		TrainTest.add(cargo);
		assertEquals(TrainTest.getCounterOfWagon(),3);
	}
		
	@Test
	public void trainIsReady() {
		Train TrainTest=train;
		TrainTest.add(wagon1);
		TrainTest.add(cargo);
		assertTrue(TrainTest.isReady());
	}
	
	
	@Test
	public void testgetCounterOfLocomotive() {
		Train TrainTest=train;
		TrainTest.add(wagon1);
		TrainTest.add(wagon1);
		TrainTest.add(cargo);
		assertEquals(TrainTest.getCounterOfLocomotive(),1);
	}
	
	@Test
	public void TestTrainSize() {
		Train TrainSize=train;
		TrainSize.add(wagon1);
		TrainSize.add(wagon2);
		TrainSize.add(cargo);
		assertEquals(TrainSize.getSize(), 4);
	}
	
	
	@Test
	public void testGetTotalTrainWeight() {
		Train TrainSize=train;
		TrainSize.add(wagon1);
		TrainSize.add(wagon2);
		
		assertEquals(TrainSize.getTotalTrainWeight(),65000,0.001);
	}
	
	@Test
	public void TestTrainLenght() {
		Train TrainLenght=train;
		TrainLenght.add(wagon1);
		TrainLenght.add(wagon2);
		assertEquals((int)TrainLenght.getTotalTrainLenght(), 50);
	}
}
