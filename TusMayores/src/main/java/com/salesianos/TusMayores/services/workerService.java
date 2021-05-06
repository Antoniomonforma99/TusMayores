package com.salesianos.TusMayores.services;

import com.salesianos.TusMayores.model.Worker;
import com.salesianos.TusMayores.repositories.WorkerRepository;
import com.salesianos.TusMayores.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class workerService extends BaseService<Worker, Long, WorkerRepository> {


    public workerService(WorkerRepository repository) { super(repository);}
}
