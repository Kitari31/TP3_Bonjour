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
	
	@Test
	void testExo3() {
		assertEquals(Welcome.welcome("JERRY"),"HELLO, JERRY");
		assertEquals(Welcome.welcome("MARIE"),"HELLO, MARIE");
		assertEquals(Welcome.welcome("BOB"),"HELLO, BOB");
	}

	@Test
	void TestExo4() {
		assertEquals(Welcome.welcome("amy,bob"),"Hello, Amy, Bob");
		assertEquals(Welcome.welcome("marie,damien"),"Hello, Marie, Damien");
	}
	
	@Test
	void TestExo5() {
		assertEquals(Welcome.welcome("amy,bob,julien"),"Hello, Amy, Bob, Julien");
		assertEquals(Welcome.welcome("marie,damien,clement,laura"),"Hello, Marie, Damien, Clement, Laura");
	}
}
