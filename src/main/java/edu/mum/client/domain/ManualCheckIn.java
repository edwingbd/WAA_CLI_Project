package edu.mum.client.domain;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ManualCheckIn {
    private String  strDate;
    private Date date;
    private String barcode;
    private String name;
}
