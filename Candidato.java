package ejercito;

/**
 * Clase Candidato. Esta clase es usada para dar forma a los datos que se 
 * leen desde el archivo candidatos.txt
 * Cada linea del archivo leido se transforma en un objeto Candidato
 * usando este constructor y obteniendo estos métodos.
 *
 * @author Tomas
 */
public class Candidato {

    private String dni;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private double notaMedia;
    private String preferencia1;
    private String preferencia2;
    private String preferencia3;
    private String destino;
    
    
    public Candidato(String dni, String Nombre, String Apellido, 
                    String FechaNacimiento, double NotaMedia, String Preferencia1,
                    String Preferencia2, String Preferencia3, String Destino) {
        this.dni = dni;
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.fechaNacimiento = FechaNacimiento;
        this.notaMedia = NotaMedia;
        this.preferencia1 = Preferencia1;
        this.preferencia2 = Preferencia2;
        this.preferencia3 = Preferencia3;
        this.destino = Destino;
    }
    
    
    public String getDni() { return dni;  }
    public void setDni(String dni) { this.dni = dni;   }

    public String getNombre() {  return nombre;   }
    public void setNombre(String Nombre) {  this.nombre = Nombre; }

    public String getApellido() {  return apellido;  }
    public void setApellido(String Apellido) {  this.apellido = Apellido;  }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String FechaNacimiento) { this.fechaNacimiento = FechaNacimiento;   }

    public double getNotaMedia() {   return notaMedia;     }
    public void setNotaMedia(double NotaMedia) {   this.notaMedia = NotaMedia;  }

    public String getPreferencia1() {       return preferencia1;    }
    public void setPreferencia1(String Preferencia1) {           this.preferencia1 = Preferencia1;      }

    public String getPreferencia2() {        return preferencia2;    }
    public void setPreferencia2(String Preferencia2) {           this.preferencia2 = Preferencia2;    }

    public String getPreferencia3() {     return preferencia3;     }
    public void setPreferencia3(String Preferencia3) {    this.preferencia3 = Preferencia3;   }
    
    public String getDestino() {  return destino;   }
    public void setDestino(String Destino) {   this.destino = Destino;    }
    
    /**
     * Método toString sobreescrita para leer los datos de cada candidato 
     * por pantalla
     * @return 
     */
    @Override
    public String toString () {
        return "DNI: " + dni + " Nombre: " + nombre + " Apellido: " + apellido 
                + " Fecha de Nacimiento: " + fechaNacimiento
                + " Nota Media: " + notaMedia 
                + " Preferencias: " + preferencia1+" "+preferencia2+" "+preferencia3
                + " Destino: " + destino;
    }
}