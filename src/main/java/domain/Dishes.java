package domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "dishes")
public class Dishes {
    @Column(name = "recipename")
    private String recipename;
    @Column(name = "countryname")
    private String countryname;
    @Column(name = "foodtype")
    private String foodtype;
    @Column(name = "preparation")
    private String preparation;
    @Id
    private Long id;
    //private List<Ingredients>ingredients;

    protected Dishes() {

    }

    @JsonCreator
    public Dishes(@JsonProperty("recipename") String recipename,
                  @JsonProperty("countryName") String countryname,
                  @JsonProperty("foodtype") String foodtype,
                  @JsonProperty("preparation") String preparation,

                  @JsonProperty("ingredients") List<Ingredients> ingredients) {
        this.recipename = recipename;
        this.countryname = countryname;
        this.foodtype = foodtype;
        this.preparation = preparation;
        //this.ingredients = ingredients;
    }

    public String getRecipename() {
        return recipename;
    }

    public String getCountryname() {
        return countryname;
    }

    public String getFoodtype() {
        return foodtype;
    }

    public String getPreparation() {
        return preparation;
    }

   // public List<Ingredients> getIngredients() {
        //return ingredients;
    //}

    @Override
    public String toString() {
        return "Dishes{" +
                "recipename='" + recipename + '\'' +
                ", countryname='" + countryname + '\'' +
                ", foodtype='" + foodtype + '\'' +
                ", preparation='" + preparation + '\'' +
                //", ingredients=" + ingredients +
                '}';
    }

    public void setRecipename(String recipename) {
        this.recipename = recipename;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public void setFoodtype(String foodtype) {
        this.foodtype = foodtype;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    // public void setIngredients(List<Ingredients> ingredients) {
      //  this.ingredients = ingredients;
    }

   // public void setId(Long id) {
        //this.id = id;
  //  }

    //public Long getId() {
      //  return id;
  //  }
//}
