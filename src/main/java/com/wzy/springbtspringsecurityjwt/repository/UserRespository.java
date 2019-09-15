package com.wzy.springbtspringsecurityjwt.repository;


import com.wzy.springbtspringsecurityjwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository {
    User findByUsername(String username);
}
