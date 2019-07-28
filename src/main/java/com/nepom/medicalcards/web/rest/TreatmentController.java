package com.nepom.medicalcards.web.rest;

import com.nepom.medicalcards.data.Treatment;
import com.nepom.medicalcards.service.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/treatments")
public class TreatmentController {

    @Autowired
    private TreatmentService reservationService;

    @RequestMapping(method= RequestMethod.GET, value="/{date}")
    public List<Treatment> getAllReservationsForDate(@PathVariable(value="date")String dateString){
        return this.reservationService.getByStartDate(dateString);
    }
}
