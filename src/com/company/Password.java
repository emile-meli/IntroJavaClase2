package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    String regex;
    String pwd = "";

    public Password(){

    }

    public Password(String regex) {
        this.regex = regex;
    }

    public void setPwd(String pwd) {
        if(regex.equals("")) throw new RuntimeException("Debe setearse la regex de la contrseña");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pwd);
        if(matcher.matches() && !this.pwd.equals(pwd)){
            this.pwd = pwd;
        }else{
            throw  new RuntimeException("La contraseña no es valida");
        }

    }
}
