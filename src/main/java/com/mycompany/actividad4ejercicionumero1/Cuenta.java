/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4ejercicionumero1;


public class Cuenta {
    protected float Saldo;
    protected int NumeroConsignaciones = 0;
    protected int NumeroRetiros = 0;
    protected float TasaAnual;
    protected float ComisionMensual = 0;
    
    public Cuenta(float Saldo, float TasaAnual) {
        this.Saldo = Saldo;
        this.TasaAnual = TasaAnual;
    }
    
    public void Consignar(float Cantidad) {
        Saldo = Saldo + Cantidad;
        NumeroConsignaciones = NumeroConsignaciones + 1;
    }
    public void Retirar(float cantidad) {
        float NuevoSaldo = Saldo - cantidad;
        if (NuevoSaldo >= 0) {
            Saldo -= cantidad;
            NumeroRetiros = NumeroRetiros + 1;
        } 
        else {
            System.out.println("La cantida a retirar excede el saldo actual");
        }
    }
    public void CalcularInteres() {
        float TasaMensual = TasaAnual / 12; 
        float interesMensual = Saldo * TasaMensual;
        Saldo += interesMensual; 
    }
    public void ExtractoMensual() {
        Saldo -= ComisionMensual;
        CalcularInteres();
    }
}
