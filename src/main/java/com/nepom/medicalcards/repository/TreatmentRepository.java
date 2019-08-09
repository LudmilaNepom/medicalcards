package com.nepom.medicalcards.repository;

import com.nepom.medicalcards.data.QTreatment;
import com.nepom.medicalcards.data.Treatment;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TreatmentRepository extends ExCustomRepository<Treatment, QTreatment, Long> {
    List<Treatment> findByStartDate(LocalDate date);
}
