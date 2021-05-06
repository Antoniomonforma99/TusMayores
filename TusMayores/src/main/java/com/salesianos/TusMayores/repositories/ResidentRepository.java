package com.salesianos.TusMayores.repositories;

import com.salesianos.TusMayores.model.Resident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResidentRepository extends JpaRepository<Resident, Long> {

    /*@Query("select distinct r from Resident r join fetch r.familiarList")
    List<Resident> findAllJoin();*/
}
