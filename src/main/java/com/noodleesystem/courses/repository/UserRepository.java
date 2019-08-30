package com.noodleesystem.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.noodleesystem.courses.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{ }
