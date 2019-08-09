package com.nepom.medicalcards.data;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Size(max = 255)
    private String firstName;
    @Size(max = 255)
    private String lastName;
    @Pattern(regexp="(^$|[0-9]{10})")
    private String phoneNumber;
    @Past
    private LocalDate birthday;
}
