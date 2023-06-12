package com.herman87.addmapstructgradle.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private UUID id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Integer age;
}