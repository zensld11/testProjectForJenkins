package com.bakaitest.smtptest.service;

import com.bakaitest.smtptest.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto save(EmployeeDto createEmployeeDTO);
}