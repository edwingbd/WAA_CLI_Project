package edu.mum.client.domain;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class Entry {
    private long id;

//    @NotEmpty
//    @Size(min = 2, max = 50, message = "${Size.name}")
    private String name;
}
