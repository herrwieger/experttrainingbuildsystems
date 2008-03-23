package de.softwareexperts;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {
	public void testHelloWorld() {
		HelloWorld o = new HelloWorld();
		assertEquals("Hello World", o.toString());
	}

}
