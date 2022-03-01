package responsesClassses;

import lombok.Data;

@Data

public class CreateUserResponse {
    private int userId;
    private String name;
    private String email;
    private int phoneNumber;


}
