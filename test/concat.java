package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class concat {

	@Test
	public void test() {
		junit ta=new junit();
		String result =ta.concate("a","b"); 
		assertEquals("ab","results");
	}

}
