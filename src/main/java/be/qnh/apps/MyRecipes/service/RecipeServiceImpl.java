package be.qnh.apps.MyRecipes.service;

import be.qnh.apps.MyRecipes.Repository.RecipeRepository;
import be.qnh.apps.MyRecipes.domain.Ingredient;
import be.qnh.apps.MyRecipes.domain.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository repository;

    @Override
    public int createRecipe(Recipe recipe) {
        int recipeNew=repository.createRecipe(recipe);
            return recipeNew!=0?1:0;
    }

    @Override
    public List<Recipe> findAll() {
        return repository.findAll();
    }

    @Override
    public Recipe findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Recipe findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Recipe> findByIngredient(String ingredient) {
        return repository.findByIngredient(ingredient);
    }

    @Override
    public List<Ingredient> findAllIngredients(String name) {
        return repository.findAllIngredients(name);
    }

    @Override
    public List<Recipe> findByCourse(String course) {
        return repository.findByCourse(course);
    }

    @Override
    public Set<String> findAllCourses() {
        return repository.findAllCourses();
    }

    @Override
    public List<Recipe> findByCategory(String category) {
        return repository.findByCategory(category);
    }

    @Override
    public Set<String> findAllCategories() {
        return repository.findAllCategories();
    }

    @Override
    public List<Recipe> findByEvaluation(int evaluation) {
        return repository.findByEvaluation(evaluation);
    }

    @Override
    public Set<Integer> findAllEvaluations() {
        return repository.findAllEvaluations();
    }

    @Override
    public List<Recipe> findByLevel(String level) {
        return repository.findByLevel(level);
    }

    @Override
    public Set<String> findAllLevels() {
        return repository.findAllLevels();
    }

    @Override
    public List<Recipe> findByKitchen(String kitchen) {
        return repository.findByKitchen(kitchen);
    }

    @Override
    public Set<String> findAllKitchens() {
        return repository.findAllKitchens();
    }

    @Override
    public int updateRecipe(Long id, Recipe recipe) {
        int update=repository.updateRecipe(id, recipe);
        return update!=0?1:0;
    }

    @Override
    public int deleteRecipe(Long id) {
        int delete = repository.deleteRecipe(id);
        return delete != 0 ? 1 : 0;
    }
}
