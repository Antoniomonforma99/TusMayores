package com.salesianos.TusMayores.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Familiar extends User {

    private static final long serialVersionUId = 1L;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaAlta;


    private String dni;

    @ManyToOne
    private Resident resident;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            joinColumns = @JoinColumn(name = "familiar_id"),
            inverseJoinColumns = @JoinColumn(name = "visit_id")
    )
    private List<Visit> visitList = new ArrayList<>();

    public Familiar(String nombre, String apellidos, String email, String password, String dni) {
        super(nombre, apellidos, email, password);
        this.fechaAlta = LocalDate.now();
        this.dni = dni;
    }

    /*METODOS HELPERS*/

    public void addVisit(Visit v) {
        visitList.add(v);
        v.getFamiliarList().add(this);
    }

    public void removeVisit(Visit v) {
        visitList.remove(v);
        v.getFamiliarList().remove(this);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }
}
