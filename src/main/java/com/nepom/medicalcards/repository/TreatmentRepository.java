package com.nepom.medicalcards.repository;

import com.nepom.medicalcards.data.Treatment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TreatmentRepository extends CrudRepository<Treatment, Long> {
    List<Treatment> findByStartDate(LocalDate date);
}
