package com.herman87.addmapstructgradle.domain;

import lombok.Data;

import java.util.UUID;

@Data
public class UserDTO {
    private UUID id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Integer age;
}
