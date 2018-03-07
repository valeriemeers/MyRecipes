package be.qnh.apps.MyRecipes.service;

import be.qnh.apps.MyRecipes.Repository.RecipeRepository;
import be.qnh.apps.MyRecipes.domain.Component;
import be.qnh.apps.MyRecipes.domain.Ingredient;
import be.qnh.apps.MyRecipes.domain.Recipe;
import be.qnh.apps.MyRecipes.domain.Timing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public Recipe createRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);

    }

    @Override
    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    @Override
    public Recipe findByName(String name) {
        return recipeRepository.findByName(name);
    }

    @Override
    public Recipe findById(Long id) {
        return recipeRepository.getOne(id);
    }

    @Override
    public List<Recipe> findByIngredient(String ingredient) {
        return recipeRepository.findByIngredient(ingredient);
    }

    @PostConstruct
    public void init(){
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

        List<Component> componentList = new ArrayList<>();
        Component componentA = new Component();
        List<Ingredient> ingredients = new ArrayList<>();

        Ingredient ingredient = new Ingredient();
        ingredient.setName("pumpkin puree");
        ingredient.setQuantity("1 cup");

        Ingredient ingredient2 = new Ingredient();
        ingredient2.setName("vanilla extract");
        ingredient2.setQuantity("1 tbsp");

        ingredients.add(ingredient);
        ingredients.add(ingredient2);
        componentA.setIngredients(ingredients);
        componentA.setName("cupcake");
        componentA.setInstructions("In a large bowl, whisk together all dry ingredients. In a separate bowl, " +
                "whisk together all wet ingredients. Pour the wet mixture into the dry mixture and whisk until just combined. " +
                "Do not overmix.");
        componentList.add(componentA);

        Timing timing = new Timing();
        timing.setPrepTime(15);
        timing.setCookTime(20);

        recept.setTime(timing);

        recipeRepository.save(recept);

    }
//    @Override
//    public List<Ingredient> findAllIngredients(String name) {
//        return repository.findAllIngredients(name);
//    }

//    @Override
//    public List<Recipe> findByCourse(String course) {
//        return repository.findByCourse(course);
//    }

//    @Override
//    public Set<String> findAllCourses() {
//        return repository.findAllCourses();
//    }

//    @Override
//    public List<Recipe> findByCategory(String category) {
//        return repository.findByCategory(category);
//    }

//    @Override
//    public Set<String> findAllCategories() {
//        return repository.findAllCategories();
//    }

//    @Override
//    public List<Recipe> findByEvaluation(int evaluation) {
//        return repository.findByEvaluation(evaluation);
//    }

//    @Override
//    public Set<Integer> findAllEvaluations() {
//        return repository.findAllEvaluations();
//    }

//    @Override
//    public List<Recipe> findByLevel(String level) {
//        return repository.findByLevel(level);
//    }

//    @Override
//    public Set<String> findAllLevels() {
//        return repository.findAllLevels();
//    }

//    @Override
//    public List<Recipe> findByKitchen(String kitchen) {
//        return repository.findByKitchen(kitchen);
//    }

//    @Override
//    public Set<String> findAllKitchens() {
//        return repository.findAllKitchens();
//    }

//    @Override
//    public int updateRecipe(Long id, Recipe recipe) {
//        int update=repository.updateRecipe(id, recipe);
//        return update!=0?1:0;
//    }

//    @Override
//    public int deleteRecipe(Long id) {
//        int delete = repository.deleteRecipe(id);
//        return delete != 0 ? 1 : 0;
//    }
}
