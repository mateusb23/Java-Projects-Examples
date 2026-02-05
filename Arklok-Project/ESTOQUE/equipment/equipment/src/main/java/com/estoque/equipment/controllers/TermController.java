package com.estoque.equipment.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.estoque.equipment.dtos.*;
import com.estoque.equipment.enums.EquipamentStatus;
import com.estoque.equipment.enums.EquipmentType;
import com.estoque.equipment.models.*;
import com.estoque.equipment.services.EmployeeService;
import com.estoque.equipment.services.LocationService;
import com.estoque.equipment.services.MonitorService;
import com.estoque.equipment.services.TechnicianService;
import com.estoque.equipment.services.TermService;

@RestController
@RequestMapping("/terms")
public class TermController {

    @Autowired
    TermService termService;
    @Autowired
    LocationService locationService;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    MonitorService monitorService;
    @Autowired
    TechnicianService technicianService;

    @PostMapping
    public ResponseEntity<Object> createTerm(@RequestBody @Valid TermDto dto) {
        LocationModel location = locationService.findByLocationName(dto.getLocation().getLocationName())
                .orElseGet(() -> {
                    var newLocation = new LocationModel();
                    newLocation.setLocationName(dto.getLocation().getLocationName());
                    return locationService.save(newLocation);
                });

        Set<TechnicianModel> technicians = technicianService.findAllByLocation(location);
        if (technicians.isEmpty()) {
            return ResponseEntity.badRequest().body("Nenhum técnico associado à localidade.");
        }
        TechnicianModel technician = technicians.iterator().next();

        EmployeeModel employee = employeeService.findByRegistrationNumber(dto.getEmployee().getRegistrationNumber())
                .orElseGet(() -> {
                    EmployeeModel e = new EmployeeModel();
                    e.setRegistrationNumber(dto.getEmployee().getRegistrationNumber());
                    return employeeService.save(e);
                });

        LocalDate date = LocalDate.parse(dto.getDate(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        TermModel term = new TermModel();
        term.setSerialNumber(dto.getSerialNumber());
        term.setAssetNumber(dto.getAssetNumber());
        term.setInvoiceNumber(dto.getInvoiceNumber());
        term.setTicketNumber(dto.getTicketNumber());
        term.setEquipmentType(EquipmentType.valueOf(dto.getEquipmentType()));
        term.setEquipmentStatus(EquipamentStatus.valueOf(dto.getEquipmentStatus()));
        term.setBrand(dto.getBrand());
        term.setModelComputer(dto.getModelComputer());
        term.setTermDate(date.atStartOfDay());
        term.setCreationDate(LocalDateTime.now());
        term.setLastUpdateDate(LocalDateTime.now());
        term.setLocation(location);
        term.setEmployee(employee);
        term.setTechnician(technician);

        if (dto.getMonitor() != null && dto.getMonitor().getSerialNumber() != null) {
            MonitorModel monitor = monitorService.findBySerialNumber(dto.getMonitor().getSerialNumber())
                    .orElseGet(() -> {
                        var monitorModel = new MonitorModel();
                        monitorModel.setSerialNumber(dto.getMonitor().getSerialNumber());
                        monitorModel.setModelMonitor(dto.getMonitor().getModelMonitor());
                        return monitorService.save(monitorModel);
                    });
            term.setMonitor(monitor);
        }

        termService.save(term);
        return ResponseEntity.ok("Termo salvo com sucesso");
    }
}
