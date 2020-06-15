package Tests;

import static org.junit.Assert.*;



import org.junit.Test;

import operations.ResultsReturn;

public class MarksCheck {

	@Test
	public void test() {
		ResultsReturn rs = new ResultsReturn();
		String value = rs.getResultRank(80);
		
		assertEquals("A+", value);
		
	}

}
