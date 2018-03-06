package be.qnh.apps.MyRecipes.Repository;

import be.qnh.apps.MyRecipes.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RecipeRepository extends JpaRepository<Recipe, Long>, RecipeRepositoryCustom {

    Recipe findByName(String name);

    //List<Recipe> findByIngredient(String ingredient);
//    List<Recipe> findByCourse(String course);
//    List<Recipe> findByCategory(String Category);
//    List<Recipe> findByEvaluation(int evaluation);
//    List<Recipe> findByLevel(String level);
//    List<Recipe> findByKitchen(String kitchen);


}
