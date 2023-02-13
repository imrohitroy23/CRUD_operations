package com.example.demo.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.demo.Model.User;

public interface UserRepository extends JpaRepository<User,Long>{
    
}
