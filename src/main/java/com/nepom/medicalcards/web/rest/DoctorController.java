package com.nepom.medicalcards.web.rest;

import com.nepom.medicalcards.data.Doctor;
import com.nepom.medicalcards.dto.DoctorDto;
import com.nepom.medicalcards.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @RequestMapping(method= RequestMethod.GET, value="/")
    public Iterable<Doctor> getAllReservationsForDate(){
        return this.doctorService.findAll();
    }

    @RequestMapping(method= RequestMethod.POST, value="/")
    @ResponseStatus(HttpStatus.CREATED)
    public void createDoctor(@RequestBody @Validated DoctorDto doctorDto){
        doctorService.save(doctorDto);
    }

}
