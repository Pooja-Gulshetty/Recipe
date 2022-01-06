package domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ingredients")
public class Ingredients {
    @Column(name = "quality")
    private String quality;
    @Column(name = "foodIngredients")
    private String foodIngredients;

    protected  Ingredients(){

    }
    @JsonCreator
    public Ingredients(@JsonProperty("quality") String quality,
                       @JsonProperty("foodIngredients") String foodIngredients) {
        this.quality = quality;
        this.foodIngredients = foodIngredients;
    }

    public String getQuality() {
        return quality;
    }

    public String getFoodIngredients() {
        return foodIngredients;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "quality='" + quality + '\'' +
                ", foodIngredients='" + foodIngredients + '\'' +
                '}';
    }
}

