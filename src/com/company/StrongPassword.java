package com.company;

public class StrongPassword extends Password{

    public StrongPassword() {
        super("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$%&@!#?*+])[a-zA-Z\\d$%&@!#?*+]{8,}$");
    }

}
