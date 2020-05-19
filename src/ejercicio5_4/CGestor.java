/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_4;
import java.util.Scanner;
/**
 *
 * @author portatil de JuanFran
 */
public class CGestor {
    private int nro_emp;
    
    
    //CONSTRUCTOR
    
    CGestor(int nemp){
        this.nro_emp=nemp;
    }
    
    //GETTER Y SETTER

    public void setNro_emp(int nro_emp) {
        this.nro_emp = nro_emp;
    }
    
    public int getNro_emp() {
        return nro_emp;
    }
    
    public void ModificarCuentaCliente(CCliente cliente,CCuenta cuenta){
        Scanner sc=new Scanner(System.in);
        System.out.println("--¿Que quiere modificar?--"
                            + "\n1. Modificar Cliente"
                            + "\n2. Modificar Cuenta");
        int decision=sc.nextInt();sc.nextLine();
            switch(decision){
                case 1: System.out.println("Nueva direccion :");
                        String nuevaDireccion=sc.next();
                        cliente.setNombre(nuevaDireccion);
                        System.out.println("Nuevo telefono");
                        int nuevoTelefono=sc.nextInt();sc.nextLine();
                        cliente.setTelefono(nuevoTelefono);
                        break;
                        
                case 2:
                        System.out.println("Nuevo limite:");
                        int nuevoLimite=sc.nextInt();
                        cuenta.setLimite(nuevoLimite);
                        break;
            }
    }
    
    
    
}
