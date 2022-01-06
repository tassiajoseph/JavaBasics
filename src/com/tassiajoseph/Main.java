package com.tassiajoseph;

public class Main {

    public static void main(String[] args) {
	    String firstName = "Tassia";
        String lastName = "Joseph";
        String fullName1 = firstName + " " + lastName;
        System.out.println( fullName1 );

        System.out.println( createFullName("Tassia", "Joseph") );
    }

    // createFullName method
    public static String createFullName(String firstName, String lastName) {
        String fullName2 = firstName + " " + lastName;
        return fullName2;
    }

}
