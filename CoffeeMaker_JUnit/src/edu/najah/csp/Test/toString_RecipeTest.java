package edu.najah.csp.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;

public class toString_RecipeTest {

	@Test
	public void testToString() {
		String Name = "test1";
		String expected = "test1";
		String actual = "";

		Recipe objectRecipe = new Recipe();
		objectRecipe.setName(Name);
		actual = objectRecipe.toString();
		assertTrue(expected == actual);
	}

}
