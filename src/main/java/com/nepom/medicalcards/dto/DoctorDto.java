package com.nepom.medicalcards.dto;

import com.nepom.medicalcards.data.Kvalification;
import lombok.*;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDto {
    private Long id;
    @Size(max = 255)
    private String firstName;
    @Size(max = 255)
    private String lastName;
    @Pattern(regexp="(^$|[0-9]{10})")
    private String phoneNumber;
    @Past
    private LocalDate birthday;
    @NotNull
    private Kvalification kvalification;
}
