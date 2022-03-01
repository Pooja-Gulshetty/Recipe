package domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingredients")
public class Ingredients {
    @Column(name = "quantity")
    private String quantity;
    @Column(name = "foodIngredients")
    private String foodIngredients;
    @Column(name = "id")
    @Id
    private Long id;

    protected  Ingredients(){

    }
    @JsonCreator
    public Ingredients(@JsonProperty("quantity") String quality,
                       @JsonProperty("name") String foodIngredients) {
        this.quantity = quality;
        this.foodIngredients = foodIngredients;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getFoodIngredients() {
        return foodIngredients;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "quality='" + quantity + '\'' +
                ", foodIngredients='" + foodIngredients + '\'' +
                '}';
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setFoodIngredients(String foodIngredients) {
        this.foodIngredients = foodIngredients;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

