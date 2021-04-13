package testNGExample;

import org.testng.annotations.Test;

public class TestNGExample1 {

	
	
	
	

@Test(enabled=true)
	public void a() {
		System.out.println("10th");
	}

@Test(priority = 2)
	public void b() {
		System.out.println("+2");
	}
	

@Test( priority =  1)
public void c() {
	System.out.println("college");
}

	
}
