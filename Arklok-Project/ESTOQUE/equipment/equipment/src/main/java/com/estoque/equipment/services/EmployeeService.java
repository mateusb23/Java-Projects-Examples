package com.estoque.equipment.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.estoque.equipment.models.EmployeeModel;

public interface EmployeeService {

    EmployeeModel save(EmployeeModel employeeModel);

    void delete(EmployeeModel employeeModel);

    Optional<EmployeeModel> findByEmployeeId(UUID employeeId);

    List<EmployeeModel> findAll();

    Optional<EmployeeModel> findByRegistrationNumber(String registrationNumber);

    void deleteById(UUID employeeId);

    boolean existsByRegistrationNumber(String registrationNumber);

    boolean existsByEmployeeId(UUID employeeId);

    boolean existsById(UUID employeeId);

    Optional<EmployeeModel> findByTerms_TermId(UUID termId);

    Optional<EmployeeModel> findByTerms_TicketNumber(String ticketNumber);

    Optional<EmployeeModel> findByTerms_Employee_RegistrationNumber(String registrationNumber);

}
