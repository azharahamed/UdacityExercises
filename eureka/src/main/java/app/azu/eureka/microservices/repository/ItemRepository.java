package app.azu.eureka.microservices.repository;

import app.azu.eureka.microservices.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
