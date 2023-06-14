package com.course.spring.boot.coursespring.repositories;

import com.course.spring.boot.coursespring.entity.Order;
import com.course.spring.boot.coursespring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
