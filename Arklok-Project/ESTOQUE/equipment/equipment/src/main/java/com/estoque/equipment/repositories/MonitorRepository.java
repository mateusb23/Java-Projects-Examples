package com.estoque.equipment.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estoque.equipment.models.MonitorModel;

public interface MonitorRepository extends JpaRepository<MonitorModel, UUID> {

    Optional<MonitorModel> findBySerialNumber(String serialNumber);

    Optional<MonitorModel> findByModelMonitor(String modelMonitor);

    Optional<MonitorModel> findByMonitorId(UUID monitorId);

    boolean existsBySerialNumber(String serialNumber);

    boolean existsByModelMonitor(String modelMonitor);

}
