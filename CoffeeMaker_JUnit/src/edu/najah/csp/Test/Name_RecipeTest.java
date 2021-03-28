package edu.najah.csp.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class Name_RecipeTest {

	@Test
	public void testGetName() throws NumberFormatException, RecipeException {
		String Name = "test1";
		String expected = "test1";
		String actual = "";

		Recipe objectRecipe = new Recipe();
		objectRecipe.setName(Name);
		actual = objectRecipe.getName();
		assertTrue(actual == expected);
	}

	@Test
	public void testSetName() throws RecipeException {
		String Name = "test2";
		String expected = "test2";
		String actual = "";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setName(Name);
			
		actual = objectRecipe.getName();
		assertTrue(actual == expected);
	}
	
	@Test
	public void testSetNameNull() throws RecipeException {
		String Name = null;
		String expected = "";
		String actual = "";
		
		Recipe objectRecipe = new Recipe();
		objectRecipe.setName(Name);
			
		actual = objectRecipe.getName();
		assertTrue(actual == expected);
	}


}
