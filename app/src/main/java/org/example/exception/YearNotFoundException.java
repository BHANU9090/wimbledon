package org.example.exception;

public class YearNotFoundException extends RuntimeException {

    public YearNotFoundException(int year) {
        super("No Wimbledon final data found for year: " + year);
    }
}
