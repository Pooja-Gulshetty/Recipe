package repositories;

import mdomain.UserAddress;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserAddressRepository extends CrudRepository<String, UserAddress> {
    @Query("select a from UserAddress a where a.userAddressId =:userAddressId")
    List<UserAddress> getAllUserAddress(String userAddressId);
    @Query("select a from UserAddress a where a.userAddressId=:userAddressId")
    List<UserAddress>updateUserAddress(String userAddresId);

}
