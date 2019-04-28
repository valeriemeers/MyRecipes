package be.qnh.apps.MyRecipes.controller;

import be.qnh.apps.MyRecipes.domain.Recipe;
import be.qnh.apps.MyRecipes.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping
    public Iterable<Recipe> getAll() {
    Iterable<Recipe> recipes = this.recipeService.findAll();

    return recipes;
    }

    @PostMapping("/create")
    public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe) {
        recipeService.createRecipe(recipe);
        return new ResponseEntity<>(recipe, HttpStatus.CREATED);

    }
}
