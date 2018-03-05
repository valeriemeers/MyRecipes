package be.qnh.apps.MyRecipes.Repository;

import be.qnh.apps.MyRecipes.domain.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecipeRepositoryImpl implements RecipeRepository {

   @Autowired
   private RecipeJPARepository repository;

    @Override
    public int createRecipe(Recipe recipe) {
        Recipe createdRecipe = repository.saveAndFlush(recipe);
        return createdRecipe!=null?1:0;
    }

    @Override
    public List<Recipe> findAll() {
        return null;
    }

    @Override
    public Recipe findRecipeByName(String name) {
        return null;
    }

    @Override
    public Recipe findRecipeById(Long id) {
        return null;
    }

    @Override
    public List<Recipe> findRecipeByIngredient(String ingredient) {
        return null;
    }

    @Override
    public List<Recipe> findRecipeByCourse(String course) {
        return null;
    }

    @Override
    public List<String> findAllCourses() {
        return null;
    }

    @Override
    public List<Recipe> findRecipeByCategory(String category) {
        return null;
    }

    @Override
    public List<String> findAllCategories() {
        return null;
    }

    @Override
    public List<Recipe> findRecipeByEvaluation(int evaluation) {
        return null;
    }

    @Override
    public List<Integer> findAllEvaluations() {
        return null;
    }

    @Override
    public List<Recipe> findRecipeByLevel(String level) {
        return null;
    }

    @Override
    public List<String> findAllLevels() {
        return null;
    }

    @Override
    public List<Recipe> findRecipeByKitchen(String kitchen) {
        return null;
    }

    @Override
    public List<String> findAllKitchens() {
        return null;
    }

    @Override
    public int updateRecipe(Long id, Recipe recipe) {
        return 0;
    }

    @Override
    public int deleteRecipe(Long id) {
        return 0;
    }
}
