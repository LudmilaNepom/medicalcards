package com.nepom.medicalcards.service;

import com.nepom.medicalcards.data.Doctor;
import com.nepom.medicalcards.dto.DoctorDto;

public interface DoctorService {
    Iterable<Doctor> findAll();
    void save(DoctorDto doctorDto);
}
