package com.estoque.equipment.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.estoque.equipment.models.MonitorModel;

public interface MonitorService {

    MonitorModel save(MonitorModel monitorModel);

    void delete(MonitorModel monitorModel);

    List<MonitorModel> findAll();

    Optional<MonitorModel> findByMonitorId(UUID monitorId);

    Optional<MonitorModel> findBySerialNumber(String serialNumber);

    Optional<MonitorModel> findByModelMonitor(String modelMonitor);

    void deleteById(UUID monitorId);

    boolean existsBySerialNumber(String serialNumber);

    boolean existsByModelMonitor(String modelMonitor);

}
