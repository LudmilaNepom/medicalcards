package com.nepom.medicalcards.service.impl;

import com.nepom.medicalcards.data.Treatment;
import com.nepom.medicalcards.repository.TreatmentRepository;
import com.nepom.medicalcards.service.TreatmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor(onConstructor=@__(@Autowired))
@Service
public class TreatmentServiceImpl implements TreatmentService {

    private final TreatmentRepository treatmentRepository;

    @Override
    public List<Treatment> getByStartDate(String startDate) {
        try {
            LocalDate formattedDate = LocalDate.parse(startDate);
            return treatmentRepository.findByStartDate(formattedDate);
        } catch (DateTimeParseException e){
            return Collections.emptyList();
        }
    }
}
