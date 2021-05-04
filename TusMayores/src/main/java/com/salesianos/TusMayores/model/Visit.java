package com.salesianos.TusMayores.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@NoArgsConstructor @AllArgsConstructor
@Data
@Entity
public class Visit {

    @Id @GeneratedValue
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime fechaReserva;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime fechaInicio;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime fechaFin;

    private String observaciones;

    private boolean confirmada;
}
