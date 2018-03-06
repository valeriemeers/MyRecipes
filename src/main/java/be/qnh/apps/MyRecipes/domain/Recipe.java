package be.qnh.apps.MyRecipes.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Recipe implements Serializable {

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
    private int evaluation;

    @Embedded
    private Timing time = new Timing();

    @Basic(optional = false)
    @OneToMany
    private List<Component> component= new ArrayList<>();

    //constructors
    public Recipe(){
    }
    public Recipe(String name, String description, String course, String category, String level,
                  String kitchen, String source, int servingSize,int evaluation, Timing time, List<Component> component){
        this.name=name;
        this.description=description;
        this.course=course;
        this.category=category;
        this.level=level;
        this.kitchen=kitchen;
        this.source=source;
        this.servingSize=servingSize;
        this.evaluation=evaluation;
        this.time=time;
        this.component=new ArrayList<>();
    }
    //getters and setter
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
    public List<Component> getComponent() {
        return component;
    }
    public void setComponent(List<Component> component) {
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
