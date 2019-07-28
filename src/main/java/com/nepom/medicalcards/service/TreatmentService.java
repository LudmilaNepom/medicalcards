package com.nepom.medicalcards.service;

import com.nepom.medicalcards.data.Treatment;
import java.util.List;

public interface TreatmentService {
    List<Treatment> getByStartDate(String startDate);
}
