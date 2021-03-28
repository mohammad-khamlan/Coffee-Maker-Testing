package edu.najah.csp.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class Sugar_RecipeTest {

	@Test
	public void testGetAmtSugar() throws NumberFormatException, RecipeException {
		String amtSugar = "4";
		double expected = 4;
		double actual = 0;

		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtChocolate(amtSugar);
		actual = objectRecipe.getAmtChocolate();
		assertTrue(actual == expected);
	}

	
	@Test
	public void testSetAmtSugarPositive() throws NumberFormatException, RecipeException {
		double expected = 3;
		double actual = 0;
		String amtSugar = "3";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtSugar(amtSugar);
			
		actual = objectRecipe.getAmtSugar();	
		assertTrue(actual == expected);
	}

	
	@Test (expected = RecipeException.class)
	public void testSetAmtSugarNegative() throws NumberFormatException, RecipeException {
		double expected = 6;
		double actual = 0;
		String amtSugar = "-6";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtSugar(amtSugar);
			
		actual = objectRecipe.getAmtSugar();	
		assertTrue(actual == expected);
	}

	
	@Test
	public void testSetAmtSugarFloat() throws NumberFormatException, RecipeException {
		double expected = 2.75;
		double actual = 0;
		String amtSugar = "2.75";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtSugar(amtSugar);
			
		actual = objectRecipe.getAmtSugar();	
		assertTrue(actual == expected);
	}

	
	@Test (expected = NumberFormatException.class)
	public void testSetAmtSugarNotNumber() throws NumberFormatException, RecipeException {
		double expected = 0;
		double actual = 0;
		String amtSugar = "test";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtSugar(amtSugar);
			
		actual = objectRecipe.getAmtSugar();	
		assertTrue(actual == expected);
	}

	
	@Test
	public void testSetAmtSugarZero() throws NumberFormatException, RecipeException {
		double expected = 0;
		double actual = 0;
		String amtSugar = "0";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtSugar(amtSugar);
			
		actual = objectRecipe.getAmtSugar();	
		assertTrue(actual == expected);
	}

}
