package com.salesianos.TusMayores.repositories;

import com.salesianos.TusMayores.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
