package be.qnh.apps.MyRecipes;

import be.qnh.apps.MyRecipes.service.RecipeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RecipeInMemoryTest extends InMemoryTest {


    @Autowired
    private RecipeService recipeService;

    @Test
    public void testFindByIngredientQuery(){
        recipeService.findByIngredient("");
    }
}
