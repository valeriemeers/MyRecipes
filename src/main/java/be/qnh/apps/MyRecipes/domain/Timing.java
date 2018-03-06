package be.qnh.apps.MyRecipes.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Timing  {
    private int prepTime;
    private int cookTime;

    //getters and setter
    public int getPrepTime() {
        return prepTime;
    }
    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }
    public int getCookTime() {
        return cookTime;
    }
    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    @Override
    public String toString() {
        return "Timing{" +
                "prepTime=" + prepTime +
                ", cookTime=" + cookTime +
                '}';
    }
}
