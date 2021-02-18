package string.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import string.String;

class StringTest {

	@Test
	void test() {
		String myString = String.valueOf('A');
		char[] myChars = myString.toCharArray();

		assertArrayEquals(new char[] {'A'}, myChars);
		
		myChars[0] = 'B';
		
		assertEquals('A', myString.charAt(0));
		//assertEquals('B', myString.charAt(0));
		assertNotEquals('B', myString.charAt(0));
		
		String hi = String.valueOf('h').concat(String.valueOf('i'));
		char[] hiChars = hi.toCharArray();
		
		assertArrayEquals(new char[] {'h', 'i'}, hiChars);		
		
		/*String hi2 = new String(hiChars); // als String public staat
		assertArrayEquals(new char[] {'h','i'}, hi2.toCharArray());
		
		hiChars[0] = 'b';
		assertArrayEquals(new char[] {'h','i'}, hi2.toCharArray()); */
		//REPRESENTATION EXPOSURE
		
		
		
	}
}