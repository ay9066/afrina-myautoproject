package mct.cuck.stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook_steps extends Base_steps {
	
	@Before
	public void rampUp() {
		System.out.println("Ramp Up Started...........");
		
	}
	
	@After
	public void rampDown() {
		driver.close();
	}
	
}
