package com.estoque.equipment.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estoque.equipment.models.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, UUID> {

    Optional<EmployeeModel> findByRegistrationNumber(String registrationNumber);

    Optional<EmployeeModel> findByEmployeeId(UUID employeeId);

    boolean existsByRegistrationNumber(String registrationNumber);

    boolean existsByEmployeeId(UUID employeeId);

    Optional<EmployeeModel> findByTerms_TermId(UUID termId);

    Optional<EmployeeModel> findByTerms_TicketNumber(String ticketNumber);

    Optional<EmployeeModel> findByTerms_Employee_RegistrationNumber(String registrationNumber);

}