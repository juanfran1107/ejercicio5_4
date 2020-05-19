
package ejercicio5_4;

import java.util.ArrayList;

/**
 *
 * @author portatil de JuanFran
 */
public class EJERCICIO5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String nom, String ape, int edad, String dni, String direccion, int telefono, ArrayList<CCuenta> cuentas
        //CCuenta(String titular,int Ncuenta,int saldo, int limite, String fechaApertura,ArrayList<CTarjeta>tarjetas)
        //CTarjeta(int numero, int limiteRetirada)
        ArrayList<CCuenta>cuentasCliente1=new ArrayList();
        ArrayList<CTarjeta>tarjetasCliente1=new ArrayList();
        CTarjeta tarjeta1Cliente1=new CTarjeta(1112,1500);
        tarjetasCliente1.add(tarjeta1Cliente1);
        CCuenta cuenta1Cliente1=new CCuenta("juanfran",23451112,10000,30000,"19/05/2020",tarjetasCliente1);
        cuentasCliente1.add(cuenta1Cliente1);
        
        
        CGestor gestor=new CGestor(11);
        CCliente cliente1=new CCliente("juanfran","salgado",27,"12345678A","C/Manzano",654735465,cuentasCliente1);
        
        cliente1.retirarDinero(cuenta1Cliente1, 0, 1000);
        cliente1.verDatosCuenta(cuenta1Cliente1);
        System.out.println(cliente1.mostrarDatos());
        //gestor.ModificarCuentaCliente(cliente1, cliente1.getLista_cuentas().get(0));
        System.out.println(cliente1.mostrarDatos());
        cliente1.verMediaUltimoAño();
    }
    
}
