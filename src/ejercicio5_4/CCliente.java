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
public class CCliente {
    
   private String nombre;
   private String apellido;
   private String direccion;
   private String DNI;
   private int telefono;
   private int edad;
   private ArrayList<CCuenta>lista_cuentas;
    
    //CONSTRUCTOR
    CCliente(String nom,String ape,int edad, String dni,String direccion, int telefono,ArrayList<CCuenta>cuentas){
        this.nombre=nom;
        this.apellido=ape;
        this.edad=edad;
        this.DNI=dni;
        this.direccion=direccion;
        this.telefono=telefono;
        this.lista_cuentas=cuentas;
    }
    
    
    
    //GETTER Y SETTER

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setLista_cuentas(ArrayList<CCuenta> lista_cuentas) {
        this.lista_cuentas = lista_cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<CCuenta> getLista_cuentas() {
        return lista_cuentas;
    }
    
    //RESTO DE METODOS
    
    
    
    
}
