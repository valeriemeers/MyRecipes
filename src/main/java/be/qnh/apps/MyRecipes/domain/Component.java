package be.qnh.apps.MyRecipes.domain;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import java.util.ArrayList;
import java.util.List;

@Embeddable
public class Component {

    private String name;
    private String instructions;

    @ElementCollection
    private List<Ingredient> ingredients = new ArrayList<>();

    //constructors
    public Component(){
    }
    public Component (String name, String instructions, List<Ingredient> ingredients){
        this.name=name;
        this.instructions=instructions;
        this.ingredients=new ArrayList<>();
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
