import mdomain.UserAddress;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;
import repositories.UserAddressRepository;
import response.UserDto;
import response.UserResponse;
import services.UserAddressService;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.testng.Assert.assertEquals;

public class SimpleTest {

    @Test
    public void testFindAllUser() {

        RestTemplate restTemplate = Mockito.mock(RestTemplate.class);
        List<UserDto> users = new ArrayList<>();
        UserDto pooja = new UserDto("Pooja", "pooja", "1");
        users.add(pooja);
        UserResponse userResponse = new UserResponse(users);
        Mockito.when(restTemplate.getForObject(eq("http://192.168.2.119:8080/users"), eq(UserResponse.class))).thenReturn(userResponse);


        UserAddressRepository repository = Mockito.mock(UserAddressRepository.class);
        List<UserAddress> addresses = new ArrayList<>();
        UserAddress address = new UserAddress("Shanti nilaya", 92, 1);
        addresses.add(address);
        Mockito.when(repository.getAllUserAddress(eq("1"))).thenReturn(addresses);

        UserAddressService service = new UserAddressService(repository, restTemplate);
        List<UserAddress> resultAddresses = service.finduseraddress("Poo");

        assertEquals(addresses, resultAddresses);
    }

}