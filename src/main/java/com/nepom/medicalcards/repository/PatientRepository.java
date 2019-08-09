package com.nepom.medicalcards.repository;

import com.nepom.medicalcards.data.ChildPatient;
import com.nepom.medicalcards.data.QChildPatient;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "patients", path = "patients", itemResourceRel = "patient")
public interface PatientRepository extends ExCustomRepository<ChildPatient, QChildPatient, Long> {
}
