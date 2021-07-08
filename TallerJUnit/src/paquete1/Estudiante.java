
package paquete1;

public class Estudiante {
    // 1.  Declarar
    // se declaran datos o atributos con visibilidad protegido
    // # nombresEstudiante: Cadena
    protected String nombresEstudiante;
    // # apellidosEstudiante: Cadena
    protected String apellidosEstudiante;
    // # identificacionEstudiante: Cadena
    protected String identificacionEstudiante;
    // # edadEstudiante: Entero
    protected int edadEstudiante;
    
    public void establecerNombresEstudiante(String n){
        nombresEstudiante = n;
    }
    
    public void establecerApellidoEstudiante(String a){
        apellidosEstudiante = a;
    }
    
    public void establecerIdentificacionEstudiante(String i){
        identificacionEstudiante = i;
    }
    
    public String obtenerNombresEstudiante(){
        return nombresEstudiante;
    }
    
    public String obtenerApellidoEstudiante(){
        return apellidosEstudiante;
    }
    
    public String obtenerIdentificacionEstudiante(){
        return identificacionEstudiante;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre Estudiante: %s %s\nCédula: %s",
                obtenerNombresEstudiante(),
                obtenerApellidoEstudiante(),
                obtenerIdentificacionEstudiante());
        return cadena;
    }

}
