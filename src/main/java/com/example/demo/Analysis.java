package com.example.demo;

public class Analysis {
    private long upperCase;
    private String stringToCheck;
    private long lowerCase;
    private long countNumber;
    private long specialMarks;

    public Analysis(String stringToCheck) {
        this.stringToCheck = stringToCheck;
        this.countUpperCase();
        this.countLowerCase();
        this.countNumberCase();
    }
    private void countUpperCase() {
        upperCase = stringToCheck.chars().filter((s)->Character.isUpperCase(s)).count();
    }
    private  void  countLowerCase() {
        lowerCase = stringToCheck.chars().filter((s)->Character.isLowerCase(s)).count();
    }
    private  void  countNumberCase() {
        countNumber = stringToCheck.chars().filter((s)->Character.isDigit(s)).count();
    }
    private  void  countspecialMarksCase() {

        specialMarks = 0;
        for (int i = 0; i < stringToCheck.length(); i++) {
            if (stringToCheck.substring(i, i + 1).matches("[^A-Za-z0-9]")) {
                specialMarks++;
            }
        }
    }

}
