package com.estoque.equipment.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estoque.equipment.models.LocationModel;
import com.estoque.equipment.models.TechnicianModel;
import com.estoque.equipment.repositories.TechnicianRepository;
import com.estoque.equipment.services.TechnicianService;

@Service
public class TechnicianServiceImpl implements TechnicianService {

    @Autowired
    TechnicianRepository technicianRepository;

    @Override
    public Optional<TechnicianModel> findByTechnicianName(String technicianName) {
        return technicianRepository.findByTechnicianName(technicianName);
    }

    @Override
    public Optional<TechnicianModel> findByTechnicianId(UUID technicianId) {
        return technicianRepository.findByTechnicianId(technicianId);
    }

    @Override
    public Set<TechnicianModel> findAllByLocation(LocationModel location) {
        return technicianRepository.findAllByLocation(location);
    }

    @Override
    public void deleteByTechnicianName(String technicianName) {
        technicianRepository.deleteByTechnicianName(technicianName);
    }

    @Override
    public void deleteByTechnicianId(UUID technicianId) {
        technicianRepository.deleteByTechnicianId(technicianId);
    }

    @Override
    public boolean existsByTechnicianId(UUID technicianId) {
        return technicianRepository.existsByTechnicianId(technicianId);
    }

    @Override
    public boolean existsByTechnicianName(String technicianName) {
        return technicianRepository.existsByTechnicianName(technicianName);
    }

    @Override
    public boolean existsById(UUID technicianId) {
        return technicianRepository.existsById(technicianId);
    }

    @Override
    public void deleteById(UUID technicianId) {
        technicianRepository.deleteByTechnicianId(technicianId);
    }

    @Override
    public void delete(TechnicianModel technicianModel) {
        technicianRepository.delete(technicianModel);
    }

    @Override
    public TechnicianModel save(TechnicianModel technicianModel) {
        return technicianRepository.save(technicianModel);
    }

    @Override
    public List<TechnicianModel> findAll() {
        return technicianRepository.findAll();
    }

}
