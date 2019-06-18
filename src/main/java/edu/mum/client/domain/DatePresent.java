package edu.mum.client.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class DatePresent {
    private LocalDate date;
    private boolean isPresent;
}
