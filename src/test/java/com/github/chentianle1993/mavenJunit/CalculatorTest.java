/**
 * 
 */
package com.github.chentianle1993.mavenJunit;

import junit.framework.TestCase;

/**
 * @author chentianle
 *
 */
public class CalculatorTest extends TestCase {

	/**
	 * @param name
	 */
	public CalculatorTest(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link com.github.chentianle1993.mavenJunit.Calculator#add(int, int)}.
	 */
	public final void testAdd() {
		//fail("Not yet implemented"); // TODO
		assertEquals(6, new Calculator().add(3, 3));
	}

}
