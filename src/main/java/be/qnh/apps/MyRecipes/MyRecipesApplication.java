package be.qnh.apps.MyRecipes;

import be.qnh.apps.MyRecipes.domain.Component;
import be.qnh.apps.MyRecipes.domain.Ingredient;
import be.qnh.apps.MyRecipes.domain.Recipe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MyRecipesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRecipesApplication.class, args);

        Recipe recept = new Recipe();
        recept.setCategory("Cupcake");
        recept.setDescription("Tasty cupcake with pumpkin");
        recept.setCourse("Sweets");
        recept.setEvaluation(5);
        recept.setKitchen("vegan");
        recept.setName("Pumpkin cupcakes");
        recept.setServingSize(16);
        recept.setLevel("Beginner");
        recept.setSource("Chloe Coscarelli");

        Component componentA = new Component();
        List<Ingredient> ingredients = new ArrayList<>();
        componentA.setIngredients(ingredients);


    }



}
