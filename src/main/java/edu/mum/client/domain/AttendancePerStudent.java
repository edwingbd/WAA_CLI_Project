package edu.mum.client.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class AttendancePerStudent {
    private int daysPresent;
    private int percentageAttendant;
    private int avilableDays;
}
