package edu.najah.csp.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class editRecipe_RecipeBookTest {

	static Recipe objectRecipe = new Recipe();
	RecipeBook objectRecipeBook = new RecipeBook();
	
	@Before
	public void fillRecipeData() throws NumberFormatException, RecipeException {
		objectRecipe.setAmtChocolate("5");
		objectRecipe.setAmtCoffee("1.5");
		objectRecipe.setAmtMilk("2");
		objectRecipe.setAmtSugar("0");
		objectRecipe.setName("espresso");
		objectRecipe.setPrice("10");
	}

	@Test
	public void testEditRecipeNotNullIndex() {
		objectRecipeBook.addRecipe(objectRecipe);
		String expected = objectRecipe.getName();
		String actual = "";
		actual = objectRecipeBook.editRecipe(0, objectRecipe);
		assertTrue(expected == actual);
	}

	
	@Test
	public void testEditRecipeNullIndex() {
		String expected = null;
		String actual = "";
		actual = objectRecipeBook.editRecipe(2, objectRecipe);
		assertTrue(expected == actual);
	}

}
