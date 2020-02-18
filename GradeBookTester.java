import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTester {
	
	private GradeBook grade_1;
	private GradeBook grade_2;


	@BeforeEach
	public void setUp() {
		grade_1 = new GradeBook(5);
		grade_1.addScore(50.0);
		grade_1.addScore(75.0);

		grade_2 = new GradeBook(5);
		grade_2.addScore(20.0);
		grade_2.addScore(40.0);
		
	}

	@AfterEach
	public void tearDown()  {
		grade_1 = null;
		grade_2 = null; 
	}

	@Test
	public void addScore() {
		assertTrue((grade_1.toString()).equals("50.0 75.0 "));
		assertTrue((grade_2.toString()).equals("20.0 40.0 "));
		
		assertEquals(2, grade_1.getScoreSize(), 0.001);
		assertEquals(2, grade_2.getScoreSize(), 0.001);
	}
	
	@Test
	public void sum() {
		assertEquals(125.0, grade_1.sum(), .0001);
		assertEquals(60.0, grade_2.sum(), .0001);
	}
	
	@Test 
	public void minimum() {
		assertEquals(50.0, grade_1.minimum(), .001);
		assertEquals(20.0, grade_2.minimum(), .001);
	}

	@Test
	public void finalScore() {
		assertTrue((grade_1.toString()).equals("50.0 75.0 "));
		assertTrue((grade_2.toString()).equals("20.0 40.0 "));
		
		assertEquals(2, grade_1.getScoreSize(), 0.001);
		assertEquals(2, grade_2.getScoreSize(), 0.001);
	}
}
