package be.qnh.apps.MyRecipes.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Recipe implements Serializable {
    private static final long serialVersionID = 56498795462246L;

    @Id
    @GeneratedValue
    private Long id;

    @Basic(optional = false)
    private String name;
    private String description;
    private String course;
    private String category;
    private String level;
    private String kitchen;
    private String source;
    private int servingSize;
    @Embedded
    private Timing time = new Timing();
    private int evaluation;

    @Basic(optional = false)
    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private Collection<Component> component;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public Timing getTime() {
        return time;
    }

    public void setTime(Timing time) {
        this.time = time;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }

    public Collection<Component> getComponent() {
        return component;
    }

    public void setComponent(ArrayList<Component> component) {
        this.component = component;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", evaluation=" + evaluation +
                '}';
    }
}
