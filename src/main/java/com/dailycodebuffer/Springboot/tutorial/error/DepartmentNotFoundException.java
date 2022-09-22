package com.dailycodebuffer.Springboot.tutorial.error;

public class DepartmentNotFoundException extends Exception{
    public DepartmentNotFoundException() {
        super();
    }

    public DepartmentNotFoundException(String message) {
        super(message);
    }

}
