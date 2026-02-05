package com.estoque.equipment.models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "TB_MONITORS")
public class MonitorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID monitorId;

    @Column(nullable = false, unique = true, length = 20)
    private String serialNumber;

    @Column(nullable = false, length = 30)
    private String modelMonitor;

    @OneToOne(mappedBy = "monitor", fetch = FetchType.LAZY)
    private TermModel term;

}
