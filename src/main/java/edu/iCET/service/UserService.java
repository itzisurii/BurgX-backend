package edu.iCET.service;

import edu.iCET.model.dto.UserDTO;
import edu.iCET.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDTO getUser(String username) {
        return null;
    }
}
