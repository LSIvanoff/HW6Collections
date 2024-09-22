package com.skypro.HW6Collections.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeAlreadyAddedInList extends RuntimeException {


    public EmployeeAlreadyAddedInList(String added) {
    }
}
