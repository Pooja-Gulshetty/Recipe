package controllers;

import mdomain.UserAddress;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.UserAddressService;

import java.util.List;

@Controller
public class UserAddressController {
    private final UserAddressService userAddressService;

    public UserAddressController(UserAddressService userAddressService) {
        this.userAddressService = userAddressService;
    }

    @RequestMapping(path = "users/{user}/address",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserAddress>> getuseraddress(@PathVariable("users") String userName) {
        List<UserAddress> userAddressList = userAddressService.finduseraddress(userName);
        return ResponseEntity.ok(userAddressList);
    }
}

   // @RequestMapping(path = "users/{user}/address",
          //  method = RequestMethod.PUT,
           // produces = MediaType.APPLICATION_JSON_VALUE)
    // public ResponseEntity<List<UserAddress>>updateUserAddress(@PathVariable("users")String userName){
       // List<UserAddress> userAddressList=userAddressService.updateUserAddresss(userName);
      //  return ResponseEntity.ok(userAddressList);
    //}
    //  @RequestMapping(path = "users/{user}/address",
    //method = RequestMethod.POST,
  //  produces = MediaType.APPLICATION_JSON_VALUE,
    //consumes = MediaType.APPLICATION_JSON_VALUE)
 ///   public ResponseEntity<>
//}
