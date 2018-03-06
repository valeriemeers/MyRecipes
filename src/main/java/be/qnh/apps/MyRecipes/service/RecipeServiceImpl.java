package be.qnh.apps.MyRecipes.service;

import be.qnh.apps.MyRecipes.Repository.RecipeRepository;
import be.qnh.apps.MyRecipes.domain.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RecipeServiceImpl implements RecipeService{

    @Autowired
    private RecipeRepository repository;

    @Override
    public int createRecipe(Recipe recipe) {
        return repository.createRecipe(recipe);
    }

    @Override
    public List<Recipe> findAll() {
        return repository.findAll();
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
    public List<Recipe> findRecipeByIngredient(String ingrediënt) {
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
