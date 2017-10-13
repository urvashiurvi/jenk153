package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class mul {

	@Test
	public void test() {
		junit ta=new junit();
		int result =ta.multiply(1,6); 
		assertEquals(6,result);
	}

}
