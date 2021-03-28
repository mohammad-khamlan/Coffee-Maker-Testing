package edu.najah.csp.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class addRecipe_RecipeBookTest {

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
	public void testAddRecipeNotExist() throws NumberFormatException, RecipeException {
		boolean expected = true;
		boolean actual = true;
		
		actual = objectRecipeBook.addRecipe(objectRecipe);
		assertTrue(expected == actual);
	}

	@Test
	public void testAddRecipeExist() {
		boolean expected = false;
		boolean actual = true;
		
		actual = objectRecipeBook.addRecipe(objectRecipe);
		actual = objectRecipeBook.addRecipe(objectRecipe);
		assertTrue(expected == actual);
	}

	
	@Test
	public void testAddRecipeFullArray() throws NumberFormatException, RecipeException {
		boolean expected = false;
		boolean actual = true;

		for(int i = 0; i < 4; i++) {
		Recipe recipe = new Recipe();
		String input = Integer.toString(i);
		
		recipe.setAmtChocolate(input);
		recipe.setAmtCoffee(input);
		recipe.setAmtMilk(input);
		recipe.setAmtSugar(input);
		recipe.setName(input);
		recipe.setPrice(input);

		boolean added = objectRecipeBook.addRecipe(recipe);
		}

		actual = objectRecipeBook.addRecipe(objectRecipe);
		assertTrue(expected == actual);
	}

}
