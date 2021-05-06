package com.salesianos.TusMayores.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class VisitController {

    @Autowired
    com.salesianos.TusMayores.services.visitService visitService;
    @Autowired
    com.salesianos.TusMayores.services.userService userService;


}
