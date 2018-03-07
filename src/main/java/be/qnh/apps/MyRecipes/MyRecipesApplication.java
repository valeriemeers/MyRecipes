package be.qnh.apps.MyRecipes;

import be.qnh.apps.MyRecipes.Repository.RecipeRepositoryImpl;
import be.qnh.apps.MyRecipes.domain.Component;
import be.qnh.apps.MyRecipes.domain.Ingredient;
import be.qnh.apps.MyRecipes.domain.Recipe;
import be.qnh.apps.MyRecipes.domain.Timing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class MyRecipesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRecipesApplication.class, args);

    }



}
