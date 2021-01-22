package com.company;

public class Contador {

    private int cont = 0;

    public Contador() {
    }

    public Contador(int cont) {
        setCont(cont);
    }

    public Contador(Contador contador){
        setCont(contador.getCont());
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void incrementar(){
        setCont(getCont() + 1);
    }

    public void decrementar(){
        setCont(getCont() - 1);
    }
}
