package be.qnh.apps.MyRecipes.Repository;

import be.qnh.apps.MyRecipes.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RecipeJPARepository extends JpaRepository<Recipe, Long> {


}
