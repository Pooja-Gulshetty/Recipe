package repositories;

import domain.Dishes;
import org.springframework.data.repository.CrudRepository;

public interface DishesRepositeres extends CrudRepository<Dishes,String> {
}
