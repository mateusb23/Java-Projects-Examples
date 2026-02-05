package com.estoque.equipment.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.estoque.equipment.models.TermModel;

public interface TermService {

    TermModel save(TermModel term);

    void delete(TermModel term);

    List<TermModel> findAll();

    Optional<TermModel> findById(UUID termId);

    Optional<TermModel> findByTermId(UUID termId);

    Optional<TermModel> findByTicketNumber(String ticketNumber);

    List<TermModel> findByEmployeeRegistrationNumber(String registrationNumber);

    void deleteById(UUID termId);

    boolean existsById(UUID termId);

    Optional<TermModel> findBySerialNumber(String serialNumber);

    // TermModel findByTermId(String termId);
}
