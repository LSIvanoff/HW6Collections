package com.skypro.HW6Collections.exception;

public class EmployeeStorageIsFullList extends  RuntimeException {
    public EmployeeStorageIsFullList(String message) {
        super(message);
    }
}
