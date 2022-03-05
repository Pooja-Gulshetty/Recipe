package response;

public class UserDto {
    private  String userName;
    private  String email;
    private
    String userId;

    public UserDto(String userName, String email,String userId) {
        this.userName = userName;
        this.email = email;
        this.userId=userId;

    }

    public String getUserName() {

        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
