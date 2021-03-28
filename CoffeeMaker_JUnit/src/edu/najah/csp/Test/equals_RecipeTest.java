package edu.najah.csp.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;

public class equals_RecipeTest {

	@Test
	public void testEqualsObjectRecipe() {
		boolean expected = true;
		boolean actual = true;
		
		Recipe objectRecipe = new Recipe();
		actual = objectRecipe.equals(objectRecipe);
		assertTrue(actual == expected);
	}

	@Test
	public void testEqualsObjectSuperObject() {
		boolean expected = false;
		boolean actual = true;
		
		Object obj = new Object();
		Recipe objectRecipe = new Recipe();

		actual = objectRecipe.equals(obj);
		assertTrue(actual == expected);
	}

	@Test
	public void testEqualsObjectNull() {
		boolean expected = false;
		boolean actual = true;
		
		Recipe objectRecipe = new Recipe();
		Object obj = null;
		
		actual = objectRecipe.equals(obj);
		assertTrue(actual == expected);
	}

}
