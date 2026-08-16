package edu.iCET.service;

import edu.iCET.model.dto.UserDTO;
import edu.iCET.model.entity.User;
import edu.iCET.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDTO getUser(String username) {

        User user = userRepository.findByUsername(username);

        return new UserDTO(
                user.getUsername(),
                user.getPassword()
        );
    }
}
