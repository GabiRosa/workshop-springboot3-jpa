package com.course.spring.boot.coursespring.repositories;

import com.course.spring.boot.coursespring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}
