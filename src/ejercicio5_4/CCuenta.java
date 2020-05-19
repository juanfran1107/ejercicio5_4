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
    
   private String titular;
   private int nroCuenta;
   private int saldo;
   private int limite;
   private String fecha_apertura;
   private ArrayList<CTarjeta>lista_tarjetas;
    
   //CONSTRUCTOR
   
    CCuenta(String titular,int Ncuenta,int saldo, int limite, String fechaApertura,ArrayList<CTarjeta>tarjetas){
        this.titular=titular;
        this.nroCuenta=Ncuenta;
        this.saldo=saldo;
        this.limite=limite;
        this.fecha_apertura=fechaApertura;
        this.lista_tarjetas=tarjetas;
    }

    //GETTER Y SETTER
    
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void setFecha_apertura(String fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public void setLista_tarjetas(ArrayList<CTarjeta> lista_tarjetas) {
        this.lista_tarjetas = lista_tarjetas;
    }

    public String getTitular() {
        return titular;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getLimite() {
        return limite;
    }

    public String getFecha_apertura() {
        return fecha_apertura;
    }

    public ArrayList<CTarjeta> getLista_tarjetas() {
        return lista_tarjetas;
    }
    
    
    
}
