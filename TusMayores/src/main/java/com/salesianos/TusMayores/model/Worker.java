package com.salesianos.TusMayores.model;

import com.salesianos.TusMayores.model.User;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Worker extends User {

    private static final long serialVersionUID = 1L;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaAlta;

    private String nombrePuesto;

    public Worker(String nombre, String apellidos, String email, String password, String nombrePuesto) {
        super(nombre, apellidos, email, password);
        this.fechaAlta = LocalDate.now();
        this.nombrePuesto = nombrePuesto;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
    }



}
