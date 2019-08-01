package com.nepom.medicalcards.service.impl;

import com.nepom.medicalcards.data.Doctor;
import com.nepom.medicalcards.dto.DoctorDto;
import com.nepom.medicalcards.repository.DoctorRepository;
import com.nepom.medicalcards.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor(onConstructor=@__(@Autowired))
@Service
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;

    @Override
    public Iterable<Doctor> findAll() {
        return doctorRepository.findAll();
    }

    @Override
    public void save(DoctorDto doctorDto) {
        Doctor doctor = new Doctor();
        doctor.setKvalification(doctorDto.getKvalification());
        doctor.setBirthday(doctorDto.getBirthday());
        doctor.setFirstName(doctorDto.getFirstName());
        doctor.setLastName(doctorDto.getLastName());
        doctor.setPhoneNumber(doctorDto.getPhoneNumber());
        doctorRepository.save(doctor);
    }
}
