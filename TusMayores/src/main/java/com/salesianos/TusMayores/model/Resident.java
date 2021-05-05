package com.salesianos.TusMayores.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@Data
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

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToMany(mappedBy = "resident", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Familiar> familiarList = new ArrayList<>();


    public void addFamiliar(Familiar f) {
        f.setResident(this);
        this.familiarList.add(f);
    }

    public void removeFamiliar(Familiar f) {
        this.familiarList.remove(f);
        f.setResident(null);
    }



}
