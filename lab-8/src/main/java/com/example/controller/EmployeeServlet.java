package com.example.controller;

import com.example.model.Employee;
import com.example.service.EmployeeService;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final EmployeeService employeeService = new EmployeeService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("insert".equals(action)) {
            insertEmployee(request, response);
        } else if ("search".equals(action)) {
            searchEmployee(request, response);
        }
    }

    private void insertEmployee(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        String employeeName = request.getParameter("employeeName");
        String designation = request.getParameter("designation");

        Employee employee = new Employee();
        employee.setEmployeeId(employeeId);
        employee.setEmployeeName(employeeName);
        employee.setDesignation(designation);

        employeeService.insertEmployee(employee);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    private void searchEmployee(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        Employee employee = employeeService.getEmployeeById(employeeId);

        request.setAttribute("employee", employee);
        request.getRequestDispatcher("search-result.jsp").forward(request, response);
    }
}