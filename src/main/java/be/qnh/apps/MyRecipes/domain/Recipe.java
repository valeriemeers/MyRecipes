package be.qnh.apps.MyRecipes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Recipe {
    @Id
    @GeneratedValue
    private long id;


    private String name;
    private String description;
    private String course;
    private String category;
    private String level;
    private String kitchen;
    private String source;
    private int servingSize;
    private Timing time;
    private int evaluation;
    private Component component;

}
