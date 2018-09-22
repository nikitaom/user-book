package main.services;

import main.entity.User;
import main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void deleteUserById(long id) {
        userRepository.delete((int) id);

    }

    public User findById(long id) {
        return userRepository.findOne((int) id);
    }
}
