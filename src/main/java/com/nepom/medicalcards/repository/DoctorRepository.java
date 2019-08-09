package com.nepom.medicalcards.repository;

import com.nepom.medicalcards.data.Doctor;
import com.nepom.medicalcards.data.QDoctor;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends ExCustomRepository<Doctor, QDoctor, Long> {
    Doctor findByLastName(String lastName);
}
