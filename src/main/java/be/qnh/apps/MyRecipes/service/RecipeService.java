package be.qnh.apps.MyRecipes.service;

import be.qnh.apps.MyRecipes.domain.Recipe;

import java.util.List;

public interface RecipeService {
    int createRecipe(Recipe recipe);

    List<Recipe> findAll();
    Recipe findRecipeByName(String name);
    Recipe findRecipeById (Long id);

    List<Recipe> findRecipesByIngredient(String ingrediënt);
   // List<Ingredient> findAllIngredients();

    List<Recipe> findRecipeByCourse (String course);
    List<String> findAllCourses();

    List<Recipe> findRecipeByCategory (String category);
    List<String> findAllCategories();

    List<Recipe> findRecipeByEvaluation (int evaluation);
    List<Integer> findAllEvaluations();

    List<Recipe> findRecipeByLevel( String level);
    List<String> findAllLevels();

    List<Recipe> findRecipeByKitchen (String kitchen);
    List<String> findAllKitchens();

    int updateRecipe(Long id, Recipe recipe);

    int deleteRecipe (Long id);

}
