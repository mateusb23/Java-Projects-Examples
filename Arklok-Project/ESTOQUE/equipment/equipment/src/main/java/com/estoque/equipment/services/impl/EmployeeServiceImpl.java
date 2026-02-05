package com.estoque.equipment.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estoque.equipment.models.EmployeeModel;
import com.estoque.equipment.repositories.EmployeeRepository;
import com.estoque.equipment.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public EmployeeModel save(EmployeeModel employeeModel) {
        return employeeRepository.save(employeeModel);
    }

    @Override
    public void delete(EmployeeModel employeeModel) {
        employeeRepository.delete(employeeModel);
    }

    @Override
    public Optional<EmployeeModel> findByEmployeeId(UUID employeeId) {
        return employeeRepository.findByEmployeeId(employeeId);
    }

    @Override
    public List<EmployeeModel> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeModel> findByRegistrationNumber(String registrationNumber) {
        return employeeRepository.findByRegistrationNumber(registrationNumber);
    }

    @Override
    public void deleteById(UUID employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public boolean existsByRegistrationNumber(String registrationNumber) {
        return employeeRepository.existsByRegistrationNumber(registrationNumber);
    }

    @Override
    public boolean existsByEmployeeId(UUID employeeId) {
        return employeeRepository.existsByEmployeeId(employeeId);
    }

    @Override
    public boolean existsById(UUID employeeId) {
        return employeeRepository.existsById(employeeId);
    }

    @Override
    public Optional<EmployeeModel> findByTerms_TermId(UUID termId) {
        return employeeRepository.findByTerms_TermId(termId);
    }

    @Override
    public Optional<EmployeeModel> findByTerms_TicketNumber(String ticketNumber) {
        return employeeRepository.findByTerms_TicketNumber(ticketNumber);
    }

    @Override
    public Optional<EmployeeModel> findByTerms_Employee_RegistrationNumber(String registrationNumber) {
        return employeeRepository.findByTerms_Employee_RegistrationNumber(registrationNumber);
    }

}
