package com.estoque.equipment.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.estoque.equipment.enums.EquipamentStatus;
import com.estoque.equipment.enums.EquipmentType;
import com.estoque.equipment.enums.LegacyPark;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
import java.io.Serializable;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "TB_TERMS")
public class TermModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID termId;

    @Column(nullable = false, unique = true, length = 20)
    private String serialNumber;

    @Column(nullable = false, length = 10)
    private String assetNumber;

    @Column(nullable = false, length = 9)
    private String invoiceNumber;

    @Column(nullable = false, length = 12)
    private String ticketNumber;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EquipamentStatus equipmentStatus;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private LegacyPark legacyPark;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EquipmentType equipmentType;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDateTime termDate;

    @Column(nullable = false, length = 10)
    private String brand;

    @Column(nullable = false, length = 20)
    private String modelComputer;

    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime creationDate;

    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime lastUpdateDate;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToOne(fetch = FetchType.LAZY, optional = true)
    private MonitorModel monitor;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private LocationModel location;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private TechnicianModel technician;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private EmployeeModel employee;

}
