package domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dishes")
public class Dishes {
    @Column(name = "recipe_name")
    private String recipeName;
    @Column(name = "country_name")
    private String countryName;
    @Column(name = "type")
    private String type;
    @Column(name = "preparation")
    private String preparation;

    protected Dishes() {

    }

    @JsonCreator
    public Dishes(@JsonProperty("recipe_name") String recipeName,
                  @JsonProperty("country_name") String countryName,
                  @JsonProperty("type") String type,
                  @JsonProperty("preparation") String preparation) {
        this.recipeName = recipeName;
        this.countryName = countryName;
        this.type = type;
        this.preparation = preparation;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getType() {
        return type;
    }

    public String getPreparation() {
        return preparation;
    }

    @Override
    public String toString() {
        return "Dishes{" +
                "recipeName='" + recipeName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", type='" + type + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }
}
