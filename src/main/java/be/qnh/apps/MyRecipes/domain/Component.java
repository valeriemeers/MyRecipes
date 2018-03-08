package be.qnh.apps.MyRecipes.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Component {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String instructions;

    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn (name="ingredient_id")
    private List<Ingredient> ingredients = new ArrayList<>();

    @ManyToOne
    private Recipe recipe;



    //constructors
    public Component(){
    }
    public Component (String name, String instructions, List<Ingredient> ingredients){
        this.name=name;
        this.instructions=instructions;
        this.ingredients=ingredients;
    }

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    public String getInstructions() {
        return instructions;
    }
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Component{" +
                ", ingredients=" + ingredients +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}
