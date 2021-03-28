package edu.najah.csp.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class Chocolate_RecipeTest {
	
	@Test
	public void testGetAmtChocolate() throws NumberFormatException, RecipeException {
		String amtChocolate = "5";
		double expected = 5;
		double actual = 0;

		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtChocolate(amtChocolate);
		actual = objectRecipe.getAmtChocolate();
		assertTrue(actual == expected);
	}

	@Test
	public void testSetAmtChocolatePositive() throws NumberFormatException, RecipeException {
		double expected = 2;
		double actual = 0;
		String amtChocolate = "2";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtChocolate(amtChocolate);
			
		actual = objectRecipe.getAmtChocolate();	
		assertTrue(actual == expected);
	}
	
	@Test (expected = RecipeException.class)
	public void testSetAmtChocolateNegative() throws NumberFormatException,RecipeException {
		double expected = 5;
		double actual = 0;
		String amtChocolate = "-5";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtChocolate(amtChocolate);
		
		actual = objectRecipe.getAmtChocolate();	
		assertTrue(actual == expected);
	}

	@Test (expected = NumberFormatException.class)
	public void testSetAmtChocolateNotNumber() throws NumberFormatException,RecipeException {
		double expected = 0;
		double actual = 0;
		String amtChocolate = "x";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtChocolate(amtChocolate);
		
		actual = objectRecipe.getAmtChocolate();	
		assertTrue(actual == expected);
	}

	@Test
	public void testSetAmtChocolateFloat() throws NumberFormatException,RecipeException {
		double expected = 5.5;
		double actual = 0;
		String amtChocolate = "5.5";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtChocolate(amtChocolate);
		
		actual = objectRecipe.getAmtChocolate();	
		assertTrue(actual == expected);
	}
	
	@Test
	public void testSetAmtChocolateZero() throws NumberFormatException,RecipeException {
		double expected = 0;
		double actual = 0;
		String amtChocolate = "0";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtChocolate(amtChocolate);
		
		actual = objectRecipe.getAmtChocolate();	
		assertTrue(actual == expected);
	}


}
