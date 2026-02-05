package com.estoque.equipment.dtos;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class TermDto {

    @NotBlank
    private String serialNumber;
    private String assetNumber;
    private String invoiceNumber;
    private String ticketNumber;
    @NotBlank
    private String equipmentType;
    @NotBlank
    private String equipmentStatus;
    @NotBlank
    private String brand;
    @NotBlank
    private String modelComputer;
    private String date;
    private MonitorDto monitor;
    @NotBlank
    private LocationDto location;
    @NotBlank
    private EmployeeDto employee;
    private TechnicianDto technician; // Opcional - usado apenas para termo de devolução ou para criação de usuário
                                      // por meio de um ADM pelo postman ou implementação de API externa
    // private String legacyPark; // Opcional - usado apenas para termo de devolução

}
