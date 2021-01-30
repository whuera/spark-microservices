package com.app.demoSpark.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Card {
    private int idCard;
    private String codeCard;
    private String typeCard;
}
