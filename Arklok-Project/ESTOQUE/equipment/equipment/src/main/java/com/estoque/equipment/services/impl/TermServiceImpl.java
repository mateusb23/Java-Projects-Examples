package com.estoque.equipment.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.estoque.equipment.models.TermModel;
import com.estoque.equipment.repositories.TermRepository;
import com.estoque.equipment.services.TermService;

@Service
public class TermServiceImpl implements TermService {

    @Autowired
    TermRepository termRepository;

    @Override
    public void delete(TermModel term) {
        termRepository.delete(term);
    }

    @Override
    public TermModel save(TermModel term) {
        return termRepository.save(term);
    }

    @Override
    public List<TermModel> findAll() {
        return termRepository.findAll();
    }

    @Override
    public Optional<TermModel> findById(UUID termId) {
        return termRepository.findById(termId);
    }

    @Override
    public Optional<TermModel> findBySerialNumber(String serialNumber) {
        return termRepository.findByTicketNumber(serialNumber);
    }

    @Override
    public Optional<TermModel> findByTicketNumber(String ticketNumber) {
        return termRepository.findByTicketNumber(ticketNumber);
    }

    // ---> APENAS UM PROTÓTIPO DE IMPLEMENTAÇÃO PARA BUSCAR O TERMO PELO NÚMERO DE
    // MATRÍCULA DO FUNCIONÁRIO <---
    // PARA BUSCAR O TERMO PELO ID DO FUNCIONÁRIO, UTILIZE O MÉTODO
    // findByEmployeeId(UUID employeeId) NO EmployeeRepository
    @Override
    public List<TermModel> findByEmployeeRegistrationNumber(String registrationNumber) {
        Optional<TermModel> termOptional = termRepository.findByEmployeeRegistrationNumber(registrationNumber);
        return termOptional.map(List::of).orElse(List.of());
    }

    @Override
    public Optional<TermModel> findByTermId(UUID termId) {
        return termRepository.findByTermId(termId);
    }

    @Override
    public void deleteById(UUID termId) {
        termRepository.deleteById(termId);
    }

    @Override
    public boolean existsById(UUID termId) {
        return termRepository.existsById(termId);
    }

}
