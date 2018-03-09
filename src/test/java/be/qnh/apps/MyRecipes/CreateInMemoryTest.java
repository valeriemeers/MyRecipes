package be.qnh.apps.MyRecipes;

import be.qnh.apps.MyRecipes.domain.Component;
import be.qnh.apps.MyRecipes.domain.Ingredient;
import be.qnh.apps.MyRecipes.domain.Recipe;
import be.qnh.apps.MyRecipes.domain.Timing;
import be.qnh.apps.MyRecipes.service.RecipeService;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CreateInMemoryTest extends InMemoryTest {
    @Autowired
    private RecipeService recipeService;

    @Test
    public void testCreateRecipe() {
        List<Ingredient> ingredients = new ArrayList<>();
        Ingredient ingredient1 = new Ingredient("banana", "1");
        Ingredient ingredient2 = new Ingredient("coco's", "10ml");
        ingredients.add(ingredient1);
        ingredients.add(ingredient2);
        Component component = new Component("Mix", "Mix the banana and the coco's milk"
                , ingredients);
        List<Component> components = new ArrayList<>();
        components.add(component);

        Recipe recipe1 = new Recipe("Banana smoothie", "Smoothie with banana and cokos", "Breakfast", "Super easy", "Beginner",
                "vegan", "www.smoothie.be", 2, 5, new Timing(5, 5), components);

        Recipe recipe2 = recipeService.createRecipe(recipe1);

        int i = recipe2 != null ? 1 : 0;
        Assertions.assertThat(i).isEqualTo(1);

        Recipe recipeCreated = recipeService.createRecipe(recipe1);
        Assert.assertTrue("create recipe dit not work", recipeCreated.getId() != 0);

    }
}
