package com.estoque.equipment.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estoque.equipment.models.LocationModel;

public interface LocationRepository extends JpaRepository<LocationModel, UUID> {

    Optional<LocationModel> findByLocationId(UUID locationId);

    Optional<LocationModel> findByLocationName(String locationName);

    boolean existsByLocationId(UUID locationId);

    boolean existsByLocationName(String locationName);

}
