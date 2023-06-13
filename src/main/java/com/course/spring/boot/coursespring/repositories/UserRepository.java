package com.course.spring.boot.coursespring.repositories;

import com.course.spring.boot.coursespring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
