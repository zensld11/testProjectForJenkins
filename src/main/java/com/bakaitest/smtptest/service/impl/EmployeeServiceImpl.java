package com.bakaitest.smtptest.service.impl;

import com.bakaitest.smtptest.dto.EmployeeDto;
import com.bakaitest.smtptest.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public EmployeeDto save(EmployeeDto createEmployeeDTO) {
        if (createEmployeeDTO == null) {
            Errors errors = new BeanPropertyBindingResult(createEmployeeDTO, "ОшибкаСозданияРаботника");
            log.error("Ошибка" + errors);
        }
        return null;
    }
}