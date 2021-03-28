package edu.najah.csp.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class Coffee_RecipeTest {
	
	@Test
	public void testGetAmtCoffee() throws NumberFormatException, RecipeException {
		String amtCoffee = "5";
		double expected = 5;
		double actual = 0;

		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtCoffee(amtCoffee);
		actual = objectRecipe.getAmtCoffee();
		assertTrue(actual == expected);
	}

	@Test
	public void testSetAmtCoffeePositive() throws NumberFormatException, RecipeException {
		double expected = 5;
		double actual = 0;
		String amtCoffee = "5";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtCoffee(amtCoffee);
			
		actual = objectRecipe.getAmtCoffee();	
		assertTrue(actual == expected);
	}

	@Test(expected = RecipeException.class)
	public void testSetAmtCoffeeNegative() throws NumberFormatException, RecipeException {
		double expected = 7;
		double actual = 0;
		String amtCoffee = "-7";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtCoffee(amtCoffee);
			
		actual = objectRecipe.getAmtCoffee();	
		assertTrue(actual == expected);
	}

	@Test
	public void testSetAmtCoffeeFloat() throws NumberFormatException, RecipeException {
		double expected = 10.8;
		double actual = 0;
		String amtCoffee = "10.8";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtCoffee(amtCoffee);
			
		actual = objectRecipe.getAmtCoffee();	
		assertTrue(actual == expected);
	}

	@Test(expected = NumberFormatException.class)
	public void testSetAmtCoffeeNotNumber() throws NumberFormatException, RecipeException {
		double expected = 0;
		double actual = 0;
		String amtCoffee = "m";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtCoffee(amtCoffee);
			
		actual = objectRecipe.getAmtCoffee();	
		assertTrue(actual == expected);
	}
	
	@Test
	public void testSetAmtCoffeeZero() throws NumberFormatException, RecipeException {
		double expected = 0;
		double actual = 0;
		String amtCoffee = "0";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setAmtCoffee(amtCoffee);
			
		actual = objectRecipe.getAmtCoffee();	
		assertTrue(actual == expected);
	}


}
