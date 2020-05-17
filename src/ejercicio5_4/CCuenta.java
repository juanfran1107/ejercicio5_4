/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_4;

import java.util.ArrayList;

/**
 *
 * @author portatil de JuanFran
 */
public class CCuenta {
    
    String titular;
    int nroCuenta;
    int saldo;
    int limite;
    String fecha_apertura;
    ArrayList<CTarjeta>lista_tarjetas;
    
    CCuenta(String titular,int Ncuenta,int saldo, int limite, String fechaApertura,ArrayList<CTarjeta>tarjetas){
        this.titular=titular;
        this.nroCuenta=Ncuenta;
        this.saldo=saldo;
        this.limite=limite;
    }
    
    
}
