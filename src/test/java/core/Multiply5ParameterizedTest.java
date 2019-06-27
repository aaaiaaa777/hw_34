package core;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Multiply5ParameterizedTest {
	//Test data generator 
		@Parameters (name = "Parameter # {index}: {1} * {2} * {3} * {4} * {5}= {0}")
		
		public static Collection<Double[]> addNumbers() {
			return Arrays.asList(new Double[][]{
				
				{2.0, 1.0, 2.0, 1.0, 1.0, 1.0},  
				{0.0, 5.0, 4.0, 0.0, 1.0, 0.5},
				{0.0, 6.0, 5.0, 0.0, 20.0, 5.0},
				{0.0, 2.0, 6.8, 0.0, 3.6, 4.7},
				{0.0, 5.0, 4.0, 0.0, 1.0, 0.5},
				{2.0, 1.0, 2.0, 1.0, 1.0, 1.0},
			});}

		//parameter for State injection instead of Constructor
		
		@Parameter(value = 0) public Double expected;
		@Parameter(value = 1) public Double first;
		@Parameter(value = 2) public Double second;
		@Parameter(value = 3) public Double third;
		@Parameter(value = 4) public Double fourth;
		@Parameter(value = 5) public Double fifth;
		
		@Test
		public void add() {
			System.out.println(first+"*"+second+"*"+third+"*"+fourth+"*"+fifth+"="+expected);
			 
			assertEquals("Not correct", Calculator.multiply(first, second, third, fourth, fifth), expected, 0.09);
			

	}

}
