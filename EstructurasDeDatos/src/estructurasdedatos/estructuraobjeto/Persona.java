/*
 * Fecha: 22/02/2017.  Primer clase hecha, se crea la Clase Persona. 
 * Clase persona: plantilla donde se instancia el objeto de tipo persona. 
 * Instancia: variable en la que se almacenan los atributos y metodos que tiene el objeto


 */

//Definiendo el paquete donde esta la clase.
package estructurasdedatos.estructuraobjeto;

/**
 *
 * @author Juan David Naranjo Agudelo.
 */

//La firma de la clase
public class Persona {
    
    private String nombre;
    private int cedula=1088295336;
    private String direccion;
    private String telefono;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        //codifico las reglas de negocio
        //para cambiar un atributo
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
