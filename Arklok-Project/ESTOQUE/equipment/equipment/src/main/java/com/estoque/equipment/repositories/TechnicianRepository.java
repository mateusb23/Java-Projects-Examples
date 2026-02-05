package com.estoque.equipment.repositories;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estoque.equipment.models.LocationModel;
import com.estoque.equipment.models.TechnicianModel;

public interface TechnicianRepository extends JpaRepository<TechnicianModel, UUID> {

    Optional<TechnicianModel> findByTechnicianName(String technicianName);

    Set<TechnicianModel> findAllByLocation(LocationModel location);

    // Set<TechnicianModel> findAllByLocationIn(Set<LocationModel> locations);

    Optional<TechnicianModel> findByTechnicianId(UUID technicianId);

    void deleteByTechnicianName(String technicianName);

    void deleteByTechnicianId(UUID technicianId);

    boolean existsByTechnicianId(UUID technicianId);

    boolean existsByTechnicianName(String technicianName);

}
