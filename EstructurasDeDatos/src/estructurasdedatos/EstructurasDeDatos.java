/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import estructurasdedatos.estructuraobjeto.Persona;

/**
 *
 * @author utp
 */
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
    
            Persona juan = new Persona();
            juan.setNombre("Juan Thompson");
            juan.setDireccion("orange");
            System.out.println("Nombre: " + juan.getNombre() + " Dirección: " + juan.getDireccion());
                       
    
    }
    
}
