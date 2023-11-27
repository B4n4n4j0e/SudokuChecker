import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
SudokuVerifier v = new SudokuVerifier();

	@Test
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test
	public void testIncorrectString() {		
		int a = v.verify(i);
		assertEquals("incorrect string", a, -2);

	}
	
	@Test
	public void testIncorrectStringWithZero() {		
		String i = "017369825632158947958724316825437169791586432346912758289643571573291684164875293";
		int a = v.verify(i);
		assertEquals("incorrect string", a, -1);

	}
	
	@Test
	public void testIncorrectStringWithNegativeNumber() {		
		String i = "-117369825632158947958724316825437169791586432346912758289643571573291684164875293";
		int a = v.verify(i);
		assertEquals("incorrect string", a, -1);
	}
	
	@Test
	public void testIncorrectStringWithLengthPlusOne() {		
		String i = "4173698256321589479587243168254371697915864323469127582896435715732916841648752939";
		int a = v.verify(i);
		assertEquals("incorrect string", a, -1);
	}
	
	
	@Test
	public void testIncorrectStringWithLengthMinusOne() {		
		String i = "41736982563215894795872431682543716979158643234691275828964357157329168416487529";
		int a = v.verify(i);
		assertEquals("incorrect string", a, -1);
	}
	
	@Test
	public void testIncorrectStringWithEmptyString() {		
		String i = "";
		int a = v.verify(i);
		assertEquals("incorrect string", a, -1);
	}
	
	@Test
	public void testIncorrectStringWithTwoInRow() {		
		String i = "417369824632158957958724316825437169791586432346912758289643571573291684164875293";
		int a = v.verify(i);
		assertEquals("incorrect string", a, -3);
	}
	
	@Test
	public void testIncorrectStringWithTwoInColumn() {		
		String i = "417369825632158947958724316825437169791586432346912758289643175573291684164875293";
		int a = v.verify(i);
		assertEquals("incorrect string", a, -4);
	}
	
    @Test	
    public void testIncorrectStringWithFloat() {		
		String i = "1.0030417369825632158947958724316825437169791586432346912758289643175573291684164";
		int a = v.verify(i);

		assertEquals("incorrect string", a, 1);
	}
    
    @Test	
    public void testIncorrectStringWithString() {		
		String i = "æ17369825632158947958724316825437169791586432346912758289643571573291684164875293";
		int a = v.verify(i);

		assertEquals("incorrect string", a, 1);
	}
	
	
}
