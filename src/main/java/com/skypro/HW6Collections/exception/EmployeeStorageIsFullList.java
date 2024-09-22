package com.skypro.HW6Collections.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)

public class EmployeeStorageIsFullList extends  RuntimeException {

    public EmployeeStorageIsFullList(String storageIsFull) {
    }
}
