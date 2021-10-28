package com.example.demo;

public class Analysis {
    private long upperCase;
    private String stringToCheck;
    private long lowerCase;

    public Analysis(String stringToCheck) {
        this.stringToCheck = stringToCheck;
    }
    private void countUpperCase(String inputString) {
        upperCase = inputString.chars().filter((s)->Character.isUpperCase(s)).count();
    }

    private  void  countLowerCase(String inputString) {
        lowerCase = inputString.chars().filter((s)->Character.isLowerCase(s)).count();
    }
}
