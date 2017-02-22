/*
Fecha: 22/02/2017
Clase Vehiculo.  
 */
package programa;

import vehiculo.Carro;

/**
 *
 * @author Juan David Naranjo Agudelo
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
    
            Carro carrito = new Carro();
            carrito.setPlaca("ABC322");
            carrito.setModelo("Renault4");
            carrito.setNumeroSoat("12aaa");
            carrito.setColor("Rojoblancuzcoverde");
            
            System.out.println("Placa: " + carrito.getPlaca() + 
                               " Modelo: " + carrito.getModelo() + 
                               " Soat: " + carrito.getNumeroSoat() + 
                               " Color: " + carrito.getColor());           
    }
    
}