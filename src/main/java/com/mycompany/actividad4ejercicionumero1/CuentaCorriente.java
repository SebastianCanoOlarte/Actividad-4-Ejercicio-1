/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4ejercicionumero1;


public class CuentaCorriente extends Cuenta {
    float Sobregiro;
    
    public CuentaCorriente(float Saldo, float Tasa) {
        super(Saldo, Tasa);
        Sobregiro = 0;
    }
    public void Retirar(float Cantidad) {
        float Resultado = Saldo - Cantidad;
        if (Resultado < 0) {
            Sobregiro = Sobregiro - Resultado;
            Saldo = 0;
        } 
        else {
            super.Retirar(Cantidad); 
        }
    }
    public void Consignar(float Cantidad) {
        float Residuo = Sobregiro-Cantidad;
        if (Sobregiro>0){
            if (Residuo>0){
                Sobregiro = 0;
                Saldo = Residuo;
            }
            else{
                Sobregiro = -Residuo;
                Saldo = 0;
            }
        }
        else{
            super.Consignar(Cantidad);
        }
        
    }
    public void ExtractoMensual() {
        super.ExtractoMensual();
    }
    public void Print() {
        System.out.println("Saldo = $"+ Saldo);
        System.out.println("Cargo mensual = $ " + ComisionMensual);
        System.out.println("Número de transacciones = " + (NumeroConsignaciones + NumeroRetiros));
        System.out.println("Valor de sogregiro = $" + Sobregiro);
        System.out.println();
    }
}
