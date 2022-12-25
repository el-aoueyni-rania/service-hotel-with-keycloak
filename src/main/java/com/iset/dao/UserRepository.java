package com.iset.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iset.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
