package edu.najah.csp.Test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class getRecipes_RecipeBookTest {

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
	}

	@Test
	public void testGetRecipes() throws NumberFormatException, RecipeException {
		int expected = 1;
		int actual = 0;
		
		objectRecipeBook.addRecipe(objectRecipe);

		Recipe [] recipeArray = objectRecipeBook.getRecipes();
		
		for(int i = 0; i < recipeArray.length; i++) 
			if(recipeArray[i] != null) 
				actual++;
		
		System.out.println(actual);
		assertTrue(actual == expected);
	}

}
