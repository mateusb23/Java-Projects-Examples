package com.estoque.equipment.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estoque.equipment.models.TermModel;

public interface TermRepository extends JpaRepository<TermModel, UUID> {

    Optional<TermModel> findByTermId(UUID termId);

    Optional<TermModel> findByTicketNumber(String ticketNumber);

    Optional<TermModel> findByEmployeeRegistrationNumber(String registrationNumber);

}
