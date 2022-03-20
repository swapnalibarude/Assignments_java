package ass5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeEach
	void setUp() throws Exception {
		calculator=new Calculator();
	}
	private Calculator calculator;
	
	@Test
	void add_number() {
		
		Assertions.assertEquals(5,calculator.add(2,3));
	}
	void sub_number() {
		
		Assertions.assertEquals(5,calculator.add(5,5));
	}
	void mult_number() {

		Assertions.assertEquals(6,calculator.add(2,3));
	}
	void divide_number() {
		
		Assertions.assertEquals(1,calculator.add(3,3));
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
	}



}
