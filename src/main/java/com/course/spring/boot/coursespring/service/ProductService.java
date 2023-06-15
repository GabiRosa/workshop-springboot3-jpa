package com.course.spring.boot.coursespring.service;

import com.course.spring.boot.coursespring.entity.Product;
import com.course.spring.boot.coursespring.entity.User;
import com.course.spring.boot.coursespring.repositories.ProductRepository;
import com.course.spring.boot.coursespring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();

    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
