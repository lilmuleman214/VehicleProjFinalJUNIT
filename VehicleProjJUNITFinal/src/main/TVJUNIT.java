package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class TVJUNIT {

	@Test
	public void testOwnership() {
		Person a = new Person();
		Truck t1 = new Truck();
		t1.transferOwnership(a);
		
		Person b = new Person();
		t1.transferOwnership(b);
		
		assertTrue("Owner is Person B", (t1.getOwner() == b));
	}
	
	@Test
	public void testSideCar(){
		MotorCycle m1 = new MotorCycle();
		m1.setHasSideCar(false);
		
		assertFalse("There is no Side Car", m1.hasSideCar);
	}

}
