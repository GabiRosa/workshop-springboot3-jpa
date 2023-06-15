package com.course.spring.boot.coursespring.resource;

import com.course.spring.boot.coursespring.entity.Product;
import com.course.spring.boot.coursespring.entity.User;
import com.course.spring.boot.coursespring.service.ProductService;
import com.course.spring.boot.coursespring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
        public ResponseEntity<Product> findById(@PathVariable Long id) {
            Product obj = service.findById(id);
            return ResponseEntity.ok(obj);

    }

}
