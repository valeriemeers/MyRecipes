package be.qnh.apps.MyRecipes.Repository;

import be.qnh.apps.MyRecipes.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface RecipeJPARepository extends JpaRepository<Recipe, Long> {

    Recipe findByName(String name);
    Recipe findById(Long id);
    List<Recipe> findByIngredient(String ingredient);
    List<Recipe> findByCourse(String course);
    List<Recipe> findByCategory(String Category);
    List<Recipe> findByEvaluation(int evaluation);
    List<Recipe> findByLevel(String level);
    List<Recipe> findByKitchen(String kitchen);


}
