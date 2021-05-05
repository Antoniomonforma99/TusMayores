package com.salesianos.TusMayores.controllers;

import com.salesianos.TusMayores.services.UserService;
import com.salesianos.TusMayores.services.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class VisitController {

    @Autowired
    VisitService visitService;
    @Autowired
    UserService userService;
}
