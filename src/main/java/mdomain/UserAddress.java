package mdomain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "useraddress")
public class UserAddress {
    @Column(name = "housename")
    private String housename;
    @Column(name = "housenum")
    private int housenum;
    @Id
    @Column(name = "userId")
    private int userAddressId;

    protected UserAddress() {

    }
@JsonCreator
    public UserAddress(
            @JsonProperty("housename") String housename,
            @JsonProperty("housenum") int housenum,
            @JsonProperty("userAddressId") int userAddressId) {
        this.housename = housename;
        this.housenum = housenum;
        this.userAddressId=userAddressId;
    }

    public String getHouse_name() {
        return housename;
    }

    public int getHouse_num() {
        return housenum;
    }

    public int getUserAddressId() {
        return userAddressId;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "house_name='" + housename + '\'' +
                ", house_num=" + housenum +
                '}';
    }



}
