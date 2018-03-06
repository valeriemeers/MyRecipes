package be.qnh.apps.MyRecipes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;
    private String quantity;

    @ManyToOne
    private Component component;

    //constructors
    public Ingredient(){
    }
    public Ingredient(String name, String quantity){
        this.name=name;
        this.quantity=quantity;
    }
    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Ingredient{" +
                ", name='" + name + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
