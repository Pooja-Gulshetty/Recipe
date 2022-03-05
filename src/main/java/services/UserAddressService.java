package services;

import mdomain.UserAddress;
import org.springframework.web.client.RestTemplate;
import repositories.UserAddressRepository;
import response.UserDto;
import response.UserResponse;

import java.util.List;

public class UserAddressService {
    private UserAddressRepository userAddressRepository;
    private final RestTemplate restTemplate;

    public UserAddressService(UserAddressRepository userAddressRepository,
                              RestTemplate restTemplate) {
        this.userAddressRepository = userAddressRepository;
        this.restTemplate = restTemplate;
    }


    public List<UserAddress> finduseraddress(String userName) {
        //here we have to create url
        String url = "http://192.168.2.119:8080/users";
        UserResponse response = restTemplate.getForObject(url, UserResponse.class);
        List<UserDto> userDtoList = response.getUserDtos();
        for (int i = 0; i < userDtoList.size(); i++) {
            UserDto userDto = userDtoList.get(i);
            //locale root confusion
            if (userDto.getUserName().contains(userName)) {
                return userAddressRepository.getAllUserAddress(userDto.getUserId());
            }
        }
        throw new RuntimeException("Not found " + userName);
    }


    //public  List<UserAddress> updateUserAddresss(String userName) {
    // String url = "http://192.168.2.119:8080/users";
    //RestTemplate restTemplate=new RestTemplate(url,);
    //UserResponse userResponse=new UserResponse();


    //}


}