package tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import tacocloud.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
