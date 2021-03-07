package com.company.zad1;

public class PERSON {
    String F_NAME, L_NAME;
    int DATE_OF_BIRTH;

    private void checkPERSONDATA(String F_NAME, String L_NAME, int DATE_OF_BIRTH) {
        if (F_NAME.isEmpty() == true) {
            throw new IllegalArgumentException("This space can not be blank!");
        }
        else if (L_NAME.isEmpty() == true) {
            throw new IllegalArgumentException("This space can not be blank!");
        }
        else if ((DATE_OF_BIRTH < 1900) || (DATE_OF_BIRTH > 2021)) {
            throw new IllegalArgumentException("Wrong Birth Year");
        }
    }
    public PERSON (String F_NAME, String L_NAME, int DATE_OF_BIRTH) {
        checkPERSONDATA(F_NAME, L_NAME, DATE_OF_BIRTH);
        this.F_NAME = F_NAME;
        this.L_NAME = L_NAME;
        this.DATE_OF_BIRTH = DATE_OF_BIRTH;
    }
    @Override
    public String toString(){
        return String.format("Name: %s\nLast Name: %s\nDate of Birth: %d", F_NAME, L_NAME, DATE_OF_BIRTH);
    }
}
