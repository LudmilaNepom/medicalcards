package com.nepom.medicalcards.data;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table
public class ChildPatient extends Person {
    @ManyToMany
    private List<Person> parents;
}
