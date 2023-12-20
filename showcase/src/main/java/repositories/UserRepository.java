package repositories;

import documents.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by: Andrew Lee
 * User Repository that extends to MongoRepository functions
 */
@Repository
public interface UserRepository extends MongoRepository<User, Long> {

}
