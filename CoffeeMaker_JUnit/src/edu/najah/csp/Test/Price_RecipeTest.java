package edu.najah.csp.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class Price_RecipeTest {

	@Test
	public void testGetPrice() throws RecipeException {
		String Price = "20";
		double expected = 20;
		double actual = 0;

		Recipe objectRecipe = new Recipe();
		objectRecipe.setPrice(Price);
		actual = objectRecipe.getPrice();
		assertTrue(actual == expected);
	}

	@Test
	public void testSetPricePositive() throws NumberFormatException,RecipeException {
		double expected = 10;
		double actual = 0;
		String Price = "10";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setPrice(Price);
			
		actual = objectRecipe.getPrice();
		assertTrue(actual == expected);
	}

	
	@Test(expected = RecipeException.class)
	public void testSetPriceNegative() throws NumberFormatException,RecipeException {
		double expected = 7;
		double actual = 0;
		String Price = "-7";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setPrice(Price);
			
		actual = objectRecipe.getPrice();
		assertTrue(actual == expected);
	}

	@Test
	public void testSetPriceFloat() throws NumberFormatException,RecipeException {
		double expected = 7.2;
		double actual = 0;
		String Price = "7.2";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setPrice(Price);
			
		actual = objectRecipe.getPrice();
		assertTrue(actual == expected);
	}

	@Test(expected = NumberFormatException.class)
	public void testSetPriceNotNumber() throws NumberFormatException,RecipeException {
		double expected = 0;
		double actual = 0;
		String Price = "x";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setPrice(Price);
			
		actual = objectRecipe.getPrice();
		assertTrue(actual == expected);
	}
	
	@Test
	public void testSetPriceZero() throws NumberFormatException,RecipeException {
		double expected = 0;
		double actual = 0;
		String Price = "0";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setPrice(Price);
			
		actual = objectRecipe.getPrice();
		assertTrue(actual == expected);
	}


}
