/*
 
 */
package estructurasdedatos.estructuraVector;

/**
 *
 * @author Juan David Naranjo A.
 */
public class Vector {
    private int tamaño;
    private String[] vector;
    
    
    
    public boolean crearVector(int t){
        boolean salida=true;
        if(this.vector==null)
        {
            this.vector=new String[this.tamaño];
            System.out.print("Se ha creado satisfactoriamiente\n");            
        }
        else
        {
            System.out.print("No se ha podido crear\n");
            salida=false;
        }
        return salida;
    }   
    
    public void insertarDato(String dato, int pos){
        this.vector[pos]=dato;
        
    }
    

}

