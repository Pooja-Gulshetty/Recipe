package response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserResponse {
    private  List<UserDto> userDtos;

    @JsonCreator
    public UserResponse(@JsonProperty("users") List<UserDto> userDtos) {
        this.userDtos = userDtos;
    }

    public List<UserDto> getUserDtos() {
        return userDtos;
    }

    public void setUserDtos(List<UserDto> userDtos) {
        this.userDtos = userDtos;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "userDtos=" + userDtos +
                ", getUserDtos=" + getUserDtos() +
                '}';
    }
}
