package be.qnh.apps.MyRecipes.domain;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class Ingredient {

    @NotNull
    private String name;
    private String quantity;

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
