package com.nepom.medicalcards.data;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table
public class Treatment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDate appointmentDate;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne
    private Doctor doctor;
    @ManyToOne
    private ChildPatient patient;
    @ElementCollection(targetClass=Procedure.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name="PROCEDURES")
    private List<Procedure> procedures;
}
