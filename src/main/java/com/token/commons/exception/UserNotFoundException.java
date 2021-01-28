package com.token.commons.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String userId){
        super(userId+"NotFoundException");
    }
}
