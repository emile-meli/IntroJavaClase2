package com.company;

public class SimplePassword extends Password{

    public SimplePassword() {
        super("^.{8,}$");
    }
}
