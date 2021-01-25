package com.company;

public class IntermediatePassword extends Password{

    public IntermediatePassword(){
        super("^(?=.*[a-z])(?=.*[A-Z])[a-zA-Z]{8,}$");
    }
}
