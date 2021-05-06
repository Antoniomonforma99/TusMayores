package com.salesianos.TusMayores.controllers;

import com.salesianos.TusMayores.model.Resident;
import com.salesianos.TusMayores.model.Visit;
import com.salesianos.TusMayores.services.visitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/admin/visit/")
public class VisitControllerAdmin {

    @Autowired
    visitService visitService;

    //listado
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("visitList", visitService.findAll());
        return "admin/list-visit";
    }

    //Nueva visita
    @GetMapping("/new")
    public String newVisit(Model model) {
        model.addAttribute("visit", new Visit());
        return "admin/form-visit" ;
    }

    @PostMapping("/new/submit")
    public String submitNewVisit(@ModelAttribute("visit") Visit visit) {
        visitService.save(visit);
        return "redirect:/admin/visit/";
    }

    //borrado
    @GetMapping("/delete/{id}")
    public String removeVisit(@PathVariable("id") long id) {
        visitService.deleteById(id);
        return "redirect:/admin/visit";
    }
}
