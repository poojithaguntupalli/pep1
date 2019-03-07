package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class sampletest {

	@Test
	public void Addtest() {
		//fail("Not yet implemented");
		sampleproject junit=new sampleproject();
		int result=junit.add(100,200);
		assertEquals(300,result);
	}

}
