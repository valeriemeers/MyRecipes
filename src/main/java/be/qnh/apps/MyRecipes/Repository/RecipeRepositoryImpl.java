package be.qnh.apps.MyRecipes.Repository;

import be.qnh.apps.MyRecipes.domain.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class RecipeRepositoryImpl implements RecipeRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Recipe> findByIngredient(String ingredient) {
        Query query = entityManager.createQuery("select i.component.recipe from  Ingredient i where i.name = :ingredient"
                , Recipe.class).setParameter("ingredient", ingredient);

        return query.getResultList();
    }

//    @Autowired
//   private be.qnh.apps.MyRecipes.Repository.RecipeRepository RecipeRepository;

//    @Override
//    public int createRecipe(Recipe recipe) {
//        Recipe createdRecipe = RecipeRepository.saveAndFlush(recipe);
//        return createdRecipe!=null?1:0;
//    }
//
//    @Override
//    public List<Recipe> findAll() {
//        return RecipeRepository.findAll();
//    }

//    @Override
//    public Recipe findByName(String name) {
//        return RecipeRepository.findByName(name);
//    }



//    @Override
//    public List<Recipe> findByIngredient(String ingredient) {
//        List<Recipe> recipeWithIngredient= RecipeRepositoryCustom.findByIngredient(ingredient);
//        return recipeWithIngredient;
//    }

//    @Override
//    public List<Ingredient> findAllIngredients(String name) {
//        Recipe recipeWithName=RecipeRepository.findByName(name);
//        List<Component> components= recipeWithName.getComponent();
//        List<Ingredient> ingredients=new LinkedList<>();
//            for(Component component:components){
//                ingredients=component.getIngredients();
//        }
//        return ingredients;
//    }

//    @Override
//    public List<Recipe> findByCourse(String course) {
//        List<Recipe> recipewithCourse= RecipeRepositoryCustom.findByCourse(course);
//        return recipewithCourse;
//    }

//    @Override
//    public Set<String> findAllCourses() {
//        List<Recipe> allRecipes = RecipeRepository.findAll();
//        Set<String> courses=new HashSet<>();
//        for (Recipe recipe : allRecipes) {
//            String course = recipe.getCourse();
//            courses.add(course);
//        }
//        return courses;
//    }

//    @Override
//    public List<Recipe> findByCategory(String category) {
//        List<Recipe> recipeWithCategory = RecipeRepositoryCustom.findByCategory(category);
//        return recipeWithCategory;
//    }

//    @Override
//    public Set<String> findAllCategories() {
//        List<Recipe> allRecipes= RecipeRepository.findAll();
//        Set<String> categories=new HashSet<>();
//        for (Recipe recipe:allRecipes){
//            String category=recipe.getCategory();
//            categories.add(category);
//        }
//        return categories;
//    }

//    @Override
//    public List<Recipe> findByEvaluation(int evaluation) {
//        List<Recipe> recipeWithEvaluation = RecipeRepositoryCustom.findByEvaluation(evaluation);
//        return recipeWithEvaluation;
//    }

//    @Override
//    public Set<Integer> findAllEvaluations() {
//        List<Recipe> allRecipes = RecipeRepository.findAll();
//        Set<Integer> evaluations = new HashSet<>();
//        for (Recipe recipe:allRecipes){
//            int evaluation= recipe.getEvaluation();
//            evaluations.add(evaluation);
//        }
//
//        return evaluations;
//    }

//    @Override
//    public List<Recipe> findByLevel(String level) {
//        List<Recipe> recipeWithLevel = RecipeRepositoryCustom.findByLevel(level);
//        return recipeWithLevel;
//    }

//    @Override
//    public Set<String> findAllLevels() {
//        List<Recipe> allRecipes=RecipeRepository.findAll();
//        Set<String> levels= new HashSet<>();
//        for (Recipe recipe:allRecipes){
//            String level= recipe.getLevel();
//            levels.add(level);
//        }
//        return levels;
//    }

//    @Override
//    public List<Recipe> findByKitchen(String kitchen) {
//        List<Recipe> recipeWithKitchen=RecipeRepositoryCustom.findByKitchen(kitchen);
//        return recipeWithKitchen;
//    }

//    @Override
//    public Set<String> findAllKitchens() {
//        List<Recipe> allRecipes=RecipeRepository.findAll();
//        Set<String> kitchens=new HashSet<>();
//        for(Recipe recipe:allRecipes){
//            String kitchen=recipe.getKitchen();
//            kitchens.add(kitchen);
//        }
//        return kitchens;
//    }

//    @Override
//    public int updateRecipe(Long id, Recipe recipe) {
//        Recipe recipeDB=RecipeRepositoryCustom.findById(id);
//        recipeDB.setCategory(recipe.getCategory());
//        recipeDB.setComponent(recipe.getComponent());
//        recipeDB.setCourse((recipe.getCourse()));
//        recipeDB.setDescription(recipe.getDescription());
//        recipeDB.setEvaluation(recipe.getEvaluation());
//        recipeDB.setId(recipe.getId());
//        recipeDB.setKitchen(recipe.getKitchen());
//        recipeDB.setLevel(recipe.getLevel());
//        recipeDB.setName(recipe.getName());
//        recipeDB.setServingSize(recipe.getServingSize());
//        recipeDB.setTime(recipe.getTime());
//        recipeDB.setSource(recipe.getSource());
//        Recipe updated= RecipeRepositoryCustom.save(recipeDB);
//
//        return updated!=null?1:0;

//        return 0;
//    }

//    @Override
//    public int deleteRecipe(Long id) {
//        Recipe recipeDB = RecipeRepositoryCustom.findById(id);
//        RecipeRepositoryCustom.delete(recipeDB);
//       return 1;
//    }
}
