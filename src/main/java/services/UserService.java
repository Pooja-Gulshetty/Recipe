package services;

import domain.User;
import repositories.UserRepositaries;
import requestsClasses.CreateUserRequest;
import requestsClasses.UpdateUserRequest;
import responsesClassses.CreateUserResponse;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private UserRepositaries userRepositaries;

    public UserService(UserRepositaries userRepositaries) {
        this.userRepositaries = userRepositaries;
    }

    public CreateUserResponse createUser(CreateUserRequest createUserRequest) {
        User ur = userRepositaries.findFirstByName(createUserRequest.getName());

        if (ur != null) {
            throw new RuntimeException(String.format("User name [%s] already exists", createUserRequest.getName()));
        }

        User user = new User(createUserRequest.getName(), createUserRequest.getemail(), createUserRequest.getUserId(), createUserRequest.getPhoneNumber());
        userRepositaries.save(user);
        return getResponse(user);
    }

    private CreateUserResponse getResponse(User user) {
        return getCreateUserResponse(user.getuserId(), user.getname(), user.getemail(),
                user.getphoneNumber());
    }

    private CreateUserResponse getCreateUserResponse(int userId, String name, String Email, int phoneNumber) {
        CreateUserResponse createUserResponse = new CreateUserResponse();
        createUserResponse.setUserId(userId);
        createUserResponse.setEmail(Email);
        createUserResponse.setName(name);
        createUserResponse.setPhoneNumber(phoneNumber);
        return createUserResponse;
    }

    public CreateUserResponse updateusers(UpdateUserRequest updateUserRequest) throws Exception {
        User ur = userRepositaries.findById(updateUserRequest.getUserId());
        if (ur == null) {
            String message = String.format("user %s not found", updateUserRequest.getUserId());
            throw new Exception(message);
        }
        CreateUserResponse createUserResponse = new CreateUserResponse();
        createUserResponse.setUserId(ur.getuserId());
        createUserResponse.setName(updateUserRequest.getName());
        createUserResponse.setEmail(updateUserRequest.getEmail());
        createUserResponse.setPhoneNumber(updateUserRequest.getPhoneNumber());

        userRepositaries.save(ur);

        // convert domain object to response
        CreateUserResponse createUserResponse1 = new CreateUserResponse();
        return createUserResponse;
    }


    public List<User> findAllUsers() {
        Iterable<User> users = userRepositaries.findAll();
        List<User> responses = new ArrayList<>();
        for (User user : users) {
            CreateUserResponse createUserResponse = getCreateUserResponse(user.getuserId(), user.getname(),
                    user.getemail(), user.getphoneNumber());
            responses.add(user);
        }
        return responses;
    }

    public CreateUserResponse deleteUsers(){
        return  null;
    }
}