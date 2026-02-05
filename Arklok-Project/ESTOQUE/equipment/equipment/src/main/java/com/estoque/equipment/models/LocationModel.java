package com.estoque.equipment.models;

import lombok.Data;

import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "TB_LOCATIONS")
public class LocationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID locationId;

    @Column(nullable = false, unique = true)
    private String locationName;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "location", fetch = FetchType.LAZY)
    @Fetch(FetchMode.SUBSELECT)
    private Set<TermModel> terms;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "location", fetch = FetchType.LAZY)
    @Fetch(FetchMode.SUBSELECT)
    private Set<TechnicianModel> technicians;
}