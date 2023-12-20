package services;

import documents.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import repositories.UserRepository;

import java.util.Optional;


/**
 * Created by: Andrew Lee
 * User service that handles all the logistics of user-repository
 */
@Service
public class UserService {

    UserRepository userRepository;
    public void createUser(User user){
        userRepository.save(user);
    }
}
