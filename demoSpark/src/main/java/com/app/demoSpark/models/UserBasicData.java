package com.app.demoSpark.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserBasicData {
    private int IdUserData;
    private String typeIdentification;
    private String numberIdentification;
    private String genero;
    private int age;
}
