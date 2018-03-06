package be.qnh.apps.MyRecipes.Repository;

import be.qnh.apps.MyRecipes.domain.Ingredient;
import be.qnh.apps.MyRecipes.domain.Recipe;

import java.util.List;
import java.util.Set;

public interface RecipeRepository {
    int createRecipe(Recipe recipe);

    List<Recipe> findAll();
    Recipe findByName(String name);
    Recipe findById(Long id);

    List<Recipe> findByIngredient(String ingredient);
    List<Ingredient> findAllIngredients(String name);

    List<Recipe> findByCourse(String course);
    Set<String> findAllCourses();

    List<Recipe> findByCategory(String category);
    Set<String> findAllCategories();

    List<Recipe> findByEvaluation(int evaluation);
    Set<Integer> findAllEvaluations();

    List<Recipe> findByLevel(String level);
    Set<String> findAllLevels();

    List<Recipe> findByKitchen(String kitchen);
    Set<String> findAllKitchens();

    int updateRecipe(Long id, Recipe recipe);

    int deleteRecipe (Long id);
}
