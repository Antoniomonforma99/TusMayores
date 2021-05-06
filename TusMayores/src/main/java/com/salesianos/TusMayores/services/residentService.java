package com.salesianos.TusMayores.services;

import com.salesianos.TusMayores.model.Resident;
import com.salesianos.TusMayores.repositories.ResidentRepository;
import com.salesianos.TusMayores.services.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class residentService extends BaseService<Resident, Long, ResidentRepository> {

    public residentService(ResidentRepository repository) {
        super(repository);
    }

}
