package com.tassiajoseph;

public class NameGenerator {

    public static void main(String[] args) {
        System.out.println( generateFullName("Tassia", "Joseph") );
    }

    /* ================================================
     create a generateFullName method that takes in a
     first and last name, then returns a full name
    =================================================== */

    public static String generateFullName(String firstName, String lastName) {
        String fullName3 = firstName + " " + lastName;
        return fullName3;
    }

}
