package be.qnh.apps.MyRecipes.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Embeddable
public class Ingredient implements Serializable {
    private static final long serialVersionID = 56498795462753L;

    @Id
    @GeneratedValue
    private Long id;

    @Basic(optional = false)
    private String name;
    private String quantity;

    private Component component;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
