package com.salesianos.TusMayores.repositories;

import com.salesianos.TusMayores.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisitRepository extends JpaRepository<Visit, Long> {

    List<Visit> userVisits(long id);
}
