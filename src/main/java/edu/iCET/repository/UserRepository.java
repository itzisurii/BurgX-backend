package edu.iCET.repository;

import edu.iCET.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {

    User findByUsername(String username);
}
