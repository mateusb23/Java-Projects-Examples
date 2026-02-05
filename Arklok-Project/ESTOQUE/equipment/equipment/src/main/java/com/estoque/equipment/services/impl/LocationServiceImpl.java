package com.estoque.equipment.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estoque.equipment.models.LocationModel;
import com.estoque.equipment.repositories.LocationRepository;
import com.estoque.equipment.services.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    LocationRepository locationRepository;

    @Override
    public Optional<LocationModel> findByLocationId(UUID locationId) {
        return locationRepository.findByLocationId(locationId);
    }

    @Override
    public Optional<LocationModel> findByLocationName(String locationName) {
        return locationRepository.findByLocationName(locationName);
    }

    @Override
    public List<LocationModel> findAll() {
        return locationRepository.findAll();
    }

    @Override
    public LocationModel save(LocationModel locationModel) {
        return locationRepository.save(locationModel);
    }

    @Override
    public void deleteById(UUID locationId) {
        locationRepository.deleteById(locationId);
    }

    @Override
    public boolean existsByLocationId(UUID locationId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsByLocationId'");
    }

    @Override
    public boolean existsByLocationName(String locationName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsByLocationName'");
    }

    @Override
    public boolean existsById(UUID locationId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

}
