package domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
    @Id
    @Column(name = "userId")
    private int userId;

    @Column(name = "phoneNumber")
    private int phoneNumber;


    protected User() {

    }

    @JsonCreator
    public User(@JsonProperty("name") String name,
                @JsonProperty("email") String email,
                @JsonProperty("userId") int userId,
                @JsonProperty("phoneNumber") int phoneNumber) {

        this.name = name;
        this.email = email;
        this.userId=userId;
        this.phoneNumber = phoneNumber;
    }

    public String getname() {
        return name;
    }

    public String getemail() {
        return email;
    }

    public int getuserId(){return userId;}

    public int getphoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", userId='" + userId + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}