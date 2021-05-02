package com.salesianos.TusMayores.model;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@Entity
public class Familiar extends User {

    private static final long serialVersionUId = 1L;

    private LocalDate fechaAlta;

    private String dni;

    public Familiar(String nombre, String apellidos, String email, String password, LocalDate fechaAlta, String dni) {
        super(nombre, apellidos, email, password);
        this.fechaAlta = fechaAlta;
        this.dni = dni;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }
}
