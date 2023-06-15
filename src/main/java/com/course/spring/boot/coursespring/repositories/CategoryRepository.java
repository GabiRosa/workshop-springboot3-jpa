package com.course.spring.boot.coursespring.repositories;

import com.course.spring.boot.coursespring.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long> {


}
