package edu.najah.csp.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class deleteRecipe_RecipeBookTest {

	static Recipe objectRecipe = new Recipe();
	RecipeBook objectRecipeBook = new RecipeBook();
	
	@BeforeClass
	public static void fillRecipeData() throws NumberFormatException, RecipeException {
		objectRecipe.setAmtChocolate("5");
		objectRecipe.setAmtCoffee("1.5");
		objectRecipe.setAmtMilk("2");
		objectRecipe.setAmtSugar("0");
		objectRecipe.setName("espresso");
		objectRecipe.setPrice("10");
		System.out.println("****");
	}

	@Test
	public void testDeleteRecipeNotNullIndex() {
		objectRecipeBook.addRecipe(objectRecipe);
		String expected = objectRecipe.getName();
		String actual = "";
		actual = objectRecipeBook.deleteRecipe(0);
		assertTrue(expected == actual);
	}

	
	@Test
	public void testDeleteRecipeNullIndex() {
		String expected = null;
		String actual = "";
		actual = objectRecipeBook.deleteRecipe(3);
		assertTrue(expected == actual);
	}

}
