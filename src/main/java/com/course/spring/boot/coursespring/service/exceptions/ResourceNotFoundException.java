package com.course.spring.boot.coursespring.service.exceptions;

import jakarta.annotation.Resource;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }
}
