package com.springmvc_demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.LinkedHashMap;

@AllArgsConstructor
@Data
public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String,String> countryOption;
    private String favoriteLanguage;
    private String[] operationSystems;

    public Student(){
        countryOption = new LinkedHashMap<>();
        countryOption.put("BR","Brazil");
        countryOption.put("FR","France");
        countryOption.put("DE","Germany");
        countryOption.put("IN","India");
        countryOption.put("US","United States of America");
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
}
