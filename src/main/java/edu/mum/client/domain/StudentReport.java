package edu.mum.client.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StudentReport {
    private List<DatePresent> datePresentList;

    private  int sessionsInBlock;
    private int daysPresent;
    private int PercentageAttended;
    private double extraCredit;

    private int totalSessionPossible;
    private int totalSessionAttended;
    private int percentageTotalAttended;

    private String selectBlock;

}
