package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void testExo1() {
		assertEquals(Welcome.welcome("bob"),"Hello, Bob");
		assertEquals(Welcome.welcome("marie"),"Hello, Marie");
		assertEquals(Welcome.welcome("julien"),"Hello, Julien");
	}
	
	@Test
	void testExo2() {
		assertEquals(Welcome.welcome(null),"Hello, my friend");
		assertEquals(Welcome.welcome("     "),"Hello, my friend");
	}

}
