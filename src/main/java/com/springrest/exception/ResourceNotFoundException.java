package com.springrest.exception;


public class ResourceNotFoundException extends RuntimeException{

    private String resourceName;
    private String fieldName;
    private  String fieldValue;
}
