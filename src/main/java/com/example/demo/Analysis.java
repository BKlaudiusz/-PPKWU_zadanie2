package com.example.demo;

public class Analysis {
    private long upperCase;
    private String stringToCheck;
    private long lowerCase;
    private long countNumber;

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

    @Override
    public String toString() {
        return "Analysis{" +
                "upperCase=" + upperCase +
                ", stringToCheck='" + stringToCheck + '\'' +
                ", lowerCase=" + lowerCase +
                ", countNumber=" + countNumber +
                '}';
    }
}
