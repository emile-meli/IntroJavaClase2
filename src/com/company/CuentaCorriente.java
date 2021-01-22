package com.company;

public class CuentaCorriente {

    private String nombreTitular;
    private double saldo;

    public CuentaCorriente(){
    }

    public CuentaCorriente(String nombreTitular, double saldo){
        setNombreTitular(nombreTitular);
        setSaldo(saldo);
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente){
        setNombreTitular(cuentaCorriente.getNombreTitular());
        setSaldo(cuentaCorriente.getSaldo());
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void ingreso(double monto){
        if(monto > 0) {
            setSaldo(getSaldo() + monto);
        }
    }

    public void egreso(double monto){
        if(monto > 0){
            setSaldo(getSaldo() - monto);
        }
    }

    public void reintegro(double monto){
        if(monto > 0) {
            setSaldo(getSaldo() + monto);
        }
    }

    public void transferencia(CuentaCorriente cuentaCorrienteATransferir, double montoATransferir){
        egreso(montoATransferir);
        cuentaCorrienteATransferir.ingreso(montoATransferir);
    }
}
