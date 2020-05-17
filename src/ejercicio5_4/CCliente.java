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
    
    String nombre;
    String apellido;
    String direccion;
    String DNI;
    int telefono;
    int edad;
    ArrayList<CCuenta>lista_cuentas;
    
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
    
    
    //METODOS
    
    
}
