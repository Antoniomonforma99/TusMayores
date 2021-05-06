package com.salesianos.TusMayores.controllers;

import com.salesianos.TusMayores.model.Resident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.salesianos.TusMayores.services.residentService;

@Controller
@RequestMapping("/admin/resident")
public class ResidentControllerAdmin {

    @Autowired
    residentService residentService;

    //listado

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("residentList", residentService.findAll());
        return "admin/list-resident";
    }

    //borrado
    @GetMapping("/delete/{id}")
    public String removeResident(@PathVariable("id") long id) {
        residentService.deleteById(id);
        return "redirect:/admin/resident";
    }

    //Nuevo residente

    @GetMapping("/new")
    public String newResident(Model model) {
        model.addAttribute("resident", new Resident());
        return "admin/form-resident" ;
    }


    @PostMapping("/new/submit")
    public String submitNewResident(@ModelAttribute("resident") Resident resident) {
        residentService.save(resident);
        return "redirect:/admin/resident/";
    }
}
