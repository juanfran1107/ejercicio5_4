/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_4;

/**
 *
 * @author portatil de JuanFran
 */
public class CTarjeta {
    
   private int nro_tarjeta;
   private int limiteRetirada;
    
   //CONSTRUCTOR
   
   CTarjeta(int numero, int limite){
       this.nro_tarjeta=numero;
       this.limiteRetirada=limite;
   }
   
   //GETTER Y SETTER

    public void setNro_tarjeta(int nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public void setLimite(int limite) {
        this.limiteRetirada = limite;
    }

    public int getNro_tarjeta() {
        return nro_tarjeta;
    }

    public int getLimite() {
        return limiteRetirada;
    }
   
   
   
   
}
