package repositories;


import domain.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepositaries extends CrudRepository<User, String> {
    Iterable<User> findAll();

    User findFirstByName(String name);

    User findById(int id);

    User deleteById(int id);

}