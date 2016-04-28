package ejercito;

/**
 * Clase Puesto. Esta clase es usada para dar forma a los datos que se 
 * leen desde el archivo puestos.txt
 * Cada linea del archivo leido se transforma en un objeto Puesto
 * usando este constructor y obteniendo estos métodos.
 */
public class Puesto {

    private String codigo;
    private String nombre_unidad;
    private String localidad;
    private boolean disponible;

    public Puesto(String codigo, String nombre_unidad, String localidad, boolean disponible) {
        this.codigo = codigo;
        this.nombre_unidad = nombre_unidad;
        this.localidad = localidad;
        this.disponible = disponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre_unidad() {
        return nombre_unidad;
    }

    public void setNombre_unidad(String nombre_unidad) {
        this.nombre_unidad = nombre_unidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public boolean getDisponible() {
        return disponible;
    }
    /**
     * Método toString sobreescrito para leer los datos de cada puesto
     * por pantalla
     * @return  
     */
    @Override
    public String toString () {
        return "Codigo: " + codigo + " Nombre de unidad: " + nombre_unidad 
                + " Localidad: " + localidad + " disponible: " + disponible;
    }
  
    
}
