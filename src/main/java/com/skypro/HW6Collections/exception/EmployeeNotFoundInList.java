package com.skypro.HW6Collections.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFoundInList extends RuntimeException {

    public EmployeeNotFoundInList(String notFound) {
    }
}
