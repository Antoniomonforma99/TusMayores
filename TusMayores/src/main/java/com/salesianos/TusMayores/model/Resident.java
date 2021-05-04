package com.salesianos.TusMayores.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor
@Entity
public class Resident {

    private static final long serialVersionUId = 1L;

    @Id @GeneratedValue
    private Long id;

    private String nombre;

    private String apellidos;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNac;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaEntradaResi;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaSalida;

    private String causaSalida;



}
