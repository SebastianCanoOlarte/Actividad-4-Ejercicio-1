/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4ejercicionumero1;


public class CuentaAhorro extends Cuenta {
    private boolean Activa;
    
    public CuentaAhorro(float Saldo, float Tasa) {
        super(Saldo, Tasa);
        if(Saldo<10000){
            Activa = false;
        }
        else{
            Activa = true;
        }
    }
    public void Retirar(float Cantidad) {
        if(Activa){
            super.Retirar(Cantidad);
        }
    }
    public void Consignar(float Cantidad) {
        if (Activa){
            super.Consignar(Cantidad);
        }
    }
    public void ExtractoMensual() {
        if(NumeroRetiros>4){
            ComisionMensual += (NumeroRetiros-4)*1000;
        }
        super.ExtractoMensual();
        if(Saldo<10000){
            Activa = false;
        }
    }
    public void Print(){
        System.out.println("Saldo = $"+Saldo);
        System.out.println("Comision mensual = $"+ComisionMensual);
        System.out.println("Número de transacciones = " + (NumeroConsignaciones + NumeroRetiros));
        System.out.println();
    }
}
