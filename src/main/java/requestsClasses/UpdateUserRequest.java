package requestsClasses;

public class UpdateUserRequest {
    private int userId;
    private String name;
    private String email;
    private int phoneNumber;

    public UpdateUserRequest(int userId, String name, String email, int phoneNumber) {
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

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
