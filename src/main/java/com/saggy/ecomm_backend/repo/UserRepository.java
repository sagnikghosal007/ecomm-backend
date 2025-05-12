package com.saggy.ecomm_backend.repo;

import com.saggy.ecomm_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    //it will generate this at the runtime
    User findByEmail(String email);
}
