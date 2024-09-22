package com.skypro.HW6Collections.service;

import com.skypro.HW6Collections.employee.Employee;
import com.skypro.HW6Collections.exception.EmployeeAlreadyAddedInList;
import com.skypro.HW6Collections.exception.EmployeeNotFoundInList;
import com.skypro.HW6Collections.exception.EmployeeStorageIsFullList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements com.skypro.HW6Collections.service.EmployeeService {
    private final int STORAGE_SIZE = 5;
    private final List<Employee> employees =  List.of(
            new Employee(" Иван  ", "Иванов" ),
            new Employee(" Семен  ", "Горбунков "),
            new Employee("Петр  ", " Петров"),
            new Employee(" Николай ",  "Николаев"),
            new Employee("  Федор  ", "Федоров"));

    @Override
    public Employee addEmployee(String name, String lastName) throws EmployeeStorageIsFullList, EmployeeAlreadyAddedInList{
        Employee employee = new Employee(name, lastName);


        if (employees.size() == STORAGE_SIZE) {
            throw new EmployeeStorageIsFullList("Хранилище заполнено");
        }

        if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedInList("Сотрудник уже есть в хранилище");
        }

        employees.add(employee);
        return employee;

    }


    @Override

    public Employee removeEmployee(String name, String lastName) throws EmployeeNotFoundInList{
        Employee employee = new Employee(name, lastName);

        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundInList("Такого  сотрудника нет в хранилище");
        }
        employees.remove(employee);

        return employee;
    }
    @Override
    public Employee findEmployee(String name, String lastName) throws EmployeeNotFoundInList {
        Employee employeeFind = new Employee(name, lastName);

        if (!employees.contains(employeeFind)) {
            throw new EmployeeNotFoundInList("Такого  сотрудника нет в хранилище");
        }
        for (Employee employee : employees) {
            if (employee.equals(employeeFind)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public List <Employee> getAllEmployees() {
        return employees;

    }
}