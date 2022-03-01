package requestsClasses;

public class CreateUserRequest {
    private int userId;
    private String name;
    private String email;
    private int phoneNumber;

    public CreateUserRequest(int userId, String name, String email, int phoneNumber) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getemail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

}