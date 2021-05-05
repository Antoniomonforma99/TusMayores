package com.salesianos.TusMayores.services;

import com.salesianos.TusMayores.model.Resident;
import com.salesianos.TusMayores.repositories.ResidentRepository;
import com.salesianos.TusMayores.services.base.BaseService;

import java.util.List;

public class ResidentService extends BaseService<Resident, Long, ResidentRepository> {

    public ResidentService(ResidentRepository repository) {
        super(repository);
    }

    @Override
    public List<Resident> findAll() {
        return this.repository.findAllJoin();
    }
}
