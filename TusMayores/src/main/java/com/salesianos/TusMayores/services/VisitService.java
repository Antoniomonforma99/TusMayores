package com.salesianos.TusMayores.services;

import com.salesianos.TusMayores.model.Visit;
import com.salesianos.TusMayores.repositories.VisitRepository;
import com.salesianos.TusMayores.services.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitService extends BaseService<Visit, Long, VisitRepository> {


    public VisitService(VisitRepository repository) {
        super(repository);
    }

}
