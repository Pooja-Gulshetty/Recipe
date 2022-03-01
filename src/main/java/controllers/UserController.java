package controllers;

import domain.User;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import requestsClasses.CreateUserRequest;
import requestsClasses.UpdateUserRequest;
import responsesClassses.CreateUserResponse;
import services.UserService;

import java.util.List;
@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(path = "/users",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CreateUserResponse> createUser(CreateUserRequest createUserRequest) throws Exception {
        CreateUserResponse createUserResponse = userService.createUser(createUserRequest);
        return ResponseEntity.ok(createUserResponse);
    }

    @RequestMapping(path = "/users",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CreateUserResponse> updateUsers(@RequestBody UpdateUserRequest updateUserRequest) throws Exception {
        CreateUserResponse createUserResponse = userService.updateusers(updateUserRequest);
        return ResponseEntity.ok(createUserResponse);
    }
    @RequestMapping(path = "/users",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> userList = userService.findAllUsers();
        return ResponseEntity.ok(userList);
    }
    @RequestMapping(path = "/users",
            method = RequestMethod.DELETE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CreateUserResponse> deleteUsers() {
        return null;

    }
    @RequestMapping(path = "/users",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CreateUserResponse> updateuser() {
        return null;
    }

}