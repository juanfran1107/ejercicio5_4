/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_4;

import java.util.ArrayList;
import java.util.Scanner;

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
    private ArrayList<CCuenta> lista_cuentas;
    private final int [] SALDOULTIMOAÑO=new int [11];
        

    //CONSTRUCTOR
    CCliente(String nom, String ape, int edad, String dni, String direccion, int telefono, ArrayList<CCuenta> cuentas) {
        this.nombre = nom;
        this.apellido = ape;
        this.edad = edad;
        this.DNI = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.lista_cuentas = cuentas;
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
    public void ingresarDinero(CCuenta cuenta, int cantidad) {

        cuenta.setSaldo(cuenta.getSaldo() + cantidad);
        System.out.println("--El dinero ha sido ingresado correctamente--");

    }

    public void retirarDinero(CCuenta cuenta, int tarjeta, int cantidad) {
        Scanner sc = new Scanner(System.in);
        int resultado;
        if (cuenta.getSaldo() > 0) {
                resultado = cuenta.getSaldo() - cantidad;
                if (resultado >= 0) {
                    if (cantidad < cuenta.getLista_tarjetas().get(tarjeta).getLimite()) {
                        cuenta.setSaldo(cuenta.getSaldo() - cantidad);
                        System.out.println("--El dinero ha sido retirado correctamente--");
                    } else {
                        System.out.println("--Limite de tarjeta sobrepasado,empiece de nuevo--");
                       
                    }
                }
                else{
                    System.out.println("No se puede sacar tanto dinero de esta cuenta.");
                }
                
        } else {
            System.out.println("--La cuenta no tiene saldo.--");
        }

    }

    public void verDatosCuenta(CCuenta cuenta){
        System.out.println("Titular: "+cuenta.getTitular()+"\n"+
                           "Numero de cuenta: "+cuenta.getNroCuenta()+"\n"+
                           "Saldo total: "+cuenta.getSaldo()+"\n"+
                           "Fecha de Apertura: "+cuenta.getFecha_apertura());
    }
    
    public void verMediaUltimoAño(){
        for (int i = 0; i < this.SALDOULTIMOAÑO.length; i++) {
            this.SALDOULTIMOAÑO[i]=(int)(Math.random()*10000);
        }
        
        int totalAnio=0;
        int mediaAnio=0;
        
        for (int i = 0; i < this.SALDOULTIMOAÑO.length; i++) {
            totalAnio+=this.SALDOULTIMOAÑO[i];
        }
        
        mediaAnio=totalAnio/12;
        
        System.out.println("La media del ultimo año es de: "+mediaAnio+" euros");
    }
    
    public String mostrarDatos(){
        return "Datos actualizados: "+ direccion+"--"+telefono;
    }
    
}
