package com.nepom.medicalcards.repository;

import com.nepom.medicalcards.data.ChildPatient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<ChildPatient, Long> {
}
