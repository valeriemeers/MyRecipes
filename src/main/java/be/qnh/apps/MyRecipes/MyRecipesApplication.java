package be.qnh.apps.MyRecipes;

import be.qnh.apps.MyRecipes.domain.Component;
import be.qnh.apps.MyRecipes.domain.Ingredient;
import be.qnh.apps.MyRecipes.domain.Recipe;
import be.qnh.apps.MyRecipes.domain.Timing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MyRecipesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRecipesApplication.class, args);

//            Recipe recept = new Recipe();
//            recept.setCategory("Cupcake");
//            recept.setDescription("Tasty cupcake with pumpkin");
//            recept.setCourse("Sweets");
//            recept.setEvaluation(5);
//            recept.setKitchen("vegan");
//            recept.setName("Pumpkin cupcakes");
//            recept.setServingSize(16);
//            recept.setLevel("Beginner");
//            recept.setSource("Chloe Coscarelli");
//
//            List<Component> componentList = new ArrayList<>();
//            Component componentA = new Component();
//            List<Ingredient> ingredients = new ArrayList<>();
//            Ingredient ingredient = new Ingredient();
//            ingredient.setName("pumpkin puree");
//            ingredient.setQuantity("1 cup");
//            Ingredient ingredient2 = new Ingredient();
//            ingredient.setName("vanilla extract");
//            ingredient.setQuantity("1 tbsp");
//            ingredients.add(ingredient);
//            ingredients.add(ingredient2);
//            componentA.setIngredients(ingredients);
//            componentA.setName("cupcake");
//            componentA.setInstructions("In a large bowl, whisk together all dry ingredients. In a separate bowl, whisk together all wet ingredients. Pour the wet mixture into the dry mixture and whisk untiil just combined. Do not overmix.");
//            componentList.add(componentA);
//
//            Timing timing = new Timing();
//            timing.setPrepTime(15);
//            timing.setCookTime(20);



    }



}
