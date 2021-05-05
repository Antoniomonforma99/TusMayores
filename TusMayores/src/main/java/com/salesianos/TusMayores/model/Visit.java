package com.salesianos.TusMayores.model;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    @ManyToOne
    private Resident resident;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToMany(mappedBy = "visitList", fetch = FetchType.EAGER)
    private List<Familiar> familiarList = new ArrayList<>();
}
