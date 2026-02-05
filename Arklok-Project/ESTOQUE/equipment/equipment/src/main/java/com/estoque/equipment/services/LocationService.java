package com.estoque.equipment.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.estoque.equipment.models.LocationModel;

public interface LocationService {

    Optional<LocationModel> findByLocationId(UUID locationId);

    // Optional<EmployeeModel> findByLocationName(String locationName);

    Optional<LocationModel> findByLocationName(String locationName);

    // EmployeeModel save(LocationModel newLocation);

    LocationModel save(LocationModel locationModel);

    void deleteById(UUID locationId);

    boolean existsByLocationId(UUID locationId);

    boolean existsByLocationName(String locationName);

    boolean existsById(UUID locationId);

    List<LocationModel> findAll();

}
