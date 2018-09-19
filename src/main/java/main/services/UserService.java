package main.services;

import main.entity.User;
import main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    public User saveUser(User user){
        User user1 = new User(user.getName(),user.getEmail());
        return user1;
    }


}
