package com.app.demoSpark.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

@Data
@AllArgsConstructor
public class User {
    private String id;
    private String firstName;
    private String lastName;
    private Optional<String> email;
    private Optional<String> imageUrl;
    private UserBasicData userBasicData;
}
