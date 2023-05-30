/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad4ejercicionumero1;

import java.util.*;

public class Actividad4EjercicioNumero1 {

    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("escriba: `1` para cuenta ahorros o `2` para cuenta corriente");
      int numero = input.nextInt();
      
      if (numero ==1){
          System.out.println("Cuenta de ahorros");
          System.out.println("Ingrese saldo inicial= $");
          float SaldoInicialAhorros = input.nextFloat();
          System.out.print("Ingrese tasa de interés= ");
          float TasaAhorros = input.nextFloat();
          CuentaAhorro cuenta1 = new CuentaAhorro(SaldoInicialAhorros, TasaAhorros);
          System.out.print("Ingresar cantidad a consignar: $");
          float CantidadDepositar = input.nextFloat();
          cuenta1.Consignar(CantidadDepositar);
          System.out.print("Ingresar cantidad a retirar: $");
          float CantidadRetirar = input.nextFloat();
          cuenta1.Retirar(CantidadRetirar);
          cuenta1.ExtractoMensual();
          cuenta1.Print();
      }
      else if(numero ==2){
          System.out.println("Cuenta Corriente");
          System.out.println("Ingrese saldo inicial= $");
          float SaldoInicialCorriente = input.nextFloat();
          System.out.print("Ingrese tasa de interés= ");
          float TasaCorriente = input.nextFloat();
          CuentaCorriente cuenta2 = new CuentaCorriente(SaldoInicialCorriente, TasaCorriente);
          System.out.print("Ingresar cantidad a consignar: $");
          float CantidadDepositar2 = input.nextFloat();
          cuenta2.Consignar(CantidadDepositar2);
          System.out.print("Ingresar cantidad a retirar: $");
          float CantidadRetirar2 = input.nextFloat();
          cuenta2.Retirar(CantidadRetirar2);
          cuenta2.ExtractoMensual();
          cuenta2.Print();
      }
    }
}
