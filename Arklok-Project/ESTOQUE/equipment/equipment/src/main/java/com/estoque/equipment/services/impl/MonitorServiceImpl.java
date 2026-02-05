package com.estoque.equipment.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estoque.equipment.models.MonitorModel;
import com.estoque.equipment.repositories.MonitorRepository;
import com.estoque.equipment.services.MonitorService;

@Service
public class MonitorServiceImpl implements MonitorService {

    @Autowired
    MonitorRepository monitorRepository;

    @Override
    public MonitorModel save(MonitorModel monitorModel) {
        return monitorRepository.save(monitorModel);
    }

    @Override
    public void delete(MonitorModel monitorModel) {
        monitorRepository.delete(monitorModel);
    }

    @Override
    public List<MonitorModel> findAll() {
        return monitorRepository.findAll();
    }

    @Override
    public Optional<MonitorModel> findByMonitorId(UUID monitorId) {
        return monitorRepository.findByMonitorId(monitorId);
    }

    @Override
    public Optional<MonitorModel> findBySerialNumber(String serialNumber) {
        return monitorRepository.findBySerialNumber(serialNumber);
    }

    @Override
    public Optional<MonitorModel> findByModelMonitor(String modelMonitor) {
        return monitorRepository.findByModelMonitor(modelMonitor);
    }

    @Override
    public void deleteById(UUID monitorId) {
        monitorRepository.deleteById(monitorId);
    }

    @Override
    public boolean existsBySerialNumber(String serialNumber) {
        return monitorRepository.existsBySerialNumber(serialNumber);
    }

    @Override
    public boolean existsByModelMonitor(String modelMonitor) {
        return monitorRepository.existsByModelMonitor(modelMonitor);
    }

}
