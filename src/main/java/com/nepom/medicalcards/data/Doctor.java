package com.nepom.medicalcards.data;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table
public class Doctor extends Person {
    private Kvalification kvalification;
}
