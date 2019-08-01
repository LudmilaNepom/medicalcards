package com.nepom.medicalcards.data;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum  Procedure {
    APPARATE_1(5, 10),
    APPARATE_2(15, 10),
    APPARATE_3(10, 10);

    private int duration;
    private int numbrerOfProcedures;
}
