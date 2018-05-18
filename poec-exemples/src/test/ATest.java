package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ATest {

/*	@Test
	void test() {
		fail("Not yet implemented");
	}*/
	@ParameterizedTest
	@CsvSource({"black, #000000", "white, #FFFFFF", "red, #FF0000"})
	public void shouldGenerateHexValueForColor(
			String colorName,
			String expectedHexValue) {
		A a = new A();
		String actualResult = a.getHexColor(colorName);
		assertEquals(expectedHexValue, actualResult, "should be #000000 ");
	}
	
	
	
	/*@Test
	public void shouldGenrateFFFFFFWhenBlackColor() {
		//fail("Not yet implemented");
		String name = "black";
		
		A a = new A();
		String result = a.getHexColor(name);
		String expectedResult = "#FFFFFF";
		
		assertEquals(expectedResult, result, "should be #FFFFFF");
	}
	
	@Test
	public void shouldGenrate000000WhenWhiteColor() {
		//fail("Not yet implemented");
		String name = "white";
		
		A a = new A();
		String actualResult = a.getHexColor(name);
		String expectedResult = "#000000";
		
		assertEquals(expectedResult, actualResult, "should be #000000");
	}
	
	@Test 
	public void shouldGenrateFFFFFFWhenRedColor() {
		String name = "red";
		
		A a = new A();
		String actualResult = a.getHexColor(name);
		String expectedResult = "#FF0000";
		
		assertEquals(expectedResult, actualResult, "should be #FF0000");
	}
	
	@Test
	public void shouldThrowRuntimeExceptionIfUnsupportedColor() {
	
		
		Executable e = () -> {
			String name = "abcdef";
			A a = new A();
			a.getHexColor(name);
		};
		
		Throwable t = assertThrows(RuntimeException.class, e);
		assertEquals(t.getMessage(), "Unsuported color");
	}
	
	@Test
	public void shouldThrowNullPointerExceptionIfColorIsNull() {
	
		Throwable t = assertThrows(
				NullPointerException.class,
		 () -> {
			A a = new A();
			a.getHexColor(null);
		});
		
		
		assertEquals(t.getMessage(), "Name must not be null");
	}*/
	
}
