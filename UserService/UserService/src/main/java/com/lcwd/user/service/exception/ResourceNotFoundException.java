package com.lcwd.user.service.exception;

public class ResourceNotFoundException extends RuntimeException{
    //extra props that u want to manage
    public ResourceNotFoundException(){
        super("Resource not found on server!");

    }
    public ResourceNotFoundException(String message){

    }
}
