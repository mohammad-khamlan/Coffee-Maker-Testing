package edu.najah.csp.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class Milk_RecipeTest {

	@Test
	public void testGetAmtMilk() throws RecipeException {
		String amtMilk = "5";
		double expected = 5;
		double actual = 0;

		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtMilk(amtMilk);
		actual = objectRecipe.getAmtMilk();
		assertTrue(actual == expected);
	}

	@Test
	public void testSetAmtMilkPositive() throws RecipeException {
		double expected = 6;
		double actual = 0;
		String amtMilk = "6";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtMilk(amtMilk);
			
		actual = objectRecipe.getAmtMilk();
		assertTrue(actual == expected);
	}

	@Test(expected = RecipeException.class)
	public void testSetAmtMilkNegative() throws RecipeException {
		double expected = 9;
		double actual = 0;
		String amtMilk = "-9";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtMilk(amtMilk);
			
		actual = objectRecipe.getAmtMilk();
		assertTrue(actual == expected);
	}
	
	@Test
	public void testSetAmtMilkFloat() throws NumberFormatException, RecipeException {
		double expected = 6.8;
		double actual = 0;
		String amtMilk = "6.8";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtMilk(amtMilk);
			
		actual = objectRecipe.getAmtMilk();
		assertTrue(actual == expected);
	}

	@Test(expected = NumberFormatException.class)
	public void testSetAmtMilkNotNumber() throws NumberFormatException, RecipeException {
		double expected = 0;
		double actual = 0;
		String amtMilk = "h";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtMilk(amtMilk);
			
		actual = objectRecipe.getAmtMilk();
		assertTrue(actual == expected);
	}

	@Test
	public void testSetAmtMilkZero() throws NumberFormatException, RecipeException {
		double expected = 0;
		double actual = 0;
		String amtMilk = "0";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtMilk(amtMilk);
			
		actual = objectRecipe.getAmtMilk();
		assertTrue(actual == expected);
	}


}
