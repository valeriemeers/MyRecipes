package be.qnh.apps.MyRecipes.controller;

import be.qnh.apps.MyRecipes.domain.Recipe;
import be.qnh.apps.MyRecipes.service.RecipeService;
import be.qnh.apps.MyRecipes.service.RecipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping
    public Iterable<Recipe> getAll() {
    Iterable<Recipe> recipes = this.recipeService.findAll();

    return recipes;
    }

}
