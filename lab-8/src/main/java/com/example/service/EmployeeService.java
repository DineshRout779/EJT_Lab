package com.example.service;

import com.example.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {
    private static final Map<Integer, Employee> employeeDatabase = new HashMap<>();

    public void insertEmployee(Employee employee) {
        employeeDatabase.put(employee.getEmployeeId(), employee);
    }

    public Employee getEmployeeById(int employeeId) {
        return employeeDatabase.get(employeeId);
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeDatabase.values());
    }
}
