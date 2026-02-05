package com.estoque.equipment.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import com.estoque.equipment.models.LocationModel;
import com.estoque.equipment.models.TechnicianModel;

public interface TechnicianService {

    Optional<TechnicianModel> findByTechnicianName(String technicianName);

    Set<TechnicianModel> findAllByLocation(LocationModel location);

    Optional<TechnicianModel> findByTechnicianId(UUID technicianId);

    void deleteByTechnicianName(String technicianName);

    void deleteByTechnicianId(UUID technicianId);

    boolean existsByTechnicianId(UUID technicianId);

    boolean existsByTechnicianName(String technicianName);

    boolean existsById(UUID technicianId);

    void deleteById(UUID technicianId);

    void delete(TechnicianModel technicianModel);

    TechnicianModel save(TechnicianModel technicianModel);

    List<TechnicianModel> findAll();

}
