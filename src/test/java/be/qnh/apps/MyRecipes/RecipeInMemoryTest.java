package be.qnh.apps.MyRecipes;

import be.qnh.apps.MyRecipes.domain.Recipe;
import be.qnh.apps.MyRecipes.service.RecipeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RecipeInMemoryTest extends InMemoryTest {


    @Autowired
    private RecipeService recipeService;

    @Test
    public void testFindByIngredientQuery(){

        List<Recipe> recipes =recipeService.findByIngredient("pumpkin puree");
        assertThat(recipes).isNotNull();
    }

    @Test
    public void testFindById(){
        Recipe recipe = recipeService.findById(1L);
        assertThat(recipe).isNotNull();
    }
}
