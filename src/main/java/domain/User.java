package domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Column(name = "name")
    private String name;
    @Column(name = "Email")
    private String email;
    @Column(name = "phoneNumber")
    @Id
    private int phooneNumber;

    protected User() {

    }
    @JsonCreator
    public User(@JsonProperty("name") String name,
                @JsonProperty("Email") String email,
                @JsonProperty("phoneNumber") int phooneNumber) {
        this.name = name;
        this.email = email;
        this.phooneNumber = phooneNumber;
    }

    public String getname() {
        return name;
    }

    public String getemail() {
        return email;
    }

    public int getPhooneNumber() {
        return phooneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", phooneNumber=" + phooneNumber +
                '}';
    }
}