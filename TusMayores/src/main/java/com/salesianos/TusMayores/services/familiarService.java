package com.salesianos.TusMayores.services;

import com.salesianos.TusMayores.model.Familiar;
import com.salesianos.TusMayores.repositories.FamiliarRepository;
import com.salesianos.TusMayores.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class familiarService extends BaseService<Familiar, Long, FamiliarRepository> {


    public familiarService(FamiliarRepository repository) { super(repository); }
}
