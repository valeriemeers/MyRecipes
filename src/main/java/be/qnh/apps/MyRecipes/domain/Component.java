package be.qnh.apps.MyRecipes.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Component implements Serializable {
    private static final long serialVersionID = 56498795462258L;

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    @ElementCollection
    @OneToMany(mappedBy = "component", cascade = CascadeType.ALL)
    private Collection<Ingredient> ingredients = new ArrayList<>();
    private String instructions;

    private Recipe recipe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Collection<Ingredient> ingredients) {
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
                "id=" + id +
                ", ingredients=" + ingredients +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}
